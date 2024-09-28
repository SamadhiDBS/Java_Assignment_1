import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor to initialize the circle's radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegionArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the radii of the inner and outer circles
        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();
        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        // Create Circle objects for the inner and outer circles
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute the area of the inner and outer circles
        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        // Compute the area of the circular region
        double circularRegionArea = outerArea - innerArea;

        // Display the result
        System.out.printf("The area of the circular region is: %.2f%n", circularRegionArea);

        scanner.close();
    }
}
