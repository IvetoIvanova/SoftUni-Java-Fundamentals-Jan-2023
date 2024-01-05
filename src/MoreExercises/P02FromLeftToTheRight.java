package MoreExercises;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numOfLines = Long.parseLong(scanner.nextLine());

        for (long line = 0; line < numOfLines; line++) {
            String[] numbersArr = scanner.nextLine().split("\\s+");

            long leftNumber = Long.parseLong(numbersArr[0]);
            long rightNumber = Long.parseLong(numbersArr[1]);

            long sumOfLeftDigits = sumUpTheDigits(leftNumber);
            long sumOfRightDigits = sumUpTheDigits(rightNumber);

            if (leftNumber > rightNumber) {
                System.out.println(sumOfLeftDigits);
            } else {
                System.out.println(sumOfRightDigits);
            }

        }
    }

    public static long sumUpTheDigits(long number) {
        long sum = 0;

        number = Math.abs(number);

        while (number != 0) {
            long lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }
}
