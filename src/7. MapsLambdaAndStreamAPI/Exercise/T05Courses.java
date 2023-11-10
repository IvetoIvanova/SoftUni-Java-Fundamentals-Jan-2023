package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }

            courses.get(course).add(studentName);
            input = scanner.nextLine();
        }

        courses.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            value.forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}