package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void meetPlayer() {
        System.out.println("\nДобро пожаловать в интеллектуальные игры!");
        System.out.print("Как вас зовут? ");

        Scanner playerNameScanner = new Scanner(System.in);
        String playerName = playerNameScanner.next();
        System.out.println("Привет, " + playerName + "!");
    }
}
