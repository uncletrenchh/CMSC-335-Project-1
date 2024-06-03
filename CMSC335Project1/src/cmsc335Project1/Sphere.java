package cmsc335Project1;

/**
 * @author Omoniyi Tpmjones
 * Date: October 27, 2023
 * Description: This class represents a Sphere, which is a three-dimensional shape.
 * It holds the radius of the sphere and includes a method to calculate the volume.
 */

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
