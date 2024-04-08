package MoreExercises;

import java.util.Scanner;

public class L03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = extractHiddenMessage(input);
        System.out.println(output);
    }

    private static String extractHiddenMessage(String inputString) {
        StringBuilder result = new StringBuilder();
        StringBuilder numbersString = new StringBuilder();
        StringBuilder nonNumbersString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                numbersString.append(c);
            } else {
                nonNumbersString.append(c);
            }
        }

        String numbers = numbersString.toString();
        String nonNumbers = nonNumbersString.toString();

        StringBuilder takeBuilder = new StringBuilder();
        StringBuilder skipBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            if (i % 2 == 0) {
                takeBuilder.append(numbers.charAt(i));
            } else {
                skipBuilder.append(numbers.charAt(i));
            }
        }

        String takeIndexesStr = takeBuilder.toString();
        String skipIndexesStr = skipBuilder.toString();

        int index = 0;
        for (int i = 0; i < takeIndexesStr.length(); i++) {
            int takeCount = Character.getNumericValue(takeIndexesStr.charAt(i));
            int skipCount = Character.getNumericValue(skipIndexesStr.charAt(i));

            while (takeCount != 0) {
                if (index < nonNumbers.length()) {
                    result.append(nonNumbers.charAt(index));
                }

                takeCount--;
                index++;
            }

            index += skipCount;
        }

        return result.toString();
    }
}