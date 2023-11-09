package Arrays.Exercise;

import java.util.Scanner;

public class T02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }
}