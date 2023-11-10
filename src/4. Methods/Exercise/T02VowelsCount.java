package Methods.Exercise;

import java.util.Scanner;

public class T02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {
        int count = 0;

        for (char symbol : text.toLowerCase().toCharArray()) {

            if (symbol == 'a' ||
                    symbol == 'o' ||
                    symbol == 'u' ||
                    symbol == 'e' ||
                    symbol == 'i') {
                count++;
            }
        }

        System.out.println(count);
    }
}