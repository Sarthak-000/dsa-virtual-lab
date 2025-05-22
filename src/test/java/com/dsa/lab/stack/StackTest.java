package com.dsa.lab.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testStackOperations() {
        StackInterface stack = new Stack(3);

        assertTrue(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.peek());
        assertEquals(3, stack.size());

        int popped = stack.pop();
        assertEquals(30, popped);
        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());

        assertFalse(stack.isEmpty());
    }
}

