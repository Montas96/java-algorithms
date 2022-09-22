package javafeatures;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randomInteger = ()-> new Random().nextInt(10);
        System.out.println(randomInteger.get());


    }
}
