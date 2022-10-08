package io.umbrella;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        /** UnaryOperator is used like Function when the inputType and outputType are the same*/
        UnaryOperator<Integer> tenTimes = integer -> integer * 10;
        Integer integer = tenTimes.apply(20);
        System.out.println(integer);

        UnaryOperator<Product> applyDiscount = product -> {
            System.out.println(product);
            product.price -= (product.price * 10 / 100);
            return product;
        };

        Product.getProducts().stream().map(applyDiscount).forEach(System.out::println);
    }
}
