package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This is an abstract class that represents a three-dimensional shape.
 * It extends the Shape class and includes an abstract method to get the volume of the shape.
 */

public abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape() {
        super(3);
    }

    abstract double getVolume();
}
