package algorithms.chapter10;

public class List {

    private Node head;

    private Node search(int key) {
        Node ptr = head;
        while (null != ptr && ptr.key != key) {
            ptr = ptr.next;
        }
        return ptr;
    }

    void insert(int key) {
        Node node = new Node();
        node.key = key;
        node.next = head;
        if (null != head) {
            head.prev = node;
        }
        head = node;
        node.prev = null;
    }

    void delete(int key) {
        Node node = search(key);
        if (null != node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            } else {
                head = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ptr = head;
        while (null != ptr) {
            sb.append(ptr.toString());
            sb.append(" ");
            ptr = ptr.next;
        }
        return sb.toString();
    }

    private class Node {
        Node next;
        Node prev;
        int key;

        @Override
        public String toString() {
            return "key [" + key + "]";
        }
    }

    public static void main(String[] args) {
        List list = new List();
        for (int i = 0; i < 100; i++) {
            list.insert(i);
        }
        System.out.println("List: " + list);
        for (int i = 0; i < 100; i++) {
            list.delete(i);
        }
        System.out.println("List: " + list);
    }
}
