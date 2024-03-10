package Shape;

public class Cone extends Shape {
    // Attributes
    private double radius;
    private double height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)); // (h^2+r^2)^(1/2)
        return Math.PI * radius * (radius + slantHeight); // pi*r(r+(h^2+r^2)^(1/2))
    }

    // Method to calculate volume
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height; // (1/3)*pi*r^2
    }

    // toString method
    @Override
    public String toString() {
        return "Cone:\nRadius: " + radius + ", Height: " + height +
               ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + "\n";
    }
}
