import java.util.Scanner;

public class ComplexNumber {
    static class ComplexNumberClass {
        int real;
        int img;

        public ComplexNumberClass(int r, int i) {
            this.real = r;
            this.img = i;
        }
    }

    public static void main(String[] arg) {
        System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : Addition of complex numbers numbers\nDate : 14/02/2024\n");

        int a, b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first complex number");
        System.out.print("Real part : ");
        a = scan.nextInt();
        System.out.print("Imaginary part : ");
        b = scan.nextInt();
        ComplexNumberClass first = new ComplexNumberClass(a, b);

        System.out.println("Enter the second complex number");
        System.out.print("Real part : ");
        a = scan.nextInt();
        System.out.print("Imaginary part : ");
        b = scan.nextInt();
        ComplexNumberClass second = new ComplexNumberClass(a, b);

        int real = first.real + second.real;
        int img = first.img + second.img;
        System.out.println("Sum of the complex number is : " + real + " + " + img + "i");
    }
}

