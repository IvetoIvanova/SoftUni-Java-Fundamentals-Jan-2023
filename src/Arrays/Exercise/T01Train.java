package Arrays.Exercise;

import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[countWagons];

        for (int i = 0; i < countWagons; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            arr[i] = countPeople;
        }

        int sumPeople = 0;
        for (int number : arr) {
            System.out.print(number + " ");
            sumPeople += number;
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}