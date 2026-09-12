package Arrays;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i=0; i< arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Element: ");
        int num1 = input.nextInt();
        int occurence = occurencess(arr,num1);
        System.out.println(num1 + " occurences are " + occurence);
    }

    public static int occurencess(int[] arr,int num1) {
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                occ++;
            }
        }
        if(occ==0) {
            System.out.println("Not found");
        }
        return occ;
    }
}
