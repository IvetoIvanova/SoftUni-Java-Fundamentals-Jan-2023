package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        double result = mathPower(firstNum, secondNum);
        System.out.println(df.format(result));
    }

    public static double mathPower(double number, int power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;

        }
        return result;
    }
}