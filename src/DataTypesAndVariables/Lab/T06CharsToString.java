package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);
        char character3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", character1, character2, character3);
    }
}