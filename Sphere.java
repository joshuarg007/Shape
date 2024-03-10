package Shape;

public class Sphere extends Shape{
    // Attributes
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculate surface area
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2); // 4*pi*r^2
    }

    // Method to calculate volume
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // (4/3)*pi*r^3
    }

    // toString method
    @Override
    public String toString() {
        return "Sphere:\nRadius: " + radius + ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + "\n";
    }
}
