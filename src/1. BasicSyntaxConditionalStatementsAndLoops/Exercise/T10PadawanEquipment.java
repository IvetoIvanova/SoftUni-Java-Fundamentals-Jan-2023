package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        double singlePriceOfSabers = Double.parseDouble(scanner.nextLine());
        double singlePriceOfRobes = Double.parseDouble(scanner.nextLine());
        double singlePriceOfBelts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(numOfStudents + 0.10 * numOfStudents) * singlePriceOfSabers;
        double sumRobes = numOfStudents * singlePriceOfRobes;
        double sumOfBelts = (numOfStudents - numOfStudents / 6) * singlePriceOfBelts;
        double totalSum = sumLight + sumRobes + sumOfBelts;

        if (totalSum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }
    }
}