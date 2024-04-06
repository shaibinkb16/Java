import java.util.Scanner;

class Employee {
    private int eNo;
    private String eName;
    private double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int getENo() {
        return eNo;
    }

    public String getEName() {
        return eName;
    }

    public double getESalary() {
        return eSalary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
    System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : Employee\nDate : 26/02/2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("Enter the employee number to search: ");
        int searchENo = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getENo() == searchENo) {
                found = true;
                System.out.println("Employee found:");
                System.out.println("Employee Number: " + emp.getENo());
                System.out.println("Employee Name: " + emp.getEName());
                System.out.println("Employee Salary: " + emp.getESalary());
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with employee number " + searchENo + " not found.");
        }

        scanner.close();
    }
}

