package utils;

import java.util.Random;

public class ArrayHelper {
    public static void initialize2dArray(int[][] towDimension) {
        for (int i = 0; i < towDimension.length; i++) {
            for (int j = 0; j < towDimension[i].length; j++) {
                towDimension[i][j] = new Random().nextInt(10);
                System.out.print(towDimension[i][j] + " ");
            }
            System.out.println();
        }
    }
}
