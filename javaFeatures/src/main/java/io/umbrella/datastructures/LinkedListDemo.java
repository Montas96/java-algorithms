package io.umbrella.datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,2,5,4,6,9,8,7);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Emily");
        System.out.println(linkedList);
        System.out.println("***");
        linkedList.addFirst("Montassar");
        System.out.println(linkedList);
        linkedList.addLast("Tommy");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.add(3,"Sam");
        System.out.println(linkedList);

        System.out.println("***");
        linkedList.descendingIterator().forEachRemaining(System.out::println);
        System.out.println(linkedList.element());

        System.out.println("***");
        System.out.println(linkedList.indexOf("Emily"));

        System.out.println("***");
        System.out.println("offer: This method Adds the specified element as the tail (last element) of this list.");
        linkedList.offer("Susan");
        System.out.println(linkedList);

        System.out.println("***");
        System.out.println("offerFirst: This method Inserts the specified element at the front of this list.");
        linkedList.offerFirst("Damien");
        System.out.println(linkedList);

        System.out.println("***");
        System.out.println(linkedList);
        System.out.println("peek: This method retrieves but does not remove, the head (first element) of this list.");
        System.out.println(linkedList.peek());
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("peekFirst: This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.");
        System.out.println(linkedList.peekFirst());
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("peekLast: This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.");
        System.out.println(linkedList.peekLast());
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("poll: This method retrieves and removes the head (first element) of this list.");
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("pollFirst: This method retrieves and removes the first element of this list, or returns null if this list is empty.");
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("pollLast: This method retrieves and removes the last element of this list, or returns null if this list is empty.");
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("pop: This method Pops an element from the stack represented by this list.");
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("push: This method pushes an element onto the stack represented by this list.");
        linkedList.push("Syline");
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        linkedList.add(2,"Syline");
        System.out.println("removeFirstOccurrence:This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).");
        linkedList.removeFirstOccurrence("Syline");
        System.out.println(linkedList);
        System.out.println("***");

        System.out.println(linkedList);
        System.out.println("set:This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).");
        linkedList.set(0, "Montassar");
        System.out.println(linkedList);
        System.out.println("***");
        getAdvantages();
    }

    private static void getAdvantages(){
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("Linked List Advantages\n" +
                                   "- Dynamic in size\n" +
                                   "- No wastage as capacity and size is always equal\n" +
                                   "- Easy insertion and deletion as 1 link manipulation is required\n" +
                                   "- Efficient memory allocation\n" +
                                    "\n"+
                                   "Linked List Disadvantages\n" +
                                   "- If head Node is lost, the linked list is lost\n" +
                                   "- No random access is possible\n" +
                                   "\nLinked List Applications\n" +
                                   "- Suitable where memory is limited \n" +
                                   "- Suitable for applications that require frequent insertion and deletion");
    }
}
