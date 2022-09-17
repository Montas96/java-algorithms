package sortAlgorithm;

public class MergeSort {


    public static void main(String[] args) {
        System.out.println("https://www.programiz.com/dsa/merge-sort");
        int[] array = new int[10];
        AlgorithmUtils.initializeArray(array);
        AlgorithmUtils.printArray(array);

        mergeSort(array);

        System.out.println("after");
        AlgorithmUtils.printArray(array);

    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length < 2) {
            return;
        }
        int midIndex = length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midIndex; i < length; i++) {
            rightArray[i - midIndex] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
