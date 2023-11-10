package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d%n", n, times, n * times);
        }

        while (times <= 10) {
            int product = n * times;

            System.out.printf("%d X %d = %d%n", n, times, product);
            times++;
        }
    }
}
