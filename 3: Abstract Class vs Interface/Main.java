import java.util.Scanner;

interface Drawable {
    void draw();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        double radius = sc.nextDouble();

        System.out.println("Enter length of rectangle");
        double length = sc.nextDouble();

        System.out.println("Enter width of rectangle");
        double width = sc.nextDouble();

        Shape c = new Circle(radius);
        Shape r = new Rectangle(length, width);

        System.out.println(c.area());
        System.out.println(r.area());

        ((Drawable) c).draw();
        ((Drawable) r).draw();
    }
}