package MoreExercises;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String dataType = "";

        while (!input.equals("END")) {

            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                dataType = "boolean";
            } else if (input.length() == 1) {
                char symbol = input.charAt(0);
                if (symbol < 47 || symbol > 58) {
                    dataType = "character";
                } else {
                    dataType = "integer";
                }
            } else {
                boolean isString = false;
                boolean isFloatingPoint = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);

                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }

                    if (currentSymbol == 46) {
                        isFloatingPoint = true;
                    }
                }
                if (isString) {
                    dataType = "string";
                } else {
                    if (isFloatingPoint) {
                        dataType = "floating point";
                    } else {
                        dataType = "integer";
                    }
                }
            }

            System.out.printf("%s is %s type%n", input, dataType);
            input = scanner.nextLine();
        }
    }
}
