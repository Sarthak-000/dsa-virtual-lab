package com.dsa.lab.stack;

import java.util.EmptyStackException;

public class Stack implements StackInterface {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    @Override
    public int pop() {
        if (top == -1) throw new EmptyStackException();
        return arr[top--];
    }

    @Override
    public int peek() {
        if (top == -1) throw new EmptyStackException();
        return arr[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

