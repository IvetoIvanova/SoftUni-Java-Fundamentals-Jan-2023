package MoreExercises;

import java.util.*;

public class MLS02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        Map<String, Integer> individualStatistics = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            contests.putIfAbsent(contest, new HashMap<>());
            Map<String, Integer> contestParticipants = contests.get(contest);

            if (contestParticipants.containsKey(username)) {
                int previousScore = contestParticipants.get(username);
                if (points > previousScore) {
                    contestParticipants.put(username, points);
                    individualStatistics.put(username, individualStatistics.get(username) - previousScore + points);
                }
            } else {
                contestParticipants.put(username, points);
                individualStatistics.put(username, individualStatistics.getOrDefault(username, 0) + points);
            }

            input = scanner.nextLine();
        }

        printContests(contests);

        System.out.println("Individual standings:");
        List<Map.Entry<String, Integer>> sortedIndividualStatistics = new ArrayList<>(individualStatistics.entrySet());
        printSortedIndividualStatistics(sortedIndividualStatistics);
    }

    private static void printSortedIndividualStatistics(List<Map.Entry<String, Integer>> sortedIndividualStatistics) {
        sorting(sortedIndividualStatistics);

        int position = 1;
        for (Map.Entry<String, Integer> entry : sortedIndividualStatistics) {
            System.out.println(position + ". " + entry.getKey() + " -> " + entry.getValue());
            position++;
        }
    }

    private static void printContests(Map<String, Map<String, Integer>> contests) {
        contests.forEach((contest, participants) -> {
            System.out.println(contest + ": " + participants.size() + " participants");
            List<Map.Entry<String, Integer>> sortedParticipants = new ArrayList<>(participants.entrySet());
            sorting(sortedParticipants);

            int position = 1;
            for (Map.Entry<String, Integer> participant : sortedParticipants) {
                System.out.println(position + ". " + participant.getKey() + " <::> " + participant.getValue());
                position++;
            }
        });
    }

    private static void sorting(List<Map.Entry<String, Integer>> sortedDataStructure) {
        sortedDataStructure.sort((p1, p2) -> {
            int pointsComparison = Integer.compare(p2.getValue(), p1.getValue());
            if (pointsComparison != 0) {
                return pointsComparison;
            }
            return p1.getKey().compareTo(p2.getKey());
        });
    }
}
