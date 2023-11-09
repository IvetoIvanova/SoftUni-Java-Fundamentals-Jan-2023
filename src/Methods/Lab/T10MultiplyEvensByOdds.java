package Methods.Lab;

import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensSumAndOddsSum(n));
    }

    public static int getMultipleOfEvensSumAndOddsSum(int num) {
        int evensSum = getEvenSum(num);
        int oddsSum = getOddSum(num);

        return evensSum * oddsSum;
    }

    public static int getEvenSum(int number) {
        int evensSum = 0;
        int num = Math.abs(number);

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit % 2 == 0) {
                evensSum += lastDigit;
            }
            num = num / 10;
        }

        return evensSum;
    }

    public static int getOddSum(int number) {
        int odsSum = 0;
        int num = Math.abs(number);

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit % 2 != 0) {
                odsSum += lastDigit;
            }
            num = num / 10;
        }

        return odsSum;
    }
}