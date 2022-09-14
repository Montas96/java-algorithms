package sortAlgorithm;

import java.util.Arrays;

import static sortAlgorithm.AlgorithmUtils.initializeArray;
import static sortAlgorithm.AlgorithmUtils.printArray;

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


}
