package io.umbrella;

import io.umbrella.algorithms.module.utils.ArrayHelper;

import java.util.HashMap;
import java.util.Map;

public class Examples {

    public static void main(String[] args) {
        String[] products = new String[]{"A", "B", "C", "D", "E"};
        int days = 3;
        int[][] towDimension = new int[days][products.length];
        ArrayHelper.initialize2dArray(towDimension);

        Map<String, Integer> avgPricePerProduct = new HashMap<>();
        int j = 0;
        while (j < products.length) {
            int sum = 0;
            for (int i = 0; i < towDimension.length; i++) {
                sum += towDimension[i][j];
            }
            avgPricePerProduct.put(products[j], sum / towDimension.length);
            ++j;
        }
        System.out.println(avgPricePerProduct);
        avgPricePerProduct.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }


}
