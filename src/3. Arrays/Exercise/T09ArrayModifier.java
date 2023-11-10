package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputParts = input.split(" ");
            String inputType = inputParts[0];

            switch (inputType) {
                case "swap":
                    int index1 = Integer.parseInt(inputParts[1]);
                    int element1 = numbersArr[index1];
                    int index2 = Integer.parseInt(inputParts[2]);
                    int element2 = numbersArr[index2];
                    numbersArr[index1] = element2;
                    numbersArr[index2] = element1;
                    break;
                case "multiply":

                    int multiplyIndex1 = Integer.parseInt(inputParts[1]);
                    int multiplyElement1 = numbersArr[multiplyIndex1];
                    int multiplyIndex2 = Integer.parseInt(inputParts[2]);
                    int multiplyElement2 = numbersArr[multiplyIndex2];

                    int product = multiplyElement1 * multiplyElement2;
                    numbersArr[multiplyIndex1] = product;
                    break;
                case "decrease":

                    for (int index = 0; index <= numbersArr.length - 1; index++) {
                        numbersArr[index] = numbersArr[index] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int index = 0; index <= numbersArr.length - 1; index++) {
            if (index != numbersArr.length - 1) {
                System.out.print(numbersArr[index] + ", ");
            } else {
                System.out.print(numbersArr[index]);
            }
        }
    }
}