package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final String CALCULATOR_RULES = "What is the result of the expression?";
    private static final String WRONG_OPERATOR = "Operator error";
    private static final int LOWER_BORDER = 2;
    private static final int UPPER_BORDER = 50;
    private static final int MATH_OPERATOR_ELECTOR_LOWER_BORDER = 0;
    private static final int MATH_OPERATOR_ELECTOR_UPPER_BORDER = 2;
    private static final String[] CALCULATOR_OPERATORS = {" + ", " - ", " * "};

    public static void startCalc() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = generateGameData();
        }
        Engine.runGame(CALCULATOR_RULES, questionAndAnswer);
    }

    public static String[] generateGameData() {
        String[] questionAndAnswer = new String[2];

        int firstNumber = Utils.generateRandomNumber(LOWER_BORDER,
                UPPER_BORDER);
        int secondNumber = Utils.generateRandomNumber(LOWER_BORDER,
                UPPER_BORDER);
        int mathOperator = Utils.generateRandomNumber(MATH_OPERATOR_ELECTOR_LOWER_BORDER,
                MATH_OPERATOR_ELECTOR_UPPER_BORDER);
        String chosenOperator = CALCULATOR_OPERATORS[mathOperator];

        questionAndAnswer[0] = firstNumber + chosenOperator + secondNumber;
        questionAndAnswer[1] = String.valueOf(calculate(firstNumber, secondNumber, chosenOperator));
        return questionAndAnswer;
    }

    public static int calculate(int firstNumber, int secondNumber, String chosenOperator) {
        switch (chosenOperator) {
            case " + ":
                return firstNumber + secondNumber;
            case " - ":
                return firstNumber - secondNumber;
            case " * ":
                return firstNumber * secondNumber;
            default:
                throw new IllegalStateException(WRONG_OPERATOR);
        }
    }
}
