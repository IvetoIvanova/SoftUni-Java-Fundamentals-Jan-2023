package Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class T07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumber = new ArrayList<>();

        for (int number : numbers) {
            if (number >= 0) {
                positiveNumber.add(number);
            }
        }
        Collections.reverse(positiveNumber);

        if (positiveNumber.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(positiveNumber.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replaceAll(",", ""));
        }
    }
}