package javafeatures;

import java.util.Random;
import java.util.stream.IntStream;

public class NumericStream {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9);
        intStream.forEach(System.out::print);
        System.out.print("*********************");
        System.out.println();

        intStream = IntStream.range(1,10);
        intStream.forEach(System.out::print);
        System.out.println();

        intStream = IntStream.rangeClosed(1,10);
        intStream.forEach(System.out::print);
        System.out.println();

        intStream = IntStream.generate(new Random()::nextInt).limit(10);
        intStream.forEach(System.out::print);
        System.out.println();
    }
}
