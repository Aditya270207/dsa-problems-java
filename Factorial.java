package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Your factorial is " + factorial(num));
    }

    public static long factorial(int num) {
        long fact = 1;
        if(num == 1) {
            return 1;
        }
        for(int i = 2; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
}
