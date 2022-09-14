package sortAlgorithm;

import java.util.Random;

public abstract class AlgorithmUtils {

    public static void initializeArray(int[] array) {
        Random random = new Random();
        System.out.println("Array before ... ");
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
    }
}
