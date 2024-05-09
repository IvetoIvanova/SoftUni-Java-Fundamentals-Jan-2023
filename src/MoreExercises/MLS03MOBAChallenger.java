package MoreExercises;

import java.util.*;

public class MLS03MOBAChallenger {
    static class Player {
        String name;
        Map<String, Integer> positions;

        public Player(String name) {
            this.name = name;
            this.positions = new HashMap<>();
        }

        public void addPosition(String position, int skill) {
            if (!positions.containsKey(position) || positions.get(position) < skill) {
                positions.put(position, skill);
            }
        }

        public int getTotalSkill() {
            return positions.values().stream().mapToInt(Integer::intValue).sum();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Player> players = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Season end")) {
            String[] tokens = input.split(" -> | vs ");
            if (tokens.length == 3) {
                String playerName = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);
                players.putIfAbsent(playerName, new Player(playerName));
                players.get(playerName).addPosition(position, skill);
            } else if (tokens.length == 2) {
                String player1Name = tokens[0];
                String player2Name = tokens[1];
                if (players.containsKey(player1Name) && players.containsKey(player2Name)) {
                    Player player1 = players.get(player1Name);
                    Player player2 = players.get(player2Name);
                    int player1TotalSkill = player1.getTotalSkill();
                    int player2TotalSkill = player2.getTotalSkill();
                    Set<String> commonPositions = new HashSet<>(player1.positions.keySet());
                    commonPositions.retainAll(player2.positions.keySet());
                    if (!commonPositions.isEmpty()) {
                        if (player1TotalSkill > player2TotalSkill) {
                            players.remove(player2Name);
                        } else if (player1TotalSkill < player2TotalSkill) {
                            players.remove(player1Name);
                        }
                    }
                }
            }
        }

        List<Player> playerList = new ArrayList<>(players.values());
        playerList.sort((p1, p2) -> {
            int totalSkillComparison = Integer.compare(p2.getTotalSkill(), p1.getTotalSkill());
            if (totalSkillComparison == 0) {
                return p1.name.compareTo(p2.name);
            }
            return totalSkillComparison;
        });

        for (Player player : playerList) {
            System.out.println(player.name + ": " + player.getTotalSkill() + " skill");
            player.positions.entrySet().stream()
                    .sorted((e1, e2) -> {
                        if (e1.getValue().equals(e2.getValue())) {
                            return e1.getKey().compareTo(e2.getKey());
                        }
                        return Integer.compare(e2.getValue(), e1.getValue());
                    })
                    .forEach(e -> System.out.println("- " + e.getKey() + " <::> " + e.getValue()));
        }
    }
}
