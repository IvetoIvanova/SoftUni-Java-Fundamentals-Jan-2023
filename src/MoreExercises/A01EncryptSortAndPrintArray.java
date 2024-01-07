package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] encryptedNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int encryptedValue = encryptString(input);
            encryptedNumbers[i] = encryptedValue;
        }

        Arrays.sort(encryptedNumbers);

        for (int number : encryptedNumbers) {
            System.out.println(number);
        }
    }

    private static int encryptString(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (isVowel(currentChar)) {
                result += (int) currentChar * str.length();
            } else {
                result += (int) currentChar / str.length();
            }
        }

        return result;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
