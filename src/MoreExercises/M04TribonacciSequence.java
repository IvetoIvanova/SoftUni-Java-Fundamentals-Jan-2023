package MoreExercises;

import java.util.Scanner;

public class M04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] tribonacci = new int[num];

        tribonacci[0] = 1;
        if (num > 1)
            tribonacci[1] = 1;
        if (num > 2)
            tribonacci[2] = 2;

        for (int i = 3; i < num; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        printTribonacciSequence(num, tribonacci);
    }

    private static void printTribonacciSequence(int num, int[] tribonacci) {
        for (int i = 0; i < num; i++) {
            System.out.print(tribonacci[i] + " ");
        }
    }
}