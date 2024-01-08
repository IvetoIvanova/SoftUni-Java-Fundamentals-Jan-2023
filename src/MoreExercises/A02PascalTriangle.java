package MoreExercises;

import java.util.Scanner;

public class A02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();
        printPascalsTriangle(numRows);
    }

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        int[][] intermediateResults = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    intermediateResults[i][j] = 1;
                } else {
                    intermediateResults[i][j] = intermediateResults[i - 1][j - 1] + intermediateResults[i - 1][j];
                }
            }
        }

        return intermediateResults[n][k];
    }
}
