package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner playerChoice = new Scanner(System.in);
        System.out.print("Your choice: ");
        String playerInteractionType = playerChoice.next();
        startSelectedGame(playerInteractionType);
        playerChoice.close();
    }

    private static void startSelectedGame(String playerInteractionType) {
        switch (playerInteractionType) {
            case "1":
                Cli.meetPlayer();
                break;
            case "2":
                Even.startEven();
                break;
            case "3":
                Calculator.startCalc();
                break;
            case "4":
                GCD.startGCDGame();
                break;
            case "5":
                Progression.startProgressionGame();
                break;
            case "6":
                Prime.startPrime();
                break;
            case "0":
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Please select 1, 2, 3, 4, 5, 6 or 0.");
        }
    }
}
