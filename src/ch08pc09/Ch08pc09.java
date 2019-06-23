package ch08pc09;
import java.util.Scanner;

/**
 * Geometry Calculator
 * Test a static Geometry class
 */
public class Ch08pc09 {
    /**
     * Main Method
     * @param args String[] The command line arguments 
     */
    public static void main(String[] args) {
        // Variables
        boolean valid = false;
        int num = 0;
        double rad, length, width, base, height;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request input
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the area of a circle.");
        System.out.println("2. Calculate the area of a rectangle.");
        System.out.println("3. Calculate the area of a triangle.");
        System.out.println("4. Quit.");
        while (!valid) {
            num = keyboard.nextInt();
            if (num > 0 && num < 5)
                valid = true;
            else
                valid = false;
        }
        
        switch (num) {
            case 1: //circle
                System.out.print("Please enter the radius of the circle. ");
                rad = keyboard.nextDouble();
                System.out.println("The circle's area is: " + Geometry.getCircleArea(rad));
                break;
            case 2: //rectangle
                System.out.print("Please enter the length. ");
                length = keyboard.nextDouble();
                System.out.print("Please enter the width. ");
                width = keyboard.nextDouble();
                System.out.println("The rectangle's area is: " + Geometry.getRectangleArea(length, width));
                break;
            case 3: //triangle
                System.out.print("Please enter the length of the base. ");
                base = keyboard.nextDouble();
                System.out.print("Please enter the height. ");
                height = keyboard.nextDouble();
                System.out.println("The triangle's area is: " + Geometry.getTriangleArea(base, height));
                break;
            default:
                break;
        }
    }
    
}
