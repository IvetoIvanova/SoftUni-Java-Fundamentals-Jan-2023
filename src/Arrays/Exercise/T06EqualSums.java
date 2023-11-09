package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbersArr[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbersArr.length - 1; rightIndex++) {
                rightSum += numbersArr[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }
        }

        System.out.println("no");
    }
}