package MoreExercises;

import java.util.Scanner;

public class A06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        String[] ladybugIndexes = scanner.nextLine().split(" ");
        for (String index : ladybugIndexes) {
            int ladybugIndex = Integer.parseInt(index);
            if (ladybugIndex >= 0 && ladybugIndex < fieldSize) {
                field[ladybugIndex] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] parts = command.split(" ");
            int index = Integer.parseInt(parts[0]);
            String direction = parts[1];
            int flyLength = Integer.parseInt(parts[2]);

            if (index >= 0 && index < fieldSize && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                    index += flyLength;
                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }
                } else if (direction.equals("left")) {
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                }

                if (index >= 0 && index < fieldSize) {
                    field[index] = 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}
