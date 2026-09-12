package Arrays;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Your sum is " + sum(nums));
        System.out.println("Your avg is " + avg(nums));

    }

    public static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
}
