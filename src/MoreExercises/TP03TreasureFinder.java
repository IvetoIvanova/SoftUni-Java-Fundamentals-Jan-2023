package MoreExercises;

import java.util.Scanner;

public class TP03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyInput = scanner.nextLine();
        String[] keyParts = keyInput.split("\\s+");
        int[] key = new int[keyParts.length];
        for (int i = 0; i < keyParts.length; i++) {
            key[i] = Integer.parseInt(keyParts[i]);
        }

        String input = scanner.nextLine();
        while (!input.equals("find")) {
            String decrypted = decrypt(input, key);
            extractTreasure(decrypted);
            input = scanner.nextLine();
        }
    }

    private static String decrypt(String input, int[] key) {
        StringBuilder decrypted = new StringBuilder();
        int keyIndex = 0;
        for (char c : input.toCharArray()) {
            decrypted.append((char) (c - key[keyIndex]));
            keyIndex = (keyIndex + 1) % (key.length);
        }
        return decrypted.toString();
    }

    private static void extractTreasure(String decrypted) {
        int treasureStart = decrypted.indexOf("&");
        int treasureEnd = decrypted.indexOf("&", treasureStart + 1);
        int coordinatesStart = decrypted.indexOf("<");
        int coordinatesEnd = decrypted.indexOf(">");
        if (treasureStart != -1 && treasureEnd != -1 && coordinatesStart != -1 && coordinatesEnd != -1) {
            String treasureType = decrypted.substring(treasureStart + 1, treasureEnd);
            String coordinates = decrypted.substring(coordinatesStart + 1, coordinatesEnd);
            System.out.println("Found " + treasureType + " at " + coordinates);
        }
    }
}
