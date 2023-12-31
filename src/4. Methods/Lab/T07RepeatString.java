package Methods.Lab;

import java.util.Scanner;

public class T07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(n, inputText));
    }

    public static String repeatString(int n, String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(text);
        }

        return result.toString();
    }
}