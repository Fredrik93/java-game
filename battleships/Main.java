package battleships;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Battleship ship1 = new Battleship(1, "Commander");
        ArrayList<Battleship> boats = new ArrayList<>();
        boats.add(ship1);
        System.out.println(boats);
        System.out.println("Shoot at the boat, pick 0 - 8, or press 9 to exit");
        Scanner scn = new Scanner(System.in);
        int userInput = scn.nextInt();

        if (boats.isEmpty() == false) {
            System.out.println("Yay you found the " + boats.get(userInput));
        }
    }
}
