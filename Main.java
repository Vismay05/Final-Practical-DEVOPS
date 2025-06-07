import java.util.Scanner;

  class StudentInfo {
        String name;
        int birthYear;

        StudentInfo(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        void displayInfo() {
            int currentYear = 2025;
            int age = currentYear - birthYear;
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    public class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        StudentInfo s = new StudentInfo(name, birthYear);
        s.displayInfo();

        sc.close();
    }

    }


