package Arrays;

import java.util.Scanner;

public class SumAvg2 {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        System.out.println("Your sum is " + sum(arr));
        System.out.println("Your avg is " + avg(arr));

    }

    public static long sum(int[][] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static double avg(int[][] arr) {
        return (double) sum(arr) / arr.length;
    }
}
