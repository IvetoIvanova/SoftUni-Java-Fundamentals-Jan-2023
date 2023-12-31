package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class T04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}