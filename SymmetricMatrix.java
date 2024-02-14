
import java.util.Scanner;

public class SymmetricMatrix{
    public static void main(String[] arg){
		System.out.println("Name :Shaibin K B\nRoll.no : 50\nTitle : Check for symmetric matrices\nDate : 14/02/2024\n");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the rows and cols of the matrix : ");
        int rows = read.nextInt();
        int columns = read.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements : ");
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = read.nextInt();
            }
        }
        System.out.println("\nMatrix is");
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        if(rows == columns){
            int flag=0;
            for(int i=0; i<rows; i++){
                for(int j=0;j<columns;j++){
                    if(matrix[i][j] != matrix[j][i]){
                        flag=1;
                        break;
                    }
                }
                if(flag == 1) break;
            }
            if(flag == 0){
                System.out.println("\nThe matrix is a Symmetric matrix.");
            } else {
                System.out.println("\nThe matrix is not a Symmetric matrix.");
            }
        } else {
            System.out.println("\nThe matrix is not a Symmetric matrix.");
        }
    }
}
