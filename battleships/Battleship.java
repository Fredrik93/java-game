package battleships;

import java.util.Scanner;

public class Battleship {

    public static String test() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter something");
        String input = scan.nextLine();
        System.out.println("your input was: " + input);
        return input;
    }
}
