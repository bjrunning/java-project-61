package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void runGame(String gameRule, String[][] questionsAndAnswers) {
        String playerName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nДобро пожаловать в интеллектуальные игры!\nКак вас зовут? ");
        playerName = scanner.next();
        System.out.println("Привет, " + playerName + "!");
        System.out.println(gameRule);

        for (int i = 0; i < ROUND_COUNT; i++) {
            System.out.println("Вопрос: " + questionsAndAnswers[i][0]);
            System.out.print("Ваш ответ: ");
            String playerAnswer = scanner.next();

            if (playerAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Правильно!");
            } else {
                System.out.println("'" + playerAnswer + "'"
                        + " неправильный ответ.\nПравильный ответ был:"
                        + " '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Давайте попробуем еще раз, " + playerName + "!");
                return;
            }
        }
        System.out.println("Поздравляю, " + playerName + "!");
    }
}
