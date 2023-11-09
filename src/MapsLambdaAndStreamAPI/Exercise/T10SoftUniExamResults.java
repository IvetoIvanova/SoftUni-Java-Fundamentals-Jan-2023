package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> usernamePoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] dataArr = input.split("-");
            String username = dataArr[0];

            if (input.contains("banned")) {
                usernamePoints.remove(username);
            } else {
                String language = dataArr[1];
                int points = Integer.parseInt(dataArr[2]);

                if (!usernamePoints.containsKey(username)) {
                    usernamePoints.put(username, points);
                } else {
                    int currentPoints = usernamePoints.get(username);

                    if (points > currentPoints) {
                        usernamePoints.put(username, points);
                    }
                }

                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    int currentCount = languageCount.get(language);
                    languageCount.put(language, currentCount + 1);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        usernamePoints.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}