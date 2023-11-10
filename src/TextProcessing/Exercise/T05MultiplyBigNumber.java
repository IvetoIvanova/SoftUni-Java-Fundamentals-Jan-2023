package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class T05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}