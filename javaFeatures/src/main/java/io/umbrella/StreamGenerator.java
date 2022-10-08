package io.umbrella;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.forEach(System.out::println);

        System.out.println("***************");

        Stream<Integer> iterate = Stream.iterate(0, i->i+2).limit(10);
        iterate.forEach(System.out::println);

        System.out.println("***************");
        Stream<Integer> generate = Stream.generate(new Random()::nextInt).limit(10);
        generate.forEach(System.out::println);

    }
}
