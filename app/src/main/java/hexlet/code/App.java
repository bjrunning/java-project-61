package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите номер игры и нажмите Enter.");
        System.out.println("1 - Приветствие");
        System.out.println("2 - Чётное или нечётное");
        System.out.println("3 - Калькулятор");
        System.out.println("4 - Наибольший общий делитель");
        System.out.println("5 - Арифметическая рогрессия");
        System.out.println("6 - Простое ли число?");
        System.out.println("0 - Выход");
        Scanner playerChoice = new Scanner(System.in);
        System.out.print("Ваш выбор: ");
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
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Пожалуйста, выберите 1, 2, 3, 4, 5, 6 или 0.");
        }
    }
}
