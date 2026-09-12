package Basic;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(reversed(num));
    }

    public static int reversed(int num) {
        int reverse=0;
        while(num>0) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num /= 10;
        }
        return reverse;
    }
}
