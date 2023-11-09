package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex = 0;
        int bestStart = 0;
        int length = 1;
        int maxLength = 0;

        for (int i = 1; i < numbersArr.length; i++) {
            if (numbersArr[i] == numbersArr[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}