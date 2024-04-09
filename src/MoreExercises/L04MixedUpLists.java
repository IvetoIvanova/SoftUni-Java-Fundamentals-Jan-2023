package MoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (String num : firstLine) {
            firstList.add(Integer.parseInt(num));
        }

        for (String num : secondLine) {
            secondList.add(Integer.parseInt(num));
        }

        List<Integer> resultList = mixLists(firstList, secondList);

        List<Integer> finalResult = getFinalResult(firstList, secondList, resultList);

        Collections.sort(finalResult);

        for (Integer num : finalResult) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> getFinalResult(List<Integer> firstList, List<Integer> secondList, List<Integer> resultList) {
        int minRange;
        int maxRange;
        if (firstList.size() > secondList.size()) {
            maxRange = Math.max(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
            minRange = Math.min(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
        } else {
            maxRange = Math.max(secondList.get(0), secondList.get(1));
            minRange = Math.min(secondList.get(0), secondList.get(1));
        }

        List<Integer> finalResult = new ArrayList<>();

        for (Integer num : resultList) {
            if (num > minRange && num < maxRange) {
                finalResult.add(num);
            }
        }
        return finalResult;
    }

    private static List<Integer> mixLists(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            int lastIndex = secondList.size() - 1;
            for (int i = 0; i <= lastIndex; i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(secondList.size() - 1));
                secondList.remove(secondList.get(secondList.size() - 1));
            }
        } else if (secondList.size() > firstList.size()) {
            int lastIndex = secondList.size() - 1;
            for (int i = lastIndex; i > 1; i--) {
                resultList.add(secondList.get(i));
                resultList.add(firstList.get(0));
                firstList.remove(firstList.get(0));
            }
        }

        return resultList;
    }
}
