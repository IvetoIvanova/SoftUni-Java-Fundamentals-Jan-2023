package MoreExercises;

import java.util.Scanner;

public class M03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = new int[8];
        for (int i = 0; i < 8; i++) {
            coordinates[i] = scanner.nextInt();
        }

        double distance1 = Math.sqrt(coordinates[0] * coordinates[0] + coordinates[1] * coordinates[1]);
        double distance2 = Math.sqrt(coordinates[2] * coordinates[2] + coordinates[3] * coordinates[3]);
        double distance3 = Math.sqrt(coordinates[4] * coordinates[4] + coordinates[5] * coordinates[5]);
        double distance4 = Math.sqrt(coordinates[6] * coordinates[6] + coordinates[7] * coordinates[7]);

        double length1 = Math.sqrt(Math.pow(coordinates[0] - coordinates[2], 2) + Math.pow(coordinates[1] - coordinates[3], 2));
        double length2 = Math.sqrt(Math.pow(coordinates[4] - coordinates[6], 2) + Math.pow(coordinates[5] - coordinates[7], 2));

        if (length1 >= length2) {
            printResultFirstCloserPoint(distance1, distance2, coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
        } else {
            printResultFirstCloserPoint(distance3, distance4, coordinates[4], coordinates[5], coordinates[6], coordinates[7]);
        }
    }

    private static void printResultFirstCloserPoint(double distance1, double distance2, int x1, int y1, int x2, int y2) {
        if (distance1 < distance2) {
            System.out.println("(" + x1 + ", " + y1 + ")(" + x2 + ", " + y2 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ")(" + x1 + ", " + y1 + ")");
        }
    }
}
