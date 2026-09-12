package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtility.input2DArray();
        System.out.println("Number to search");
        int numToSearch = input.nextInt();
        if(search(arr,numToSearch))
            System.out.println("Found");
        else

          System.out.println("Not found");
    }


public static boolean search(int[][] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == num)
                return true;
        }
    }
    return false;
}

}