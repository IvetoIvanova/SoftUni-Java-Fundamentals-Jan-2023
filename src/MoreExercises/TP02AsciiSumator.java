package MoreExercises;

import java.util.Scanner;

public class TP02AsciiSumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char startChar = sc.nextLine().charAt(0);
        char endChar = sc.nextLine().charAt(0);
        String inputString = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar > startChar && currentChar < endChar) {
                sum += currentChar;
            }
        }

        System.out.println(sum);
    }
}
