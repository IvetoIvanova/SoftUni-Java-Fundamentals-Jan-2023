package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int currentElement : numbersArr) {
            if (currentElement % 2 == 0) {
                sum += currentElement;
            }
        }
        System.out.println(sum);
    }
}