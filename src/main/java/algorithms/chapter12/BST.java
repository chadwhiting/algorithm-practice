package algorithms.chapter12;

public class BST<T> {

    private Node root;

    void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node x) {
        if (null != x) {
            printInOrder(x.left);
            System.out.println(x.key);
            printInOrder(x.right);
        }
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node x) {
        if (null != x) {
            System.out.println(x.key);
            printPreOrder(x.left);
            printPreOrder(x.right);
        }
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node x) {
        if (null != x) {
            printPostOrder(x.left);
            printPostOrder(x.right);
            System.out.println(x.key);
        }
    }

    Node search(Node root, int key) {
        if (null == root || key == root.key) {
            return root;
        } else if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    Node itsearch(int key) {
        Node ptr = root;
        while (null != ptr && key != ptr.key) {
            if (key < ptr.key) {
                ptr = ptr.left;
            } else {
                ptr = ptr.right;
            }
        }
        return ptr;
    }

    Node minimum(Node x) {
        while (null != x && null != x.left) {
            x = x.left;
        }
        return x;
    }

    Node maximum(Node x) {
        while (null != x && null != x.right) {
            x = x.right;
        }
        return x;
    }

    Node successor(Node x) {
        if (null != x && null != x.right) {
            return minimum(x.right);
        }
        Node y = x.parent;
        while (null != y && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    void insert(int z) {
        Node y = null;
        Node x = root;
        while (null != x) {
            y = x;
            if (z < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        Node znode = new Node();
        znode.key = z;
        znode.parent = y;
        if (null == y) {
            root = znode;
        } else if (z < y.key) {
            y.left = znode;
        } else {
            y.right = znode;
        }
    }

    private class Node {
        Node parent;
        Node right;
        Node left;
        int key;
    }

    public static void main(String[] args) {
        final int[] values = { 12, 5, 2, 9, 18, 15, 13, 17, 19 };
        final BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }
        bst.printInOrder();
        System.out.println();
        bst.printPreOrder();
        System.out.println();
        bst.printPostOrder();
    }
}
