package javafeatures;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateDemo {

    public static void main(String[] args) {

        List<Product> products = Product.getProducts();
        BiPredicate<Float, Float> biPredicate = (price, rate) -> price < 100 && rate > 3.5;
        Consumer<Product> print = (product) -> System.out.printf("This is %s with only %f%n", product.name, product.price);
        products.stream().filter(product -> biPredicate.test(product.price, product.rate)).forEach(print);
    }
}

