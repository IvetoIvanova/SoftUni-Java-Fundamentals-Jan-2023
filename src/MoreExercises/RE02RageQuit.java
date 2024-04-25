package MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> uniqueSymbols = new HashMap<>();

        Pattern pattern = Pattern.compile("(\\D+)(\\d+)");
        Matcher matcher = pattern.matcher(input);

        StringBuilder rageMessage = new StringBuilder();

        while (matcher.find()) {
            String group1 = matcher.group(1).toUpperCase();
            int repetition = Integer.parseInt(matcher.group(2));

            while (repetition != 0) {
                rageMessage.append(group1);
                for (int i = 0; i < group1.length(); i++) {
                    char currentChar = group1.charAt(i);
                    uniqueSymbols.put(Character.toUpperCase(currentChar), 1);
                }
                repetition--;
            }
        }

        System.out.println("Unique symbols used: " + uniqueSymbols.size());
        System.out.println(rageMessage);
    }
}
