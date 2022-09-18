package javafeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerDemo {

    public static void main(String[] args) {
        // example 1
        BiConsumer<String, Integer> consumer = (x, y) -> System.out.printf("This is %s with value %d%n", x, y);
        consumer.accept("Variable1", 30);

        // example 2
        BiConsumer<Integer, Integer> consumerAddition = (x, y) -> System.out.printf("%d + %d = %d%n", x, y, (x + y));
        consumerAddition.accept(10, 30);

        // example 3
        List<Product> products = Product.getProducts();
        Predicate<Product> isGoodRated = product -> product.rate > 3.5;
        Predicate<Product> isCheap = product -> product.price < 100;
        BiConsumer<String, Float> print = (name, price) -> System.out.printf("This is %s with only %f%n", name, price);

        products.forEach(product -> {
            if (isGoodRated.and(isCheap).test(product)) {
                print.accept(product.name, product.price);
            }
        });

    }
}

class Product {
    String name;
    float price;
    float rate;

    String code;

    public Product(String name, String code, float price, float rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.code = code;
    }

    public static List<Product> getProducts() {
        return new ArrayList<>(Arrays.asList(
                new Product("PRODUCT1", "1111", 12.5f, 2.9f),
                new Product("PRODUCT2", "2222", 27.5f, 4.1f),
                new Product("PRODUCT3", "3333", 551, 3.1f)
        ));
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                ", code='" + code + '\'' +
                '}';
    }
}
