package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i];
                if (currentNumber + nextNumber == targetSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}