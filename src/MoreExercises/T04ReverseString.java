package MoreExercises;

import java.util.Scanner;

public class T04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int lastLetter = word.length() - 1;

        for (int i = lastLetter; i >= 0; i--) {
            char letter = word.charAt(i);
            System.out.print(letter);
        }
    }
}