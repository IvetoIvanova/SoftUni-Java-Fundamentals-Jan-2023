package Methods.Exercise;

import java.util.Scanner;

public class T07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printNxNMatrix(n);
    }

    public static void printNxNMatrix(int num) {
        for (int i = 1; i <= num; i++) {
            printRowOfMatrix(num);
            System.out.println();
        }
    }

    public static void printRowOfMatrix(int number) {
        for (int index = 1; index <= number; index++) {
            System.out.print(number + " ");
        }
    }
}