
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        setCgpa(cgpa);
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCgpa() {
        return cgpa;
    }

    void setCgpa(double cgpa) {
        if (cgpa < 0.0 || cgpa > 4.0) {
            throw new IllegalArgumentException();
        }
        this.cgpa = cgpa;
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double cgpa = sc.nextDouble();

        Student s = new Student(id, name, cgpa);

        System.out.println("Student id");
        System.out.println(s.getId());
        System.out.println("student name");
        System.out.println(s.getName());
        System.out.println("student CGPA");
        System.out.println(s.getCgpa());
    }
}
