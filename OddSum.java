package Basic;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Your sum is " + oddsum(num));
    }

    public static int oddsum(int num) {
        int sum = 0;
        for(int i = 1; i<=num; i+=2) {
            sum += i;
        }
        return sum;
    }
}
