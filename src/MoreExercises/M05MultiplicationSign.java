package MoreExercises;

import java.util.Scanner;

public class M05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int productSign = getProductSigne(num1, num2, num3);

        if (productSign == 0) {
            System.out.println("zero");
        } else if (productSign > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    private static int getProductSigne(int num1, int num2, int num3) {
        int negativeCount = 0;

        if (num1 < 0) negativeCount++;
        if (num2 < 0) negativeCount++;
        if (num3 < 0) negativeCount++;

        if (negativeCount % 2 == 0) {
            if (num1 == 0 || num2 == 0 || num3 == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}