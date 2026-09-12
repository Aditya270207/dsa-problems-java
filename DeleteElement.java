package Arrays;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Element: ");
        int num1 = input.nextInt();
        int[] newArr = deletingSpecific(arr,num1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] deletingSpecific(int[] arr, int num) {
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                occ++;
            }
        }
        int[] newArr = new int[arr.length-occ];
        int i=0,j=0;
        while(i< arr.length) {
            if(arr[i] != num) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
