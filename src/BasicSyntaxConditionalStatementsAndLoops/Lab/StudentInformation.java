package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avrGrade = Double.parseDouble(scanner.nextLine());

        String outputData = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, avrGrade);

        System.out.println(outputData);
    }
}