package battleships;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameHelper game = new GameHelper();
        Battleship ship1 = new Battleship(1, "Commander");
        ArrayList<Battleship> boats = new ArrayList<>();
        boats.add(ship1);
        System.out.println(boats);
        game.Runner();

    }
}
