package io.umbrella;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 505));

        Comparator<Integer> comparator = (int1, int2) -> int1.compareTo(int2);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(maxBy.apply(5,60));
        System.out.println(minBy.apply(5,60));

        IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
        System.out.println(intBinaryOperator.applyAsInt(10 , 3));

        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println(longBinaryOperator.applyAsLong(10005585451L , 3));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
        System.out.println(doubleBinaryOperator.applyAsDouble(12.55 , 3));
    }
}
