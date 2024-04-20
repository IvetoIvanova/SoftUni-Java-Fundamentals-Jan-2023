package MoreExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MLS01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contests = new HashMap<>();
        Map<String, Map<String, Integer>> submissions = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];
            contests.put(contest, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {
                submissions.putIfAbsent(username, new HashMap<>());
                Map<String, Integer> userSubmissions = submissions.get(username);
                userSubmissions.put(contest, Math.max(points, userSubmissions.getOrDefault(contest, 0)));
            }

            input = scanner.nextLine();
        }

        String bestCandidate = "";
        int maxPoints = Integer.MIN_VALUE;
        for (Map.Entry<String, Map<String, Integer>> entry : submissions.entrySet()) {
            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                bestCandidate = entry.getKey();
            }
        }

        System.out.println("Best candidate is " + bestCandidate + " with total " + maxPoints + " points.");

        System.out.println("Ranking:");
        submissions.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().entrySet().stream()
                            .sorted((subEntry1, subEntry2) -> Integer.compare(subEntry2.getValue(), subEntry1.getValue()))
                            .forEach(subEntry -> System.out.println("#  " + subEntry.getKey() + " -> " + subEntry.getValue()));
                });
    }
}