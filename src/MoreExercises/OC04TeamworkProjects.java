package MoreExercises;

import java.util.*;

public class OC04TeamworkProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teamCount = Integer.parseInt(scanner.nextLine());

        Map<String, String> teams = new HashMap<>();
        Map<String, Set<String>> members = new HashMap<>();

        for (int i = 0; i < teamCount; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("-");
            String user = tokens[0];
            String teamName = tokens[1];

            if (teams.containsKey(teamName)) {
                System.out.println("Team " + teamName + " was already created!");
            } else if (teams.containsValue(user)) {
                System.out.println(user + " cannot create another team!");
            } else {
                teams.put(teamName, user);
                members.put(teamName, new TreeSet<>());
                System.out.println("Team " + teamName + " has been created by " + user + "!");
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end of assignment")) {
            String[] tokens = command.split("->");
            String user = tokens[0];
            String teamName = tokens[1];

            if (!teams.containsKey(teamName)) {
                System.out.println("Team " + teamName + " does not exist!");
            } else if (members.get(teamName).contains(user) || teams.get(teamName).equals(user)) {
                System.out.println("Member " + user + " cannot join team " + teamName + "!");
            } else {
                members.get(teamName).add(user);
            }

            command = scanner.nextLine();
        }

        List<String> teamsToDisband = new ArrayList<>();

        teams.keySet().stream()
                .filter(s -> members.get(s).isEmpty())
                .sorted()
                .forEach(teamName -> {
                    teams.remove(teamName);
                    members.remove(teamName);
                    teamsToDisband.add(teamName);
                });

        teams.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((entry1, entry2) -> Integer.compare(members.get(entry2.getKey()).size(), members.get(entry1.getKey()).size()))
                .forEach(entry -> {
                    String teamName = entry.getKey();
                    System.out.println(teamName);

                    String creator = teams.get(teamName);
                    System.out.println("- " + creator);

                    members.get(teamName).forEach(member -> System.out.println("-- " + member));
                });

        System.out.println("Teams to disband:");
        Collections.sort(teamsToDisband);

        if (!teamsToDisband.isEmpty()) {
            for (String team : teamsToDisband) {
                System.out.println(team);
            }
        }
    }
}