package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String PRIME_RULE = "Ответьте «да», если данное число простое. "
            + "В противном случае ответьте «нет».";
    private static final int UPPER_BORDER = 3600;
    public static final int LOWER_BORDER = 1;

    public static void startPrime() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = generateGameData();
        }
        Engine.runGame(PRIME_RULE, questionAndAnswer);
    }

    public static String[] generateGameData() {
        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = String.valueOf(Utils.
                generateRandomNumber(LOWER_BORDER, UPPER_BORDER));
        questionAndAnswer[1] = isPrimeNumber(Integer.parseInt(questionAndAnswer[0])) ? "да" : "нет";
        return questionAndAnswer;
    }

    public static boolean isPrimeNumber(int inputNumber) {
        if (inputNumber < 2) {
            return false;
        }
        int noOneDividerCounts = 0;

        for (int i = 2; i <= UPPER_BORDER; i++) {
            if (inputNumber % i == 0) {
                noOneDividerCounts++;
            }
        }
        return noOneDividerCounts == 1;
    }
}
