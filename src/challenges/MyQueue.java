package challenges;

import java.util.Stack;

/**
 * @author Daniel
 * @Date 30/03/2023
 */

public class MyQueue {

    private final Stack<Integer> firstStack;
    private final Stack<Integer> secondStack;
    private int firstElement;

    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
        firstElement = -1;
    }

    public void push(int x) {
        if (firstStack.isEmpty()) {
            firstElement = x;
        }
        firstStack.push(x);
    }

    public int pop() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }

        int poppedElement = secondStack.pop();
        if (secondStack.isEmpty()) {
            firstElement = -1;
        } else {
            firstElement = secondStack.peek();
        }
        return poppedElement;
    }

    public int peek() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        if (secondStack.isEmpty()) {
            return -1; // queue is empty
        } else {
            return secondStack.peek();
        }
    }

    public boolean empty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }
}
