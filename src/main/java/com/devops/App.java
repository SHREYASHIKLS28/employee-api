package com.devops;

public class App {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(1, "Biplab", "HR"));
        service.addEmployee(new Employee(2, "Shreyashi", "Engineering"));

        for (Employee emp : service.getAllEmployees()) {
            System.out.println(emp.getId() + " - " + emp.getName() + " - " + emp.getDepartment());
        }
    }
}
