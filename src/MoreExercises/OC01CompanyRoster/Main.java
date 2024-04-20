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
            String email = (employeeInfo.length > 4) ? employeeInfo[4] : null;
            int age = (employeeInfo.length > 5) ? Integer.parseInt(employeeInfo[5]) : -1;

            Employee employee = new Employee(name, salary, position, departmentName, email, age);

            departments.computeIfAbsent(departmentName, Department::new).addEmployee(employee);
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

        departments.get(departmentWithMaxSalary).employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.printf("Highest Average Salary: %s%n", departmentWithMaxSalary);

        for (Employee employee : departments.get(departmentWithMaxSalary).employees) {
            System.out.println(employee);
        }
    }
}