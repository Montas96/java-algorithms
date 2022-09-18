package javafeatures;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        /**     Function interface */
        System.out.println("/**     Function interface */");
        Function<String, String> upperCase = string -> string.toUpperCase();
        String greet = upperCase.apply("hello java programmer");
        System.out.println(greet);

        Function<String, String> addLength = string -> string + " of length: " + string.length();
        String winter_is_coming = upperCase.andThen(addLength).apply("winter is coming");
        System.out.println(winter_is_coming);

        String not_today = upperCase.compose(addLength).apply("not today");
        System.out.println(not_today);

        String not_today2 = addLength.compose(upperCase).apply("not today");
        System.out.println(not_today2);


        /**     BiFunction interface */
        System.out.println("/**     BiFunction interface */");

        BiFunction<String, String, String> concatString = (string1, string2) -> string1 + " " + string2;
        String helloString = concatString.apply("Hello", "friend");
        System.out.println(helloString);

        List<Product> products = Product.getProducts();
        products.forEach(product -> {
            String apply = concatString.apply(product.code, product.name);
            System.out.println(apply);
        });


    }
}
