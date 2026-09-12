package Basic;

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int min = Math.min(num1,num2);
        System.out.printf("Minimum number = %d ",min);
    }
}

