package test;

import challenges.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Daniel
 * @Date 30/03/2023
 */

class MyQueueTest {

    @Test
    public void testMyQueueOneElement() {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        int param_2 = myQueue.pop();
        int param_3 = myQueue.peek();
        boolean param_4 = myQueue.empty();

        assertEquals(1, param_2);
        assertEquals(-1, param_3);
        assertTrue(param_4);
    }

    @Test
    public void testMyQueueFourElements() {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);

        int poppedElement = myQueue.pop();

        myQueue.push(3);
        myQueue.push(4);

        int poppedSecondElement = myQueue.pop();
        int peek = myQueue.peek();

        assertEquals(1, poppedElement);
        assertEquals(2, poppedSecondElement);
        assertEquals(3, peek);
    }

}