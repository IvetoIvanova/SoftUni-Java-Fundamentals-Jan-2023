package MoreExercises;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        StringBuilder openingBrackets = new StringBuilder();

        boolean isBalanced = true;

        for (int i = 0; i < numOfLines; i++) {
            String line = scanner.nextLine();

            for (int j = 0; j < line.length(); j++) {
                char currentChar = line.charAt(j);

                if (currentChar == '(') {
                    openingBrackets.append(currentChar);
                } else if (currentChar == ')') {
                    if (openingBrackets.length() > 0 && openingBrackets.charAt(openingBrackets.length() - 1) == '(') {
                        openingBrackets.deleteCharAt(openingBrackets.length() - 1);
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
        }

        if (openingBrackets.length() > 0) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
