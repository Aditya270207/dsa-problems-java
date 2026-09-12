package Basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        String result = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.printf("Your number %d is %s ",num1,result);
    }
}
