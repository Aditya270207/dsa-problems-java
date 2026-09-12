package Basic;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        int sum=0;
        while(num>0) {
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }
        return sum;
    }
}
