package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String PROGRESSION_RULE = "What number is missing in the progression?";
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;
    private static final String EMPTY_PLACE_ELEMENT = "..";
    public static final int LOWER_BORDER = 0;
    public static final int UPPER_BORDER = 100;

    public static void startProgressionGame() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int progressionArrayLength = Utils.generateRandomNumber(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            int progressionStep = Utils.generateRandomNumber(LOWER_BORDER,
                    UPPER_BORDER);
            int emptyPlaceNumber = Utils.generateRandomNumber(0, progressionArrayLength - 1);
            int firstElement = Utils.generateRandomNumber(LOWER_BORDER,
                    UPPER_BORDER);
            questionAndAnswer[i] = generateGameData(progressionArrayLength,
                    progressionStep, emptyPlaceNumber, firstElement);
        }
        Engine.runGame(PROGRESSION_RULE, questionAndAnswer);
    }

    public static String[] generateGameData(int progressionArrayLength,
                                            int progressionStep,
                                            int emptyPlaceNumber, int firstElement) {
        String[] questionAnswerPair = new String[2];
        int[] intRoundProgression = formProgression(progressionArrayLength, progressionStep, firstElement);
        questionAnswerPair[1] = String.valueOf(intRoundProgression[emptyPlaceNumber]);
        StringBuilder intToStringRoundProgression = new StringBuilder(progressionArrayLength);

        for (int i = 0; i < progressionArrayLength; i++) {
            if (i == emptyPlaceNumber) {
                intToStringRoundProgression.append(EMPTY_PLACE_ELEMENT);
            } else {
                intToStringRoundProgression.append(intRoundProgression[i]);
            }
            intToStringRoundProgression.append(" ");
        }
        questionAnswerPair[0] = intToStringRoundProgression.toString();
        return questionAnswerPair;
    }

    public static int[] formProgression(int progressionArrayLength, int progressionStep, int firstElement) {
        int[] intProgressionArray = new int[progressionArrayLength];

        for (int i = 0; i < progressionArrayLength; i++) {
            intProgressionArray[i] = firstElement + progressionStep * i;
        }
        return intProgressionArray;
    }
}
