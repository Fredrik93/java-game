package battleships;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x != 9) {
            System.out.println("Shoot at the boat, pick 0 - 4, or press 9 to exit");
            Scanner scn = new Scanner(System.in);
            int userInput = scn.nextInt();
            if (userInput == 9) {
                x = 9;
            }
            String array[];
            array = new String[5];
            array[0] = "Destroyer";
            array[3] = "Commander";
            if (array[userInput] != null) {
                System.out.println("Yay you found the " + array[userInput].toString());
            } else {
                System.out.println("Oh dang its empty try again");
            }

        }
    }

}
