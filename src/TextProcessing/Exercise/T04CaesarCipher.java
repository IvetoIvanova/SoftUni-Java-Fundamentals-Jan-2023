package TextProcessing.Exercise;

import java.util.Scanner;

public class T04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3);
            encryptedText.append(encryptSymbol);
        }

        System.out.println(encryptedText);
    }
}