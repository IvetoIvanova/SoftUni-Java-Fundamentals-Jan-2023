package MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split("\\|");
        String capitalLettersPattern = parts[0];
        String regexForFirstPart = "([$#%*&])([A-Z]+)\\1";

        Pattern pattern = Pattern.compile(regexForFirstPart);
        Matcher matcher = pattern.matcher(capitalLettersPattern);

        String capitalLettersStr = "";
        while (matcher.find()) {
            capitalLettersStr = matcher.group(2);
        }

        char[] capitalLettersArr = capitalLettersStr.toCharArray();
        String asciiCodeAndLength = parts[1];
        String regexForSecondPart = "\\d+:\\d{2}";

        Pattern patternSecondPart = Pattern.compile(regexForSecondPart);
        Map<Character, Integer> lengthMap = getLengthMap(patternSecondPart, asciiCodeAndLength, capitalLettersArr);

        String[] thirdPart = parts[2].split("\\s+");

        for (String str : thirdPart) {
            char firstLetter = str.charAt(0);

            if (lengthMap.containsKey(firstLetter)) {
                int lengthOfTheWord = (lengthMap.get(firstLetter)) + 1;
                if (lengthOfTheWord == str.length()) {
                    System.out.println(str.substring(0, lengthOfTheWord));
                }
            }
        }
    }

    private static Map<Character, Integer> getLengthMap(Pattern patternSecondPart, String asciiCodeAndLength, char[] capitalLettersArr) {
        Matcher matcherSecondPart = patternSecondPart.matcher(asciiCodeAndLength);

        Map<Character, Integer> lengthMap = new HashMap<>();
        List<String> matchesOfSecondPartList = new ArrayList<>();

        while (matcherSecondPart.find()) {
            matchesOfSecondPartList.add(matcherSecondPart.group());
        }

        for (String str : matchesOfSecondPartList) {
            String[] wordsInfo = str.split(":");
            if (wordsInfo.length == 2) {
                int asciiCodeOfCurrentLetter = Integer.parseInt(wordsInfo[0]);
                char letter = (char) asciiCodeOfCurrentLetter;
                int length = Integer.parseInt(wordsInfo[1]);

                for (Character letterFromTheFirstPart : capitalLettersArr) {
                    if (letter == letterFromTheFirstPart && length >= 1 && length <= 20) {
                        lengthMap.put(letter, length);
                    }
                }
            }
        }
        return lengthMap;
    }
}
