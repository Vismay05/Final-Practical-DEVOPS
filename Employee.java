import java.util.Scanner;

 class Person {
    String name;
    int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        int currentYear = 2025;
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
    }
}

public class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, int birthYear, String empId, double salary) {
        super(name, birthYear);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();  // consume leftover newline

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, birthYear, empId, salary);
        System.out.println("\nEmployee Details:");
        emp.displayEmployeeDetails();

        scanner.close();
    }
}
