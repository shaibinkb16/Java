import java.util.Scanner;
public class AreaCalculator 
{
    void calculateArea(float x) 
    {
        System.out.println("Area of the square: " + x * x + " sq units");
    }
    void calculateArea(float x, float y) 
    {
        System.out.println("Area of the rectangle: " + x * y + " sq units");
    }
    void calculateArea(double r) 
    {
        double area = 3.14 * r * r;
        System.out.println("Area of the circle: " + area + " sq units");
    }
    
    public static void main(String args[]) 
    {
    	System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : Area Calculator\nDate : 06/04/2024\n");
        Scanner scanner = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Enter the dimensions:");
        System.out.print("Enter side length of the square: ");
        float side = scanner.nextFloat();
        obj.calculateArea(side);
        System.out.print("Enter length of the rectangle: ");
        float length = scanner.nextFloat();
        System.out.print("Enter width of the rectangle: ");
        float width = scanner.nextFloat();
        obj.calculateArea(length, width);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        obj.calculateArea(radius);
        scanner.close();
    }
}
