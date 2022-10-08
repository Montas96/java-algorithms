package javafeatures;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCollectors {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("H", "E", "L", "L","O");
        String collect = stringStream.collect(Collectors.joining());
        System.out.println(collect);

        stringStream = Stream.of("H", "E", "L", "L","O");
        collect = stringStream.collect(Collectors.joining(" - "));
        System.out.println(collect);

        stringStream = Stream.of("H", "E", "L", "L","O");
        collect = stringStream.collect(Collectors.joining(" ", "{","}"));
        System.out.println(collect);

        stringStream = Stream.of("H", "E", "L", "L","O");
        Long count = stringStream.collect(Collectors.counting());
        System.out.println(count);


        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer integer = intStream.collect(Collectors.summingInt(o -> o));
        System.out.println(integer);

        intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Double avg = intStream.collect(Collectors.averagingInt(o -> o));
        System.out.println(avg);

    }

}
