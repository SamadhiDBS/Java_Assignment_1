import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegionArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();
        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        double circularRegionArea = outerArea - innerArea;

        System.out.printf("The area of the circular region is: %.2f%n", circularRegionArea);

        scanner.close();
    }
}
