package MoreExercises;

import java.util.Scanner;

public class T03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String nameOfGame = scanner.nextLine();
        double sum = 0;
        String boughtGame = "";

        while (!nameOfGame.equals("Game Time")) {
            double priceOfGame = 0;

            switch (nameOfGame) {
                case "OutFall 4":
                    priceOfGame = 39.99;
                    if (budget >= priceOfGame) {
                        budget -= 39.99;
                        sum += 39.99;
                        boughtGame = "OutFall 4";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    priceOfGame = 15.99;
                    if (budget >= priceOfGame) {
                        budget -= 15.99;
                        sum += 15.99;
                        boughtGame = "CS: OG";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    priceOfGame = 19.99;
                    if (budget >= priceOfGame) {
                        budget -= 19.99;
                        sum += 19.99;
                        boughtGame = "Zplinter Zell";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    priceOfGame = 59.99;
                    if (budget >= priceOfGame) {
                        budget -= 59.99;
                        sum += 59.99;
                        boughtGame = "Honored 2";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    priceOfGame = 29.99;
                    if (budget >= priceOfGame) {
                        budget -= 29.99;
                        sum += 29.99;
                        boughtGame = "RoverWatch";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    priceOfGame = 39.99;
                    if (budget >= priceOfGame) {
                        budget -= 39.99;
                        sum += 39.99;
                        boughtGame = "RoverWatch Origins Edition";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (budget == 0) {
                break;
            }

            nameOfGame = scanner.nextLine();
        }

        if (budget == 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, budget);
        }
    }
}