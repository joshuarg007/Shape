package Shape;

public class Cylinder extends Shape {
    // Attributes
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height); // 2*pi*r+(r+h)
    }

    // Method to calculate volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height; // pi*r*h
    }

    // toString method
    @Override
    public String toString() {
        return "Cylinder:\nRadius: " + radius + ", Height: " + height +
               ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + "\n";
    }
}
