package Basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        String operation = input.next();

     double output = switch (operation) {
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
         default ->  -1;

     };
        System.out.println("your answer is " + output);
    }
}
