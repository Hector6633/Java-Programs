import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        // Reading employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline left-over
            System.out.print("Employee Name: ");
            String name = scanner.nextLine();

            employees[i] = new Employee(id, salary, name);
        }

        // Searching for an employee by ID
        System.out.print("Enter Employee ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.E_id == searchId) {
                System.out.println("Employee found:");
                employee.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        scanner.close();
    }
}
