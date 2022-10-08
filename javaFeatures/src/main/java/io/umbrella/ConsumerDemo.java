package io.umbrella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        // example 1
        Consumer<String> consumer = x -> System.out.println("This is " + x);
        consumer.accept("Hello friend.");

        // example 2
        List<String> names = new ArrayList<>(Arrays.asList("James", "Damachi"));
        Consumer<String> consumerNames = x -> System.out.println("Hello " + x);
        names.forEach(consumerNames.andThen(consumer));

        // example 3
        names.forEach(name -> {
            if (name.length() > 5) {
                consumer.andThen(consumerNames).accept(name.toUpperCase());
            }
        });

        /** Int consumer*/
        IntConsumer intConsumer = (x) -> System.out.println("int x = " + x);
        intConsumer.accept(10);

        LongConsumer longConsumer = (x) -> System.out.println("long x = " + x);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (x) -> System.out.println("double x = " + x);
        doubleConsumer.accept(10d);
    }
}
