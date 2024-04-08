
import java.util.Scanner;

class Publisher {
    String name;

    Publisher(String name) {
        this.name = name;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String title, String author, String publisher) {
        super(publisher);
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + name);
    }
}

class Literature extends Book {
    Literature(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

class Fiction extends Book {
    Fiction(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

public class BookDetails {
    public static void main(String[] args) {
    	System.out.println("Name : Shaibin K B\nRoll.no : 50\nDate : 08/04/2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Literature books do you want to add? ");
        int numLiteratureBooks = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("How many Fiction books do you want to add? ");
        int numFictionBooks = scanner.nextInt();
        scanner.nextLine();

        Book[] literatureBooks = new Book[numLiteratureBooks];
        Book[] fictionBooks = new Book[numFictionBooks];

        for (int i = 0; i < numLiteratureBooks; i++) {
            System.out.println("\nEnter details for Literature book " + (i + 1) + ":");
            literatureBooks[i] = createBook(scanner, "Literature");
        }

        for (int i = 0; i < numFictionBooks; i++) {
            System.out.println("\nEnter details for Fiction book " + (i + 1) + ":");
            fictionBooks[i] = createBook(scanner, "Fiction");
        }

        System.out.println("\nLiterature Books:");
        displayBooks(literatureBooks);

        System.out.println("\nFiction Books:");
        displayBooks(fictionBooks);

        scanner.close();
    }

    private static Book createBook(Scanner scanner, String type) {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the publisher of the book: ");
        String publisher = scanner.nextLine();

        if (type.equals("Literature")) {
            return new Literature(title, author, publisher);
        } else if (type.equals("Fiction")) {
            return new Fiction(title, author, publisher);
        } else {
            return null;
        }
    }

    private static void displayBooks(Book[] books) {
        for (Book book : books) {
            book.display();
            System.out.println();
        }
    }
}

