package TP09;

import java.util.Scanner;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private String category;
    private String[] authors;
    private int publishedYear;
    private int quantityInventory;
    private boolean available;

    public Book() {
        // Initialize variables
        isbn = "";
        title = "";
        description = "";
        category = "";
        authors = new String[0];
        publishedYear = 0;
        quantityInventory = 0;
        available = true;
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        isbn = input.nextLine();

        System.out.print("Enter title: ");
        title = input.nextLine();

        System.out.print("Enter description: ");
        description = input.nextLine();

        System.out.print("Enter category: ");
        category = input.nextLine();

        System.out.print("Enter authors (comma-separated): ");
        String authorsInput = input.nextLine();
        authors = authorsInput.split(",");

        System.out.print("Enter published year: ");
        publishedYear = input.nextInt();

        System.out.print("Enter quantity in inventory: ");
        quantityInventory = input.nextInt();
    }

    public void displayInformation() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.print("Authors: ");
        for (String author : authors) {
            System.out.print(author + ", ");
        }
        System.out.println();
        System.out.println("Published Year: " + publishedYear);
        System.out.println("Quantity in Inventory: " + quantityInventory);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String[] getAuthors() {
        return authors;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getQuantityInventory() {
        return quantityInventory;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getYear() {
        return publishedYear;
    }

    public void setQuantityInInventory(int quantityInInventory) {
        this.quantityInventory = quantityInInventory;
    }
}
