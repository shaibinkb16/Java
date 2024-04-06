import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
    System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : Sort String\nDate : 26/02/2024\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[numStrings];
        System.out.println("Enter the strings:");
        for (int i = 0; i < numStrings; i++) {
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        scanner.close();
    }
}

