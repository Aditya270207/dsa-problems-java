package Basic;

import java.util.Scanner;

public class AbslouteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int abs = Math.abs(num1);
        System.out.println("Your absolute value is " + abs);
    }
}
