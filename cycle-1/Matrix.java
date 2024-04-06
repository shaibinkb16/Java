
import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
		System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : Matrix addition\nDate : 14/02/2024\n");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the rows and cols in the first matrix : ");
        int row1 = read.nextInt();
        int col1 = read.nextInt();
        int[][] mat1 = new int[row1][col1];
        System.out.println("Enter the first matrix");
        for(int i=0; i<row1; i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = read.nextInt();
            }
        }
        System.out.println("Enter the rows and cols in the second matrix : ");
        int row2 = read.nextInt();
        int col2 = read.nextInt();
        int[][] mat2 = new int[row2][col2];
        System.out.println("Enter the second matrix");
        for(int i=0; i<row1; i++){
            for(int j=0;j<col1;j++){
                mat2[i][j] = read.nextInt();
            }
        }
        System.out.println("first matrix is \n");
        for(int i=0; i<row1; i++){
            for(int j=0;j<col1;j++){
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("second matrix is \n");
        for(int i=0; i<row2; i++){
            for(int j=0;j<col2;j++){
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int add[][] = new int[row1][col1];
        if(row1 == row2 && col1 == col2){
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    add[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println("added matrix is \n");
            for(int i=0; i<row1; i++){
                for(int j=0;j<col1;j++){
                    System.out.print(add[i][j] + "\t");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Addition not possible.");
        }
    }
}
