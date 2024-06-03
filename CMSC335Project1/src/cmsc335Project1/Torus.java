package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This class represents a Torus, which is a three-dimensional shape.
 * It holds the major and minor radii of the torus and includes a method to calculate the volume. *
 */

public class Torus extends ThreeDimensionalShape {
	   private double majorRadius; // Radius of the center of the tube to the center of the torus
	   private double minorRadius; // Radius of the tube

	   public Torus(double majorRadius, double minorRadius) {
	       this.majorRadius = majorRadius;
	       this.minorRadius = minorRadius;
	   }

	   @Override
	   double getVolume() {
	       return (2 * Math.pow(Math.PI, 2)) * Math.pow(minorRadius, 2) * majorRadius;
	   }
	}
