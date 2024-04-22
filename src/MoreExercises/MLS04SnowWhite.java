package MoreExercises;

import java.util.*;

public class MLS04SnowWhite {
    static class Dwarf {
        String name;
        String hatColor;
        int physics;

        public Dwarf(String name, String hatColor, int physics) {
            this.name = name;
            this.hatColor = hatColor;
            this.physics = physics;
        }

        @Override
        public String toString() {
            return "(" + hatColor + ") " + name + " <-> " + physics;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Dwarf> dwarfs = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Once upon a time")) {
            String[] parts = input.split(" <:> ");
            String name = parts[0];
            String hatColor = parts[1];
            int physics = Integer.parseInt(parts[2]);
            Dwarf newDwarf = new Dwarf(name, hatColor, physics);
            addOrUpdateDwarf(dwarfs, newDwarf);
        }

        dwarfs.sort((d1, d2) -> {
            if (d1.physics != d2.physics) {
                return Integer.compare(d2.physics, d1.physics);
            } else {
                int countD1 = countDwarfsWithHatColor(dwarfs, d1.hatColor);
                int countD2 = countDwarfsWithHatColor(dwarfs, d2.hatColor);
                return Integer.compare(countD2, countD1);
            }
        });

        for (Dwarf dwarf : dwarfs) {
            System.out.println(dwarf);
        }
    }

    private static void addOrUpdateDwarf(List<Dwarf> dwarfs, Dwarf newDwarf) {
        for (Dwarf existingDwarf : dwarfs) {
            if (existingDwarf.name.equals(newDwarf.name) && existingDwarf.hatColor.equals(newDwarf.hatColor)) {
                if (existingDwarf.physics < newDwarf.physics) {
                    dwarfs.remove(existingDwarf);
                    dwarfs.add(newDwarf);
                }
                return;
            }
        }
        dwarfs.add(newDwarf);
    }

    private static int countDwarfsWithHatColor(List<Dwarf> dwarfs, String hatColor) {
        int count = 0;
        for (Dwarf dwarf : dwarfs) {
            if (dwarf.hatColor.equals(hatColor)) {
                count++;
            }
        }
        return count;
    }
}
