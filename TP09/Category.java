package TP09;

import java.util.ArrayList;
import java.util.Scanner;

public class Category {
    private String name;
    private String description;
    private ArrayList<Book> books;

    public Category() {
        // Initialize variables
        name = "";
        description = "";
        books = new ArrayList<>();
    }

    // Method for data input to create a new category
    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter category name: ");
        name = input.nextLine();

        System.out.print("Enter category description: ");
        description = input.nextLine();
    }

    // Method for data input to add a book to the category
    public void addBook() {
        Book book = new Book();
        book.inputData();
        books.add(book);
        System.out.println("Book added to the category.");
    }

    // Method to remove a book from the category
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed from the category.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the category.");
    }

    // Method to list all books in the category
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the category.");
        } else {
            System.out.println("Books in the category:");
            for (Book book : books) {
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Title: " + book.getTitle());
                System.out.println();
            }
        }
    }

    // Method to find a book in the category by ISBN or Title
    public void findBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(keyword) || book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayInformation();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books matching the keyword found in the category.");
        }
    }
    //-------- error

    // public void addCopiesOfBook(String isbn, int copies) {
    //     for (Book book : books) {
    //         if (book.getIsbn().equals(isbn)) {
    //             book.setInventoryCount(book.getQuantityInventory() + copies);
    //             break;
    //         }
    //     }
    // }
    public void markBookUnavailable(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(false);
                break;
            }
        }
    }

    // Method to count the number of books in the category
    public int countBooks() {
        return books.size();
    }
    // Accessor for category name
    public String getName() {
        return name;
    }

    // Accessor for category description
    public String getDescription() {
        return description;
    }

    // Accessor for category books
    public ArrayList<Book> getBooks() {
        return books;
    }
}
