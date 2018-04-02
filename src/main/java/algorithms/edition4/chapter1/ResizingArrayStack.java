package algorithms.edition4.chapter1;

public class ResizingArrayStack {

    static final int DEFAULT_CAPACITY = 2;
    int[] stack;
    private int head = 0;

    ResizingArrayStack() {
        stack = new int[DEFAULT_CAPACITY];
    }

    void push(int item) {
        if (head == stack.length) {
            stack = ArrayResizing.resize(stack, 2 * stack.length);
        }
        stack[head++] = item;
    }

    int pop() {
        final int item = stack[--head];
        stack[head] = 0;
        if (head > 0 && head == (int) Math.floor(stack.length / 4)) {
            stack = ArrayResizing.resize(stack, (int) Math.floor(stack.length / 2));
        }
        return item;
    }

    boolean isEmpty() {
        return head == 0;
    }
}
