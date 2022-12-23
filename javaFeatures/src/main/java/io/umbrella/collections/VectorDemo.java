package io.umbrella.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * Vector implements a dynamic array which means it can grow or shrink as required.
 * Like an array, it contains components that can be accessed using an integer index.
 * They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
 * It also maintains an insertion order like an ArrayList.
 * Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
 * The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());
        System.out.println(vector.size());

        int vectorSize = 5;
        Vector<Integer> integerVector = new Vector<>(vectorSize);
        System.out.println(integerVector.capacity());
        System.out.println(integerVector.size());

        for (int i = 1; i <= vectorSize; i++)
            integerVector.add(i);
        System.out.println(integerVector);

        // Remove element at index 3
        integerVector.remove(3);
        System.out.println(integerVector);

        Vector vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);
        vector1.add("geeks");
        vector1.add("forGeeks");
        vector1.add(3);
        System.out.println(vector1);

        vector1.set(3, "New geeks");
        System.out.println(vector1);

        vector1.setSize(4);
        System.out.println(vector1);
        vector1.setSize(6);
        System.out.println(vector1);

        vector1.remove(5);
        System.out.println(vector1);

        System.out.println(vector1.contains(2));

        System.out.println(vector1.containsAll(Arrays.asList(1,2)));

        System.out.println(vector1.elements().nextElement());

        vector1.removeIf(o -> o == null);
        System.out.println(vector1);
    }
}
