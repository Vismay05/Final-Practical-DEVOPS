import java.util.Scanner;
//package course
class Course {
    String name;
    int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayCourse() {
        System.out.println(name + ":" + marks + " marks");
    }
}

public class master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter course name: ");
            String courseName = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            courses[i] = new Course(courseName, marks);
        }

        System.out.println("\nCourse Information:");
        for (Course c : courses) {
            c.displayCourse();
        }

        sc.close();
    }
}
    

