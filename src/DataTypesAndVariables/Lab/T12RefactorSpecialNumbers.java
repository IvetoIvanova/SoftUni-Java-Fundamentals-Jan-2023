package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            int totalSum = 0;

            while (currentNumber > 0) {
                totalSum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }

            boolean isSpecialNum = (totalSum == 5) || (totalSum == 7) || (totalSum == 11);

            if (isSpecialNum) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}