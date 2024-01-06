package MoreExercises;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (areEqual(num1, num2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean areEqual(double a, double b) {
        double eps = 0.000001;

        return Math.abs(a - b) < eps;
    }
}