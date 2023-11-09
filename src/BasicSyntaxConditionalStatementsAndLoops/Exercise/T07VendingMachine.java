package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String general = scanner.nextLine();
        double sumCoins = 0;

        while (!general.equals("Start")) {
            double coin = Double.parseDouble(general);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1.0 && coin != 2.0) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sumCoins += coin;
            }
            general = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")) {
            boolean enoughMoney = true;

            switch (product) {
                case "Nuts":
                    if (sumCoins < 2) {
                        System.out.println("Sorry, not enough money");
                        enoughMoney = false;
                    } else {
                        sumCoins -= 2;
                    }
                    break;
                case "Water":
                    if (sumCoins < 0.7) {
                        System.out.println("Sorry, not enough money");
                        enoughMoney = false;
                    } else {
                        sumCoins -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (sumCoins < 1.5) {
                        System.out.println("Sorry, not enough money");
                        enoughMoney = false;
                    } else {
                        sumCoins -= 1.5;
                    }
                    break;
                case "Soda":
                    if (sumCoins < 0.8) {
                        System.out.println("Sorry, not enough money");
                        enoughMoney = false;
                    } else {
                        sumCoins -= 0.8;
                    }
                    break;
                case "Coke":
                    if (sumCoins < 1.0) {
                        System.out.println("Sorry, not enough money");
                        enoughMoney = false;
                    } else {
                        sumCoins -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    enoughMoney = false;
                    break;
            }

            if (!enoughMoney) {
                product = scanner.nextLine();
                continue;
            }

            System.out.printf("Purchased %s%n", product);
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sumCoins);
    }
}