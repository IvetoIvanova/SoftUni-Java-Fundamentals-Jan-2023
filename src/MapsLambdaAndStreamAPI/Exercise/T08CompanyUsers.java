package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> listOfEmployeesMap = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String employeesID = data[1];
            List<String> companies = listOfEmployeesMap.get(company);
            boolean containsID = companies != null && companies.contains(employeesID);

            if (!containsID) {
                listOfEmployeesMap.putIfAbsent(company, new ArrayList<>());
                listOfEmployeesMap.get(company).add(employeesID);
            }
            input = scanner.nextLine();
        }

        listOfEmployeesMap.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}