package MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> inputNumbersList = new ArrayList<>();
        String[] numbersArray = input.split("\\s+");

        for (String token : numbersArray) {
            inputNumbersList.add(Integer.parseInt(token));
        }

        String text = scanner.nextLine();

        List<Character> result = getElementsFromText(inputNumbersList, text);
        for (char character : result) {
            System.out.print(character);
        }
    }

    public static List<Character> getElementsFromText(List<Integer> numbers, String text) {
        List<Character> result = new ArrayList<>();
        int textLength = text.length();

        for (int num : numbers) {
            int digitSum = sumOfDigits(num);
            int index = digitSum % textLength;
            char element = text.charAt(index);
            text = text.substring(0, index) + text.substring(index + 1);
            result.add(element);
        }

        return result;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
