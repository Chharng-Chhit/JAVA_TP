package TP09;

import java.util.ArrayList;
import java.util.Scanner;
class Product {
    private int productNumber;
    private String name;
    private double price;
    private int stockAmount;

    public Product(int productNumber, String name, double price, int stockAmount) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public String toString() {
        return productNumber + " - " + name + " ($" + price + ", " + stockAmount + " in stock)";
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}

public class ProductManagement {
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static double totalRevenue = 0.0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. List all products");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product by index");
            System.out.println("4. Update product");
            System.out.println("5. Serve a customer");
            System.out.println("6. Close today's shop");

            System.out.print("Enter choice (1-6): ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    removeProductByIndex();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    serveCustomer();
                    break;
                case 6:
                    closeShop();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }

    private static void listAllProducts() {
        System.out.println("\nAll products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void addNewProduct() {
        System.out.print("\nEnter product number: ");
        int productNumber = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter product name: ");
        String name = input.nextLine();
        System.out.print("Enter product price: $");
        double price = input.nextDouble();
        input.nextLine(); 
        System.out.print("Enter product stock amount: ");
        int stockAmount = input.nextInt();
        input.nextLine(); 

        Product newProduct = new Product(productNumber, name, price, stockAmount);
        products.add(newProduct);
        System.out.println("\nAdded new product: " + newProduct);
    }

    private static void removeProductByIndex() {
        System.out.print("\nEnter index of product to remove: ");
        int indexToRemove = input.nextInt();
        input.nextLine(); 

        if (indexToRemove >= 0 && indexToRemove < products.size()) {
            Product removedProduct = products.remove(indexToRemove);
            System.out.println("\nRemoved product: " + removedProduct);
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void updateProduct() {
        System.out.print("\nEnter product number to update: ");
        int productNumberToUpdate = input.nextInt();
        input.nextLine(); 

        boolean found = false;
        for (Product product : products) {
            if (product.getProductNumber() == productNumberToUpdate) {
                found = true;
                System.out.println("\nCurrent product information: " + product);
                System.out.print("Enter new price: $");
                double newPrice = input.nextDouble();
                input.nextLine(); 
                System.out.print("Enter new stock amount: ");
                int newStockAmount = input.nextInt();
                input.nextLine(); 

                product.setPrice(newPrice);
                product.setStockAmount(newStockAmount);
                System.out.println("\nUpdated product information: " + product);
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    private static void serveCustomer() {
        System.out.println("\nServing a customer:");
        double totalPrice = 0.0;
        boolean serving = true;

        while (serving) {
            System.out.println("\nAvailable products:");
            for (Product product : products) {
                System.out.println(product);
            }

            System.out.print("Enter product number to add to the customer's order (0 to finish): ");
            int productNumber = input.nextInt();
            input.nextLine(); 

            if (productNumber == 0) {
                serving = false;
            } else {
                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();
                input.nextLine(); 

                Product selectedProduct = null;
                for (Product product : products) {
                    if (product.getProductNumber() == productNumber) {
                        selectedProduct = product;
                        break;
                    }
                }

                if (selectedProduct != null) {
                    if (selectedProduct.getStockAmount() >= quantity) {
                        double productTotalPrice = selectedProduct.getPrice() * quantity;
                        totalPrice += productTotalPrice;
                        selectedProduct.setStockAmount(selectedProduct.getStockAmount() - quantity);
                        System.out.println("Added " + quantity + " units of " + selectedProduct.getName() +
                                " to the order. Total price for this product: $" + productTotalPrice);
                    } else {
                        System.out.println("Insufficient stock for " + selectedProduct.getName());
                    }
                } else {
                    System.out.println("Product not found.");
                }
            }
        }

        System.out.print("\nEnter discount amount (in dollars): $");
        double discount = input.nextDouble();
        input.nextLine(); 

        totalPrice -= discount;
        totalRevenue += totalPrice;

        System.out.println("\nInvoice:");
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Thank you for your purchase!");

    }

    private static void closeShop() {
        System.out.println("\nClosing today's shop.");
        System.out.println("Total revenue for today: $" + totalRevenue);
        System.exit(0);
    }
}
