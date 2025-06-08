import java.util.Scanner;

public class Person {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        Person p = new Person(name, birthYear);
        p.displayName();
        p.displayAge();

        scanner.close();
    }
}
