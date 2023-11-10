package TextProcessing.Lab;

import java.util.Scanner;

public class T01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (!text.equals("end")) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = text.length() - 1; i >= 0; i--) {
                char symbol = text.charAt(i);
                reverseWord.append(symbol);
            }
            System.out.printf("%s = %s%n", text, reverseWord);

            text = scanner.nextLine();
        }
    }
}