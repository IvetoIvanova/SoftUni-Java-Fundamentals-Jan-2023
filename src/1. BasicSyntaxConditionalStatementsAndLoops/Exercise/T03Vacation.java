package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double pricePerPerson = 0;
        double totalPriceWithoutDiscount = 0.0;
        switch (typeOfTheGroup) {
            case "Students":
                if (dayOfTheWeek.equals("Friday")) {
                    totalPriceWithoutDiscount = 8.45 * countPeople;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    totalPriceWithoutDiscount = 9.80 * countPeople;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    totalPriceWithoutDiscount = 10.46 * countPeople;
                }
                break;
            case "Business":
                if (dayOfTheWeek.equals("Friday")) {
                    totalPriceWithoutDiscount = 10.90 * countPeople;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    totalPriceWithoutDiscount = 15.60 * countPeople;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    totalPriceWithoutDiscount = 16.00 * countPeople;
                }
                break;
            case "Regular":
                if (dayOfTheWeek.equals("Friday")) {
                    totalPriceWithoutDiscount = 15.00 * countPeople;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    totalPriceWithoutDiscount = 20.00 * countPeople;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    totalPriceWithoutDiscount = 22.50 * countPeople;
                }
                break;
        }
        double totalPriceWithDiscount = 0;

        if (typeOfTheGroup.equals("Students") && countPeople >= 30) {
            totalPriceWithDiscount = totalPriceWithoutDiscount - (totalPriceWithoutDiscount * 0.15);
        } else if (typeOfTheGroup.equals("Business") && countPeople >= 100) {
            pricePerPerson = totalPriceWithoutDiscount / countPeople;
            totalPriceWithDiscount = totalPriceWithoutDiscount - (10 * pricePerPerson);
        } else if (typeOfTheGroup.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            totalPriceWithDiscount = totalPriceWithoutDiscount - (totalPriceWithoutDiscount * 0.05);
        }

        if (totalPriceWithDiscount == 0) {
            System.out.printf("Total price: %.2f", totalPriceWithoutDiscount);
        } else {
            System.out.printf("Total price: %.2f", totalPriceWithDiscount);
        }
    }
}