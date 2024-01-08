package MoreExercises;

import java.util.Scanner;

public class A03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getFibonacci(n));
    }

    private static int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
