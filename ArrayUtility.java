package Arrays;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
    int[] arr = new int[num];
        for(int i=0; i< arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("No of rows: ");
        int rows = input.nextInt();
        System.out.print("No of columns: ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element row: %d, column: %d -> ",(i+1),(j+1));
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
