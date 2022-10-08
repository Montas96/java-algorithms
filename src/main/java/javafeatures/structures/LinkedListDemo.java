package javafeatures.structures;

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
        linkedList.addFirst("Montassar");
        System.out.println(linkedList);
        linkedList.addLast("Tommy");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.add(3,"Sam");
        System.out.println(linkedList);

    }
}
