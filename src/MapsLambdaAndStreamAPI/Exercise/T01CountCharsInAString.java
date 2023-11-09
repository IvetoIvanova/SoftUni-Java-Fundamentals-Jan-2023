package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> characterCounts = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (symbol == ' ') {
                continue;
            }

            if (characterCounts.containsKey(symbol)) {
                int currentCount = characterCounts.get(symbol);
                characterCounts.put(symbol, currentCount + 1);
            } else {
                characterCounts.put(symbol, 1);
            }
        }

        characterCounts.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}