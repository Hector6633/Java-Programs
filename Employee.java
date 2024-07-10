import java.util.Scanner;

public class Employee {
    int E_id;
    double E_salary;
    String E_name;

    // Constructor
    public Employee(int E_id, double E_salary, String E_name) {
        this.E_id = E_id;
        this.E_salary = E_salary;
        this.E_name = E_name;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + E_id);
        System.out.println("Employee Name: " + E_name);
        System.out.println("Employee Salary: " + E_salary);
    }
}



