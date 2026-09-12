package Basic;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass;
        do{
            System.out.print("Enter passcode: ");
            pass = input.next();
        } while(pass.length() < 6);

        System.out.println("Thanks for giving password");
    }
}
