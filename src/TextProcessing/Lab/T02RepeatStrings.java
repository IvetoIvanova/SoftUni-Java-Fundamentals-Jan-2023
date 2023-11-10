package TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();
        for (String currentWord : wordsArr) {
            int length = currentWord.length();

            String repeatWord = repeatString(length, currentWord);

            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(int n, String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
}