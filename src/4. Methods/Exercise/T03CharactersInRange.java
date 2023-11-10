package Methods.Exercise;

import java.util.Scanner;

public class T03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharacter = scanner.nextLine().charAt(0);
        char secondCharacter = scanner.nextLine().charAt(0);

        printTheCharactersInTheGivenRange(firstCharacter, secondCharacter);
    }

    public static void printTheCharactersInTheGivenRange(char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}