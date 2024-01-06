package MoreExercises;

import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char encryptedLetter = scanner.next().charAt(0);
            char currentLetter = (char) (encryptedLetter + key);
            decryptedMessage.append(currentLetter);
        }
        System.out.println(decryptedMessage);
    }
}
