package io.umbrella.datastructures.dynamicdatastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Ressources:
 * https://www.geeksforgeeks.org/queue-data-structure/
 * https://www.programiz.com/dsa/queue
 * https://www.softwaretestinghelp.com/java-queue-interface/
 */
public class QueueDemo {
    //declare a Queue
    public static void main(String[] args) {
        Queue<String> str_queue = new LinkedList<>();
        //initialize the queue with values
        str_queue.add("one");
        str_queue.add("two");
        str_queue.add("three");
        str_queue.add("four");
        //print the Queue
        System.out.println("The Queue contents:" + str_queue);

        iterateQueue();
        invokeMethods();
    }

    private static void iterateQueue() {
        System.out.println("************** Iterate a Queue **************");
        //declare a Queue
        Queue queue = new LinkedList();
        //initialize the Queue
        queue.add("Value-0");
        queue.add("Value-1");
        queue.add("Value-2");
        queue.add("Value-3");
        //traverse the Queue using Iterator
        System.out.println("The Queue elements through iterator:");
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("The Queue elements using for loop:");
        //use new for loop to traverse the Queue
        for(Object object : queue) {
            String element = (String) object;
            System.out.print(element + " ");
        }
        System.out.println("The Queue elements using forEach:");
        queue.stream().forEach(System.out::println);
    }

    private static void invokeMethods() {
        System.out.println("************** Queue methods **************");
        Queue<Integer> q1 = new LinkedList<Integer>();
        //Add elements to the Queue
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println("Elements in Queue:"+q1);
        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: "+q1.remove());
        //element() => returns head of the queue
        System.out.println("Head of the queue: "+q1.element());
        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: "+q1.poll());
        //returns head of the queue
        System.out.println("peek():Head of the queue: "+q1.peek());
        //print the contents of the Queue
        System.out.println("Final Queue:"+q1);
    }
}
