package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpices = 0;

        while (startingYield >= 100) {
            int spices = startingYield - 26;
            totalSpices += spices;
            days++;
            startingYield -= 10;
        }

        System.out.println(days);

        if (totalSpices >= 26) {
            totalSpices -= 26;
        }

        System.out.println(totalSpices);
    }
}