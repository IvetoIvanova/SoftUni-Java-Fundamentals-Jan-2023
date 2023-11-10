package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentNum = 0;
        int lastNum = 0;

        for (int i = 0; i <= numbersArr.length - 1; i++) {
            currentNum = numbersArr[i];

            if (i == numbersArr.length - 1) {
                System.out.print(currentNum + " ");
                continue;
            }

            boolean isTopInt = false;
            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                int nextNumber = numbersArr[j];
                if (currentNum > nextNumber) {
                    isTopInt = true;
                } else {
                    isTopInt = false;
                    break;
                }
            }

            if (isTopInt) {
                System.out.print(currentNum + " ");
            }
        }
    }
}