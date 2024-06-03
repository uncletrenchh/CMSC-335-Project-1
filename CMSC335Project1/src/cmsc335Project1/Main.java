package cmsc335Project1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This is the main driver program that interacts with users to create different shapes and calculate their areas or volumes.
 * It handles user inputs and errors gracefully using try-catch blocks.
 * The program continues running until users choose to exit.
 */

public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       boolean continueProgram = true;

       while (continueProgram) {

           System.out.println("*********Welcome to the Java OO Shapes Program **********");
           System.out.println("Select from the menu below:");
           System.out.println("1. Construct a Circle");
           System.out.println("2. Construct a Rectangle");
           System.out.println("3. Construct a Square");
           System.out.println("4. Construct a Triangle");
           System.out.println("5. Construct a Sphere");
           System.out.println("6. Construct a Cube");
           System.out.println("7. Construct a Cone");
           System.out.println("8. Construct a Cylinder");
           System.out.println("9. Construct a Torus");
           System.out.println("10. Exit the program");

           int choice = -1;

           while (choice == -1) {
               try {
                   choice = scanner.nextInt();

                   if (choice < 1 || choice > 10) {
                       throw new InputMismatchException();
                   }

               } catch (InputMismatchException e) {
                   System.out.println("Invalid input. Please enter a number between 1 and 10.");
                   scanner.nextLine(); // discard the invalid input
                   choice = -1; // reset choice
               }
           }

           switch (choice) {
               case 1:
                   try {
                       System.out.println("You have selected a Circle");
                       double radius = getValidDouble(scanner, "What is the radius?");
                       Circle circle = new Circle(radius);
                       System.out.println("The area of the Circle is " + circle.getArea());
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 2:
            	   try {
                       System.out.println("You have selected a Rectangle");
                       double length = getValidDouble(scanner, "What is the length?");
                       double width = getValidDouble(scanner, "What is the width?");
                       Rectangle rectangle = new Rectangle(length, width);
                       System.out.println("The area of the Rectangle is " + rectangle.getArea());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 3:
            	   try {
                       System.out.println("You have selected a Square");
                       double side = getValidDouble(scanner, "What is the side length?");
                       Square square = new Square(side);
                       System.out.println("The area of the Square is " + square.getArea());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 4:
            	   try {
                       System.out.println("You have selected a Triangle");
                       double base = getValidDouble(scanner, "What is the base?");
                       double height = getValidDouble(scanner, "What is the height?");
                       Triangle triangle = new Triangle(base, height);
                       System.out.println("The area of the Triangle is " + triangle.getArea());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 5:
            	   try {
                       System.out.println("You have selected a Sphere");
                       double sphereRadius = getValidDouble(scanner, "What is the radius?");
                       Sphere sphere = new Sphere(sphereRadius);
                       System.out.println("The volume of the Sphere is " + sphere.getVolume());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 6:
            	   try {
                       System.out.println("You have selected a Cube");
                       double cubeSide = getValidDouble(scanner, "What is the side length?");
                       Cube cube = new Cube(cubeSide);
                       System.out.println("The volume of the Cube is " + cube.getVolume());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 7:
            	   try {
                       System.out.println("You have selected a Cone");
                       double coneRadius = getValidDouble(scanner, "What is the radius?");                       
                       double coneHeight = getValidDouble(scanner, "What is the height?");
                       Cone cone = new Cone(coneRadius, coneHeight);
                       System.out.println("The volume of the Cone is " + cone.getVolume());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 8:
            	   try {
                       System.out.println("You have selected a Cylinder");
                       double cylinderRadius = getValidDouble(scanner, "What is the radius?");                       
                       double cylinderHeight = getValidDouble(scanner, "What is the height?");
                       Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                       System.out.println("The volume of the Cylinder is " + cylinder.getVolume());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 9:
            	   try {
                       System.out.println("You have selected a Torus");
                       double majorRadius = getValidDouble(scanner, "What is the major radius?");                       
                       double minorRadius = getValidDouble(scanner, "What is the minor radius?");
                       Torus torus = new Torus(majorRadius, minorRadius);
                       System.out.println("The volume of the Torus is " + torus.getVolume());
                       break;
                   } catch (InputMismatchException e) {
                       System.out.println("Invalid input. Please enter a valid number for radius.");
                       scanner.nextLine(); // discard the invalid input
                   }
                   break;
               case 10:
                   continueProgram = false;
                   java.util.Date date=new java.util.Date();
                   java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MMM dd 'at' hh:mm a");
                   System.out.println("Thanks for using the program. Today is " + sdf.format(date));
                   break;
               default:
                   System.out.println("Invalid choice. Please choose again.");
                   choice = -1; // reset choice
           }

           if (continueProgram) {
               String continueChoice = "";
               while (!continueChoice.equals("Y") && !continueChoice.equals("N")) {
                   System.out.println("Would you like to continue? (Y or N)");
                   continueChoice = scanner.next().toUpperCase();
               }

               if (continueChoice.equals("N")) {
                   continueProgram = false;
                   java.util.Date date=new java.util.Date();
                   java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MMM dd 'at' hh:mm a");
                   System.out.println("Thanks for using the program. Today is " + sdf.format(date));
               }
           }
       }

       scanner.close();
   }

private static double getValidDouble(Scanner scanner, String prompt) {
       double value = -1;
       while (value == -1) {
           try {
               System.out.println(prompt);
               value = scanner.nextDouble();
           } catch (InputMismatchException e) {
               System.out.println("Invalid input. Please enter a valid number.");
               scanner.nextLine(); // discard the invalid input
           }
       }
       return value;
   }
}
