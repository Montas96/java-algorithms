package io.umbrella.datastructures.dynamicdatastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Resources:
 * https://www.programiz.com/java-programming/deque
 */
public class DequeDemo {

    /**
     * In a regular queue, elements are added from the rear and removed from the front.
     * However, in a deque, we can insert and remove elements from both front and rear.
     * In order to use the functionalities of the Deque interface, we need to use classes that implement it:
     * - ArrayDeque
     * - LinkedList
     */
    public static void main(String[] args) {

        // Array implementation of Deque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // LinkedList implementation of Deque
        Deque<String> linkedList = new LinkedList<>();

        arrayDeque.add("H");
        arrayDeque.add("E");
        arrayDeque.add("L");
        arrayDeque.add("L");
        arrayDeque.add("O");

        System.out.println(arrayDeque);

        arrayDeque.offer("!");
        System.out.println(arrayDeque);

        arrayDeque.offerFirst("first");
        System.out.println(arrayDeque);

        arrayDeque.offerLast("last");
        System.out.println(arrayDeque);

        arrayDeque.offerFirst("- ");
        System.out.println(arrayDeque);

        arrayDeque.offerLast(".");
        System.out.println(arrayDeque);

        System.out.println("peek " + arrayDeque.peek());
        System.out.println(arrayDeque);

        System.out.println("peekFirst " + arrayDeque.peekFirst());
        System.out.println(arrayDeque);

        System.out.println("peekLast " + arrayDeque.peekLast());
        System.out.println(arrayDeque);

        System.out.println("pop " + arrayDeque.pop());
        System.out.println(arrayDeque);

        System.out.println("poll " + arrayDeque.poll());
        System.out.println(arrayDeque);

        System.out.println("pollFirst " + arrayDeque.pollFirst());
        System.out.println(arrayDeque);

        System.out.println("pollLast " + arrayDeque.pollLast());
        System.out.println(arrayDeque);

        arrayDeque.addFirst("11");
        System.out.println(arrayDeque);

        arrayDeque.addLast("00");
        System.out.println(arrayDeque);

        System.out.println("element " + arrayDeque.element());
        System.out.println(arrayDeque);

        System.out.println("remove " + arrayDeque.remove());
        System.out.println(arrayDeque);

        System.out.println("removeFirst " + arrayDeque.removeFirst());
        System.out.println(arrayDeque);

        System.out.println("removeLast " + arrayDeque.removeLast());
        System.out.println(arrayDeque);

        arrayDeque.add("O");
        arrayDeque.add("1");
        arrayDeque.add("O");
        arrayDeque.add("1");

        System.out.println("removeFirstOccurrence " + arrayDeque.removeFirstOccurrence("0"));
        System.out.println(arrayDeque);

        System.out.println("removeLastOccurrence " + arrayDeque.removeLastOccurrence("1"));
        System.out.println(arrayDeque);

        System.out.println("getFirst " + arrayDeque.getFirst());

        System.out.println("getLast " + arrayDeque.getLast());

        arrayDeque.push("***");
        System.out.println(arrayDeque);

    }

}
