package MoreExercises;

import java.util.Scanner;

public class TP01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            extractNameAndAge(line);
        }
    }

    public static void extractNameAndAge(String line) {
        int atIndex = line.indexOf('@');
        int hashIndex = line.indexOf('#');

        if (atIndex != -1 && hashIndex != -1) {
            String name = extractSubstring(line, atIndex, '|');
            String age = extractSubstring(line, hashIndex, '*');
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }

    public static String extractSubstring(String line, int startIndex, char endChar) {
        int endIndex = line.indexOf(endChar, startIndex + 1);
        if (endIndex != -1) {
            return line.substring(startIndex + 1, endIndex).trim();
        }
        return "";
    }
}
