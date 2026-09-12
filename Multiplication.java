package Basic;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        table(num);
    }

    public static void table(int num) {
        for(int i=0; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
