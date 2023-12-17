package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String EVEN_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void startEven() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = generateGameData();
        }
        Engine.runGame(EVEN_RULE, questionAndAnswer);
    }

    private static String[] generateGameData() {
        int randomNumber = Utils.generateRandomNumber(MIN_VALUE, MAX_VALUE);

        String question = String.valueOf(randomNumber);
        String rightAnswer = isEvenNumber(randomNumber) ? "yes" : "no";

        String[] startEven = new String[2];
        startEven[0] = question;
        startEven[1] = rightAnswer;

        return startEven;
    }

    public static boolean isEvenNumber(int inputNumber) {
        return inputNumber % 2 == 0;
    }
}
