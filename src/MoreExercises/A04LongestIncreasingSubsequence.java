package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();


        int[] len = new int[numbers.length];
        int[] prev = new int[numbers.length];

        Arrays.fill(len, 1);
        Arrays.fill(prev, -1);

        for (int p = 1; p < numbers.length; p++) {
            for (int left = 0; left < p; left++) {
                if (numbers[p] > numbers[left] && len[p] < 1 + len[left]) {
                    len[p] = 1 + len[left];
                    prev[p] = left;
                }
            }
        }

        int maxLengthIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (len[i] > len[maxLengthIndex]) {
                maxLengthIndex = i;
            }
        }

        int current = maxLengthIndex;
        StringBuilder result = new StringBuilder();
        while (current >= 0) {
            result.insert(0, numbers[current] + " ");
            current = prev[current];
        }

        System.out.println(result.toString().trim());
    }
}
