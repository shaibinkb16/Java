import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
    	System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle : String Manipulations\nDate : 26/02/2024\n");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        System.out.println("Original String: " + inputString);


        int length = inputString.length();
        System.out.println("Length of the string: " + length);


        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);


        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);


        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);


        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);


        scanner.close();
    }


    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}

