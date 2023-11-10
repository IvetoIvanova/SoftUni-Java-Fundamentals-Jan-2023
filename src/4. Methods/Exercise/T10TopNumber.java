package Methods.Exercise;

import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 0; number <= n; number++) {

            if (isSumOfDigitsIsDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumOfDigitsIsDivisibleBy8(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        return sum % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}