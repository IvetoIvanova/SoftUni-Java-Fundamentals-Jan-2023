package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password.append(currentSymbol);

        }

        String enteredPassword = scanner.nextLine();
        int countFailedTries = 0;

        while (!enteredPassword.equals(password.toString())) {
            countFailedTries++;

            if (countFailedTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (enteredPassword.equals(password.toString())) {
            System.out.printf("User %s logged in.", username);

        }
    }
}