package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int currentLitters = 0;

        for (int i = 1; i <= n; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            currentLitters += litersOfWater;

            if (currentLitters > capacity) {
                System.out.println("Insufficient capacity!");
                currentLitters -= litersOfWater;
            }
        }

        System.out.println(currentLitters);
    }
}