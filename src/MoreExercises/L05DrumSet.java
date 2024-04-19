package MoreExercises;

import java.util.Scanner;

public class L05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        String[] initialQualitiesStr = scanner.nextLine().split("\\s+");
        int[] initialQualities = new int[initialQualitiesStr.length];

        for (int i = 0; i < initialQualities.length; i++) {
            initialQualities[i] = Integer.parseInt(initialQualitiesStr[i]);
        }

        int[] currentQualities = initialQualities.clone();

        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);

            for (int i = 0; i < currentQualities.length; i++) {
                currentQualities[i] -= hitPower;

                if (currentQualities[i] <= 0) {
                    double price = initialQualities[i] * 3.0;
                    if (savings >= price) {
                        savings -= price;
                        currentQualities[i] = initialQualities[i];
                    } else {
                        currentQualities = removeAtIndex(currentQualities, i);
                        initialQualities = removeAtIndex(initialQualities, i);
                        i--;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int quality : currentQualities) {
            System.out.print(quality + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.%n", savings);
    }

    private static int[] removeAtIndex(int[] array, int index) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        return newArray;
    }
}
