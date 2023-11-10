package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade);
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double sumOfGrades = 0;
            double averageGrade = 0;
            for (int i = 0; i < grades.size(); i++) {
                double gradeOfStudent = grades.get(i);
                sumOfGrades += gradeOfStudent;
                averageGrade = sumOfGrades / grades.size();
            }
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}