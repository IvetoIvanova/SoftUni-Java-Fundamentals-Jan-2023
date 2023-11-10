package MoreExercises;

import java.util.Scanner;

public class T01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int currentNum1 = 0;
        int currentNum2 = 0;
        int currentNum3 = 0;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            currentNum1 = firstNumber;
            if (secondNumber >= thirdNumber) {
                currentNum2 = secondNumber;
                currentNum3 = thirdNumber;

            } else {
                currentNum2 = thirdNumber;
                currentNum3 = secondNumber;
            }

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            currentNum1 = secondNumber;
            if (firstNumber >= thirdNumber) {
                currentNum2 = firstNumber;
                currentNum3 = thirdNumber;
            } else {
                currentNum2 = thirdNumber;
                currentNum3 = firstNumber;
            }
        } else {
            currentNum1 = thirdNumber;
            if (secondNumber >= firstNumber) {
                currentNum2 = secondNumber;
                currentNum3 = firstNumber;
            } else {
                currentNum2 = firstNumber;
                currentNum3 = secondNumber;
            }

        }
        System.out.println(currentNum1);
        System.out.println(currentNum2);
        System.out.println(currentNum3);
    }
}