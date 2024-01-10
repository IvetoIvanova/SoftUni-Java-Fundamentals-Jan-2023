package MoreExercises;

import java.util.Scanner;

public class M01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        processData(dataType, scanner);
    }

    public static void processData(String dataType, Scanner scanner) {
        if ("int".equals(dataType)) {
            int number = scanner.nextInt();
            int result = multiplyByTwo(number);
            System.out.println(result);
        } else if ("real".equals(dataType)) {
            double number = scanner.nextDouble();
            double result = multiplyByOnePointFive(number);
            System.out.printf("%.2f%n", result);
        } else if ("string".equals(dataType)) {
            String input = scanner.next();
            String result = surroundStringWithSymbol(input);
            System.out.println(result);
        } else {
            System.out.println("Invalid data type");
        }
    }

    private static int multiplyByTwo(int number) {
        return number * 2;
    }

    private static double multiplyByOnePointFive(double number) {
        return number * 1.5;
    }

    private static String surroundStringWithSymbol(String input) {
        return "$" + input + "$";
    }
}
