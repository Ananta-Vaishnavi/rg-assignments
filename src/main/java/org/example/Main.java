package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeJDBC crud = new EmployeeJDBC();

        Employee e1 = new Employee(1, "Amit", "HR");
        Employee e2 = new Employee(2, "Suman", "IT");

        crud.addEmployee(e1);
        crud.addEmployee(e2);

        System.out.println("\nAll Employees:");
        crud.readEmployees();

        System.out.println("\nUpdating Suman...");
        crud.updateEmployee(2, "Suman", "Support");

        System.out.println("\nAfter Update:");
        crud.readEmployees();

        System.out.println("\nDeleting Employee ID 1...");
        crud.deleteEmployee(1);

        System.out.println("\nAfter Delete:");
        crud.readEmployees();
    }
}
