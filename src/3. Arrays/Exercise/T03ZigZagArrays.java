package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr1 = new int[n];
        int[] numbersArr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] numbersArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {
                numbersArr1[i] = numbersArr[0];
                numbersArr2[i] = numbersArr[1];
            } else {
                numbersArr1[i] = numbersArr[1];
                numbersArr2[i] = numbersArr[0];
            }
        }

        for (int numbers1 : numbersArr1) {
            System.out.print(numbers1 + " ");
        }

        System.out.println();

        for (int numbers2 : numbersArr2) {
            System.out.print(numbers2 + " ");
        }
    }
}