package TP09;

import java.util.ArrayList;
import java.util.Scanner;

public class Category {
    private String name;
    private String description;
    private ArrayList<Book> books;

    public Category() {
        
        name = "";
        description = "";
        books = new ArrayList<>();
    }

    
    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter category name: ");
        name = input.nextLine();

        System.out.print("Enter category description: ");
        description = input.nextLine();
    }

   
    public void addBook() {
        Book book = new Book();
        book.inputData();
        books.add(book);
        System.out.println("Book added to the category.");
    }


    public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed from the category.");
                return true;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the category.");
        return false;
    }

    
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
 

    public void addCopiesOfBook(String isbn, int copies) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                for (int i = 0; i < copies; i++) {
                    Book copyBook = new Book();
                    books.add(copyBook);
                }
                break;
            }
        }
    }
    public void markBookUnavailable(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(false);
                break;
            }
        }
    }

    
    public int countBooks() {
        return books.size();
    }
    
    public String getName() {
        return name;
    }

    
    public String getDescription() {
        return description;
    }

    
    public ArrayList<Book> getBooks() {
        return books;
    }
}
