package MoreExercises;

import java.util.HashMap;
import java.util.Scanner;

public class TP04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Character> morseToCharMap = new HashMap<>();

        morseToCharMap.put(".-", 'A');
        morseToCharMap.put("-...", 'B');
        morseToCharMap.put("-.-.", 'C');
        morseToCharMap.put("-..", 'D');
        morseToCharMap.put(".", 'E');
        morseToCharMap.put("..-.", 'F');
        morseToCharMap.put("--.", 'G');
        morseToCharMap.put("....", 'H');
        morseToCharMap.put("..", 'I');
        morseToCharMap.put(".---", 'J');
        morseToCharMap.put("-.-", 'K');
        morseToCharMap.put(".-..", 'L');
        morseToCharMap.put("--", 'M');
        morseToCharMap.put("-.", 'N');
        morseToCharMap.put("---", 'O');
        morseToCharMap.put(".--.", 'P');
        morseToCharMap.put("--.-", 'Q');
        morseToCharMap.put(".-.", 'R');
        morseToCharMap.put("...", 'S');
        morseToCharMap.put("-", 'T');
        morseToCharMap.put("..-", 'U');
        morseToCharMap.put("...-", 'V');
        morseToCharMap.put(".--", 'W');
        morseToCharMap.put("-..-", 'X');
        morseToCharMap.put("-.--", 'Y');
        morseToCharMap.put("--..", 'Z');

        String morseCode = scanner.nextLine();
        StringBuilder englishText = new StringBuilder();

        String[] morseWords = morseCode.split(" ");
        for (String morseWord : morseWords) {
            morseWord = morseWord.replace("|", " ");
            char englishChar = morseToCharMap.getOrDefault(morseWord, ' ');
            englishText.append(englishChar);
        }
        System.out.println(englishText);
    }
}
