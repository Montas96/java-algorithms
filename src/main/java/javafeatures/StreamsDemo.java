package javafeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mkie", "Thousy", "Aladin", "Sicilia");
        List<String> result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);


        /** FlatMap */
        List<String> getAllProductCategories = Product.getProducts().stream().map(product -> product.categories)
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(getAllProductCategories);


        boolean allMatch = Product.getProducts().stream().allMatch(product -> product.rate < 3);
        System.out.println(allMatch);

        boolean anyMatch = Product.getProducts().stream().anyMatch(product -> product.rate < 3);
        System.out.println(anyMatch);

        boolean noneMatch = Product.getProducts().stream().noneMatch(product -> product.rate < 2);
        System.out.println(noneMatch);

        System.out.println("findAny ??");
        Product.getProducts().stream().findAny().ifPresent(System.out::println);

        /** Comparing  **/
        Product.getProducts().stream().sorted(Comparator.comparing(product -> product.rate)).forEach(System.out::println);

    }

    private void sumEvenNumbers() {
        /** Stream sum of even numbers including 2 up to including N */
        int N = 4;
        System.out.println(IntStream.rangeClosed(2, N).filter(x -> x % 2 == 0).sum());
    }
}
