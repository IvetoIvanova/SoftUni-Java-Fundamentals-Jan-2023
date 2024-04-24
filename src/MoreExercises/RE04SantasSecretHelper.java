package MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behavior>[G])!");
        while (!input.equals("end")) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char decryptedChar = (char) (input.charAt(i) - key);
                decryptedMessage.append(decryptedChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage.toString());
            while (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");
                if (isValidName(name) && isValidBehavior(behavior)) {
                    System.out.println(name);
                }
            }

            input = scanner.nextLine();
        }
    }

    private static boolean isValidName(String name) {
        return name.matches("[A-Za-z]+");
    }

    private static boolean isValidBehavior(String behavior) {
        return behavior.equals("G");
    }
}
