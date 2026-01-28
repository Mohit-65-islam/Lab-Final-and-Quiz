# Code
~~~
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0.0 and 4.0.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student ID: ");
        s.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Student CGPA: ");
        s.setCgpa(sc.nextDouble());

        System.out.println("\nStudent Details:");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());

        sc.close();
    }
}
~~~
