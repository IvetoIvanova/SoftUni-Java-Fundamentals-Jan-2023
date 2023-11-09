package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        System.out.println(sumDigits);
    }
}