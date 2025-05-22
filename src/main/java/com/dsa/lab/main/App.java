package com.dsa.lab.main;

import com.dsa.lab.stack.Stack;
import com.dsa.lab.stack.StackInterface;


public class App {
    public static void main(String[] args) {
        StackInterface stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        System.out.println("Popped element is " + stack.pop());
        System.out.println("Top element after pop is " + stack.peek());
    }
}
