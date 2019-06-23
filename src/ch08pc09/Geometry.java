package ch08pc09;

/**
 * Geometry class
 */
public class Geometry {
    // Static Methods
    /**
     * Get the area for a circle
     * @param rad double Circle Radius
     * @return double The circle area
     */
    public static double getCircleArea(double rad) {
        double area;
        
        if (!valid(rad)) {
            System.out.println("Invalid range.");
            area = 0;
        } else
            area = Math.PI * Math.pow(rad, 2);
        
        return area;
    }
    
    /**
     * Get the area for a rectangle
     * @param length double The rectangle length
     * @param width double The rectangle width
     * @return double The rectangle area
     */
    public static double getRectangleArea(double length, double width) {
        double area;
        
        if (!valid(length) || !valid(width)) {
            System.out.println("Invalid range.");
            area = 0;
        } else
            area = length * width;
        
        return area;
    }
    
    /**
     * Get the area for a triangle
     * @param base double The triangle base
     * @param height double The triangle height
     * @return double The triangle area
     */
    public static double getTriangleArea(double base, double height) {
        double area;
        
        if (!valid(base) || !valid(height)) {
            System.out.println("Invalid range.");
            area = 0;
        } else
            area = base * height * 0.5;
        
        return area;
    }
    
    /**
     * Validate the input
     * @param num double The number to be validated
     * @return boolean True if valid; false otherwise
     */
    private static boolean valid(double num) {
        if (num >= 0)
            return true;
        else
            return false;
    }
}
