package Arrays;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        if (isIncreasing(arr) || isDecreasing(arr)) {
            System.out.println("Arrays.SumAvg.Sorted");
        } else {
            System.out.println("Sorry not sorted");
        }
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {   // if any element is smaller than previous
                return false;            // not increasing
            }
        }
        return true; // all checks passed
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {   // if any element is bigger than previous
                return false;            // not decreasing
            }
        }
        return true; // all checks passed
    }
}

