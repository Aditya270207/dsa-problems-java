package Basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int Reverse = reversed(num);
        if(Reverse == num){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
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
