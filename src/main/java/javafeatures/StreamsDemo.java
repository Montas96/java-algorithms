package javafeatures;

import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String[] args) {

    }

    private void sumEvenNumbers() {
        /** Stream sum of even numbers includeing 2 up to including N */
        int N = 4;
        System.out.println(IntStream.rangeClosed(2, N).filter(x -> x % 2 == 0).sum());
    }
}
