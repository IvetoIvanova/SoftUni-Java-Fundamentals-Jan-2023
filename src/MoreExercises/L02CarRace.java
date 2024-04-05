package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class L02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] raceTrack = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int middleIndex = raceTrack.length / 2;
        double leftTotalTime = calculateLeftTotalTime(raceTrack, 0, middleIndex - 1);
        double rightTotalTime = calculateRightTotalTime(raceTrack, raceTrack.length - 1, middleIndex + 1);

        String winner;
        double winnerTotalTime;
        if (leftTotalTime < rightTotalTime) {
            winner = "left";
            winnerTotalTime = leftTotalTime;
        } else {
            winner = "right";
            winnerTotalTime = rightTotalTime;
        }

        System.out.printf("The winner is %s with total time: %.1f\n", winner, winnerTotalTime);
    }

    private static double calculateLeftTotalTime(int[] raceTrack, int startIndex, int endIndex) {
        double totalTime = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            double stepTime = raceTrack[i];
            if (stepTime == 0) {
                totalTime = totalTime * 0.8;
            }
            totalTime += stepTime;
        }
        return totalTime;
    }

    private static double calculateRightTotalTime(int[] raceTrack, int startIndex, int endIndex) {
        double totalTime = 0;
        for (int i = startIndex; i >= endIndex; i--) {
            double stepTime = raceTrack[i];
            if (stepTime == 0) {
                totalTime = totalTime * 0.8;
            }
            totalTime += stepTime;
        }
        return totalTime;
    }
}
