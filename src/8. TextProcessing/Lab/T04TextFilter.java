package TextProcessing.Lab;

import java.util.Scanner;

public class T04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            text = text.replace(banWord, repeatString(banWord.length()));
        }

        System.out.println(text);
    }

    public static String repeatString(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}