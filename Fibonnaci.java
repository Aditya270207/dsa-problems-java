package Basic;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Value of n: ");
        int n = input.nextInt();
        fibonnaci(n);
    }

    public static void fibonnaci(int n) {
        int a=0,b=1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}
