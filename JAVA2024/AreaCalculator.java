import java.util.Scanner;
abstract class Shape {
    abstract double calculateArea();
}

// Class representing a circle
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Class representing a rectangle
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double calculateArea() {
        return length * width;
    }
}
// Class representing a square
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
// Class representing a cylinder
class Cylinder extends Shape {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
// Class representing a triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Class representing a sphere
class Sphere extends Shape {
    double radius;
    Sphere(double r) {
        radius = r;
    }
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape (1.Circle, 2.Rectangle, 3.Square, 4.Cylinder, 5.Triangle, 6.Sphere):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: // Circle
                System.out.println("Enter the radius:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.calculateArea());
                break;
            case 2: // Rectangle
                System.out.println("Enter the length:");
                double length = scanner.nextDouble();
                System.out.println("Enter the width:");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                break;
            case 3: // Square
                System.out.println("Enter the side length:");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Area of Square: " + square.calculateArea());
                break;
            case 4: // Cylinder
                System.out.println("Enter the radius:");
                double r = scanner.nextDouble();
                System.out.println("Enter the height:");
                double h = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(r, h);
                System.out.println("Area of Cylinder: " + cylinder.calculateArea());
                break;
            case 5: // Triangle
                System.out.println("Enter the base length:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height:");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area of Triangle: " + triangle.calculateArea());
                break;
            case 6: // Sphere
                System.out.println("Enter the radius:");
                double rSphere = scanner.nextDouble();
                Sphere sphere = new Sphere(rSphere);
                System.out.println("Area of Sphere: " + sphere.calculateArea());
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
