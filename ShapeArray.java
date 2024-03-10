package Shape;

public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate a Sphere
        Sphere sphere = new Sphere(6.0);

        // Instantiate a Cylinder
        Cylinder cylinder = new Cylinder(3.0, 9.0);

        // Instantiate a Cone
        Cone cone = new Cone(3.0, 6.0);

        // Store instances in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print instance data
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
