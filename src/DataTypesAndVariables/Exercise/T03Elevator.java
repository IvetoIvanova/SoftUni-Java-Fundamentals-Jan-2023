package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int numOfFullCourses = numberOfPeople / capacity;

        if (numberOfPeople % capacity != 0) {
            numOfFullCourses = numOfFullCourses + 1;
        }

        System.out.println(numOfFullCourses);
    }
}