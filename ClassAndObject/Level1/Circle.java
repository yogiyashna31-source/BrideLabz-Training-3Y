package Level1;
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor with default radius of 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = (radius >= 0) ? radius : 1.0; // Ensures non-negative radius, defaults to 1.0 if invalid
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : this.radius; // Ignores negative values
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Uses default constructor
        Circle circle2 = new Circle(5.0); // Uses parameterized constructor

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}