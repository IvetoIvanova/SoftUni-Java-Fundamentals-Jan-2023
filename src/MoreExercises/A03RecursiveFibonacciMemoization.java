package MoreExercises;

import java.util.Scanner;

public class A03RecursiveFibonacciMemoization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] memo = new int[n + 1];
        initializeMemo(memo, -1);
        System.out.println(getFibonacci(n, memo));
    }

    public static void initializeMemo(int[] memo, int value) {
        for (int i = 0; i < memo.length; i++) {
            memo[i] = value;
        }
    }

    public static int getFibonacci(int n, int[] memo) {
        if (n <= 2) {
            return 1;
        } else if (memo[n] != -1) {
            return memo[n];
        } else {
            memo[n] = getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo);
            return memo[n];
        }
    }
}
