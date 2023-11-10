package TextProcessing.Exercise;

import java.util.Scanner;

public class T07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);

        int totalStrength = 0;
        for (int index = 0; index < builder.length(); index++) {
            char currentSymbol = builder.charAt(index);

            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(builder.charAt(index + 1) + "");
                totalStrength += explosionStrength;
            } else if (totalStrength > 0) {
                builder.deleteCharAt(index);
                totalStrength--;
                index--;
            }
        }
        System.out.println(builder);
    }
}