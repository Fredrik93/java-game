package battleships;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> boats = new ArrayList<>();
        boats.add("Submarine");
        boats.add("Yellow Submarine");
        System.out.println(boats);
        int x = 0;
        while (x != 9) {
            System.out.println("Shoot at the boat, pick 0 - 8, or press 9 to exit");
            Scanner scn = new Scanner(System.in);
            int userInput = scn.nextInt();
            if (userInput == 9) {
                x = 9;
            }
            if (boats.isEmpty() == false) {
                System.out.println("Yay you found the " + boats.get(userInput));
            } else if (userInput == 9) {
                System.out.println("********");
                System.out.println("bye!");
            } else {
                System.out.println("Oh dang its empty try again");
            }

        }
    }

}
