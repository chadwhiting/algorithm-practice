package algorithms.chapter10;

public class Stack {

    private int top = 0;
    private int[] stack;

    Stack() {
        this(100);
    }

    Stack(final int size) {
        stack = new int[size];
    }

    boolean isEmpty() {
        return top == 0;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        return stack[--top];
    }

    void push(int e) {
        stack[top++] = e;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
