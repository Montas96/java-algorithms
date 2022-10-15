package io.umbrella.datastructures.dynamicdatastructures;

import java.util.Stack;

public class StackDEmo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(26);
        stack.add(5);

        System.out.println(stack);
        System.out.println("retrieve last element without remove " + stack.peek());
        System.out.println(stack);

        System.out.println("retrieve last element and remove it " + stack.pop());
        System.out.println(stack);

        System.out.println(stack.push(1));
        stack.add(1);
        System.out.println(stack);

        System.out.println("Check if stack is empty" + stack.empty());

        System.out.println(stack.search(5));

    }
}
