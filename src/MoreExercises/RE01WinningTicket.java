package MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split("\\s*,+\\s*");
        checkLotteryTickets(tickets);
    }

    public static void checkLotteryTickets(String[] tickets) {
        Pattern pattern = Pattern.compile("([@#$^])\\1{5,9}");

        for (String ticket : tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            Matcher leftMatcher = pattern.matcher(ticket.substring(0, 10));
            Matcher rightMatcher = pattern.matcher(ticket.substring(10));

            if (leftMatcher.find() && rightMatcher.find() && leftMatcher.group().charAt(0) == rightMatcher.group().charAt(0)) {
                String matchSymbol = leftMatcher.group(1);
                int matchLength = Math.min(leftMatcher.group().length(), rightMatcher.group().length());
                if (matchLength == 10) {
                    System.out.println("ticket \"" + ticket + "\" - " + matchLength + matchSymbol + " Jackpot!");
                } else {
                    System.out.println("ticket \"" + ticket + "\" - " + matchLength + matchSymbol);
                }
            } else {
                System.out.println("ticket \"" + ticket + "\" - no match");
            }
        }
    }
}
