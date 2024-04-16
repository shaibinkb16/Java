package graphics;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
          circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
        System.out.println("Name: Shaibin K B");
        System.out.println("Reg. No: 23MCA050");
        System.out.println("Date: 15/04/2024");

        while (true) {
            System.out.println("Choose any:");
            System.out.println("1) Circle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Triangle");
            System.out.println("5) Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   
                    obj1.area();
                    break;
                case 2:
                   
                    obj2.area();
                    break;
                case 3:
                 
                    obj3.area();
                    break;
                case 4:
                    
                    obj4.area();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close(); // Close the scanner
                    return; // Exit the main method (and the program)
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
