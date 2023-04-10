package TP06;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
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

class ProductManagement {
      private static ArrayList<Product> products = new ArrayList<Product>();
      private static Scanner input = new Scanner(System.in);

      public static void main(String[] args) {
            while (true) {
                  System.out.println("\nMenu:");
                  System.out.println("1. List all products");
                  System.out.println("2. Add new product");
                  System.out.println("3. Remove product by index");
                  System.out.println("4. Update product");
                  System.out.println("5. Exit program");

                  System.out.print("Enter choice (1-5): ");
                  int choice = input.nextInt();
                  input.nextLine(); // consume the newline character

                  switch (choice) {
                        case 1:
                              System.out.println("\nAll products:");
                              for (Product product : products) {
                                    System.out.println(product);
                              }
                              break;
                        case 2:
                              System.out.print("\nEnter product number: ");
                              int productNumber = input.nextInt();
                              input.nextLine(); // consume the newline character
                              System.out.print("Enter product name: ");
                              String name = input.nextLine();
                              System.out.print("Enter product price: $");
                              double price = input.nextDouble();
                              input.nextLine(); // consume the newline character
                              System.out.print("Enter product stock amount: ");
                              int stockAmount = input.nextInt();
                              input.nextLine(); // consume the newline character
                              Product newProduct = new Product(productNumber, name, price, stockAmount);
                              products.add(newProduct);
                              System.out.println("\nAdded new product: " + newProduct);
                              break;
                        case 3:
                              System.out.print("\nEnter index of product to remove: ");
                              int indexToRemove = input.nextInt();
                              input.nextLine(); // consume the newline character
                              if (indexToRemove < 0 || indexToRemove >= products.size()) {
                                    System.out.println("Invalid index.");
                              } else {
                                    Product removedProduct = products.remove(indexToRemove);
                                    System.out.println("\nRemoved product: " + removedProduct);
                              }
                              break;
                        case 4:
                              System.out.print("\nEnter product number to update: ");
                              int productNumberToUpdate = input.nextInt();
                              input.nextLine(); // consume the newline character
                              boolean found = false;
                              for (Product product : products) {
                                    if (product.getProductNumber() == productNumberToUpdate) {
                                          found = true;
                                          System.out.println("\nCurrent product information: " + product);
                                          System.out.print("Enter new price: $");
                                          double newPrice = input.nextDouble();
                                          input.nextLine(); // consume the newline character
                                          System.out.print("Enter new stock amount: ");
                                          int newStockAmount = input.nextInt();
                                          input.nextLine(); // consume the newline character
                                          product.setPrice(newPrice);
                                          product.setStockAmount(newStockAmount);
                                          System.out.println("\nUpdated product information: " + product);
                                          break;
                                    }
                              }
                              if (!found) {
                                    System.out.println("Product not found.");
                              }
                              break;
                        case 5:
                              System.out.println("\nExiting program.");
                              System.exit(0);
                              break;
                        default:
                              System.out.println("\nInvalid choice. Please enter a number between 1 and 5.");
                              break;
                  }
            }
      }
}
