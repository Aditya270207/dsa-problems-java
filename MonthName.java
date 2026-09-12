package Basic;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        Monthname(month);
    }

    public static void Monthname(int month) {
        String monthname = switch(month) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "April";
            default -> "Invalid";
        };
        System.out.println("your month name is " + monthname);
    }
}
