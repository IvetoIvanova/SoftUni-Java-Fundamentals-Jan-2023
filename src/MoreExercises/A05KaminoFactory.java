package MoreExercises;

import java.util.Scanner;

public class A05KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = Integer.MIN_VALUE;
        int bestSequenceLength = Integer.MIN_VALUE;
        int bestSequenceStartingIndex = Integer.MAX_VALUE;
        int[] bestSequenceDNA = new int[length];

        int sequenceIndex = 0;

        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            int[] dnaSequence = parseDNASequence(input, length);

            int currentOnesLength = findLongestOnesSubsequence(dnaSequence);
            int currentSequenceSum = calculateSequenceSum(dnaSequence);
            int currentSequenceStartingIndex = findStartingIndex(dnaSequence);

            if (currentOnesLength > bestSequenceLength ||
                    (currentOnesLength == bestSequenceLength && currentSequenceStartingIndex < bestSequenceStartingIndex) ||
                    (currentOnesLength == bestSequenceLength && currentSequenceStartingIndex == bestSequenceStartingIndex && currentSequenceSum > bestSequenceSum)) {

                bestSequenceIndex = sequenceIndex;
                bestSequenceLength = currentOnesLength;
                bestSequenceStartingIndex = currentSequenceStartingIndex;
                bestSequenceSum = currentSequenceSum;
                bestSequenceDNA = dnaSequence.clone();
            }
            input = scanner.nextLine();
            sequenceIndex++;
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex + 1, bestSequenceSum);
        for (int gene : bestSequenceDNA) {
            System.out.print(gene + " ");
        }
    }

    private static int[] parseDNASequence(String input, int length) {
        String[] parts = input.split("!");
        int[] dnaSequence = new int[length];
        int index = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                dnaSequence[index++] = Integer.parseInt(part);
            }
        }
        return dnaSequence;
    }

    private static int findLongestOnesSubsequence(int[] dnaSequence) {
        int maxLength = 0;
        int currentLength = 0;

        for (int gene : dnaSequence) {
            if (gene == 1) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }

    private static int calculateSequenceSum(int[] dnaSequence) {
        int sum = 0;
        for (int gene : dnaSequence) {
            sum += gene;
        }
        return sum;
    }

    private static int findStartingIndex(int[] dnaSequence) {
        int startIndex = 0;
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < dnaSequence.length; i++) {
            if (dnaSequence[i] == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = i - maxLength + 1;
                }
            } else {
                currentLength = 0;
            }
        }
        return startIndex;
    }
}