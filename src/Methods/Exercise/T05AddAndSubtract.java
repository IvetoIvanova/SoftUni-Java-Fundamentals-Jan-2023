package Methods.Exercise;

import java.util.Scanner;

public class T05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = Integer.parseInt(scanner.nextLine());
        int secondInteger = Integer.parseInt(scanner.nextLine());
        int thirdInteger = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractTheThirdIntegerFromTheSum(firstInteger, secondInteger, thirdInteger));
    }

    public static int subtractTheThirdIntegerFromTheSum(int firstNumber, int secondNumber, int thirdNumber) {
        int result = sumOfTheFirstAndTheSecondInteger(firstNumber, secondNumber) - thirdNumber;
        return result;
    }

    public static int sumOfTheFirstAndTheSecondInteger(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum;
    }
}