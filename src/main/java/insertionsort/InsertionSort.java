package insertionsort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        initializeArray(array);
        int[] checkSortedArray = Arrays.copyOf(array, array.length);

        printArray(array);
        sortArray(array);
        System.out.println("Array after ... ");
        printArray(array);
        System.out.println("Sorted Array ... ");
        Arrays.sort(checkSortedArray);
        printArray(checkSortedArray);
        System.out.println("Array sorted correctly : " + Arrays.equals(array, checkSortedArray));
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int pivot = array[i];
            int j = i - 1;
            while (j >= 0 && pivot < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = pivot;
        }
    }

    private static void initializeArray(int[] array) {
        Random random = new Random();
        System.out.println("Array before ... ");
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
    }


}
