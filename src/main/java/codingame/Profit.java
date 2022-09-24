package codingame;

import java.util.Arrays;

public class Profit {


    public static int[] maxProfit(int[] data) {
        int firstIndex = 0;
        int maxIndex = Integer.MIN_VALUE;
        for (int j = 0; j < data.length; j++) {
            int sum = 0;
            for (int i = j; i < data.length; i++) {
                sum += data[i];
            }
            if (maxIndex < sum) {
                maxIndex = sum;
                firstIndex = j;
            }
        }
        int lastIndex = data.length;
        maxIndex = Integer.MIN_VALUE;
        for (int j = data.length - 1; j >= firstIndex; j--) {
            int sum = 0;
            for (int i = j; i >= firstIndex; i--) {
                sum += data[i];
            }
            if (maxIndex < sum) {
                maxIndex = sum;
                lastIndex = j;
            }
        }
        return new int[]{firstIndex, lastIndex};
    }


    public static void main(String[] args) {
        int[] profits = new int[]{-1, 9, 0, 8, -5, 6, -24};
        //int[] profits = new int[]{-1, -2, 0, 8, -5, 20, -24};
        int[] maxProfit = maxProfit(profits);
        boolean isEquals = Arrays.equals(maxProfit, new int[]{1, 5});
        System.out.println(Arrays.toString(maxProfit) + " " + isEquals);
    }
}
