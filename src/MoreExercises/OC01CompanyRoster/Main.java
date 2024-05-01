package MoreExercises.OC01CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String departmentName = employeeInfo[3];
            String email = "n/a";
            int age = -1;
            if (employeeInfo.length > 4) {
                email = employeeInfo[4];
                if (!email.contains("@")) {
                    age = Integer.parseInt(email);
                    email = "n/a";
                }
            }
            if (employeeInfo.length > 5) {
                age = Integer.parseInt(employeeInfo[5]);
            }

            Employee employee = new Employee(name, salary, position, departmentName, email, age);

            departments.putIfAbsent(departmentName, new Department(departmentName));
            departments.get(departmentName).addEmployee(employee);
        }

        double maxAverageSalary = Double.MIN_VALUE;
        String departmentWithMaxSalary = "";

        for (Department department : departments.values()) {
            double averageSalary = department.averageSalary();
            if (averageSalary > maxAverageSalary) {
                maxAverageSalary = averageSalary;
                departmentWithMaxSalary = department.name;
            }
        }

        System.out.println("Highest Average Salary: " + departmentWithMaxSalary);

        departments.get(departmentWithMaxSalary).employees.stream()
                .sorted(Comparator.comparingDouble(e -> -e.salary))
                .forEach(employee -> System.out.printf("%s %.2f %s %d%n",
                        employee.name, employee.salary, employee.email, employee.age));
    }
}
