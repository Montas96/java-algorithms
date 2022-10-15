package io.umbrella.datastructures.dynamicdatastructures;

import java.util.PriorityQueue;

/**
 * Resources:
 * https://www.geeksforgeeks.org/priority-queue-class-in-java/
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue);

        // Printing the top element of PriorityQueue
        System.out.println("Printing the top element of PriorityQueue\n" + pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("Printing the top element and removing it\n" + pQueue.poll());

        // Printing the top element again
        System.out.println("Printing the top element again\n" + pQueue.peek());

        // 	Retrieves, but does not remove, the head of this queue.
        System.out.println("Retrieves, but does not remove, the head of this queue.\n"+ pQueue.element());

        //	Removes all the elements from this priority queue.
        pQueue.clear();
        System.out.println(pQueue);


        comparatorDemo();
        containsMethodExample();
        offerMethodExample();
    }

    private static void comparatorDemo() {
        System.out.println("********** Compare String **********");
        PriorityQueue queue = new PriorityQueue<String>(String::compareTo);

        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("K");
        queue.add("S");
        queue.add("4");


        System.out.println("The elements with the highest priority element at front of queue" + "order:");
        while (!queue.isEmpty()) {
            System.out.print(" " + queue.poll());
        }
        System.out.println();
        System.out.println("********** Compare Integer **********");

        queue = new PriorityQueue<Integer>(Integer::compareTo);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(8);
        queue.add(7);
        queue.add(0);


        System.out.println("The elements with the highest priority element at front of queue" + "order:");
        while (!queue.isEmpty()) {
            System.out.print(" " + queue.poll());
        }
        System.out.println();
        System.out.println("********** ********** **********");
        System.out.println();
    }

    private static void containsMethodExample() {
        System.out.println("********** contains Method **********");
        // Creating an empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // Use add() method to add elements into the Queue
        queue.add("Welcome");
        queue.add("To");
        queue.add("Geeks");
        queue.add("4");
        queue.add("Geeks");

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + queue);

        // Check for "Geeks" in the queue
        System.out.println("Does the Queue contains 'Geeks'? " + queue.contains("Geeks"));

        // Check for "4" in the queue
        System.out.println("Does the Queue contains '4'? " + queue.contains("4"));

        // Check if the Queue contains "No"
        System.out.println("Does the Queue contains 'No'? " + queue.contains("No"));
    }

    /**
     * The java.util.PriorityQueue.offer() method is used to insert a particular element into the Priority Queue.
     * It acts similar to the add() method of Priority Queue.
     */
    private static void offerMethodExample(){
        System.out.println("********** offer Method **********");
        // Creating an empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // Use add() method to add elements into the Queue
        queue.add("Welcome");
        queue.add("To");
        queue.add("Geeks");
        queue.add("4");
        queue.add("Geeks");

        // Displaying the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);

        // Inserting using offer()
        queue.offer("The");
        queue.offer("Priority");
        queue.offer("Class");

        // Displaying th final Queue
        System.out.println("Priority queue after Insertion: " + queue);

        System.out.println();
        System.out.println("********** ********** **********");
        System.out.println();
    }
}
