package Basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String isprime = num%2==0 ? "prime" : "not prime";
        System.out.println(isprime);
    }

//    public static void isPrime(int num) {
//        if (num % 2 != 0) {
//            System.out.println("Not prime");
//        }else{
//            System.out.println("Prime");
//        }
//    }
}
