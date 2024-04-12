package MoreExercises.OC01CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double averageSalary() {
        if (employees.isEmpty()) return 0;
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        return totalSalary / employees.size();
    }
}
