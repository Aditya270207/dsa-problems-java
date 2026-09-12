package Basic;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) Math.ceil(Math.random()*5);
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if(guess < random)
                System.out.println("Guess Higher");
            else if(guess > random)
                System.out.println("Guess lower");
            else
                System.out.println("Your guess is right");
        } while(guess != random);
    }
}
