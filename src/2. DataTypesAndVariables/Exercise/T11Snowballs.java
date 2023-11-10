package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;

        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int snowBall = 1; snowBall <= n; snowBall++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowBallValue > maxValue) {
                maxValue = snowBallValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d) ", snowballSnowBiggest, snowballTimeBiggest, maxValue, snowballQualityBiggest);
    }
}