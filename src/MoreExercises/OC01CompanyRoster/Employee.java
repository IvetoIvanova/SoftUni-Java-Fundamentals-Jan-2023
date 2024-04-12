package MoreExercises.OC01CompanyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", name, salary, (email != null ? email : "n/a"), (age != -1 ? age : -1));
    }
}
