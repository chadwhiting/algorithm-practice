package algorithms.chapter10;

public class Queue {

    private int[] queue;
    private int head;
    private int tail;

    Queue() {
        this(10);
    }

    Queue(int size) {
        queue = new int[size];
        head = tail = 0;
    }

    boolean isEmpty() {
        return head == tail;
    }

    boolean isFull() {
        return (head == tail + 1) || (head == 0 && (tail == queue.length - 1));
    }

    void enqueue(int e) {
        if (!isFull()) {
            queue[tail++] = e;
            if (tail == queue.length) {
                tail = 0;
            }
        }
    }

    int dequeue() {
        if (!isEmpty()) {
            int value = queue[head++];
            if (head == queue.length) {
                head = 0;
            }
            return value;
        }
        return -1;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        runQueue(q);
        System.out.println();
        runQueue(q);
    }

    private static void runQueue(final Queue q) {
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
