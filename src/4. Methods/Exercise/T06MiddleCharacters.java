package Methods.Exercise;

import java.util.Scanner;

public class T06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacters(text);
    }

    public static void printMiddleCharacters(String text) {

        if (text.length() % 2 != 0) {
            int indexMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexMiddleChar));
        } else {
            int indexOfFirstMiddleChar = text.length() / 2 - 1;
            int indexOfSecondMiddleChar = text.length() / 2;

            System.out.print(text.charAt(indexOfFirstMiddleChar));
            System.out.print(text.charAt(indexOfSecondMiddleChar));
        }
    }
}