package MoreExercises;

import java.util.Scanner;

public class T02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastDigit = number % 10;
        String nameOfNum = "";
        if (lastDigit == 1) {
            nameOfNum = "one";
        } else if (lastDigit == 2) {
            nameOfNum = "two";
        } else if (lastDigit == 3) {
            nameOfNum = "three";
        } else if (lastDigit == 4) {
            nameOfNum = "four";
        } else if (lastDigit == 5) {
            nameOfNum = "five";
        } else if (lastDigit == 6) {
            nameOfNum = "six";
        } else if (lastDigit == 7) {
            nameOfNum = "seven";
        } else if (lastDigit == 8) {
            nameOfNum = "eight";
        } else if (lastDigit == 9) {
            nameOfNum = "nine";
        } else if (lastDigit == 0) {
            nameOfNum = "zero";
        }

        System.out.println(nameOfNum);
    }
}