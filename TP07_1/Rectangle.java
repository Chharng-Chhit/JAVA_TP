package TP07_1;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int calculatePerimeter() {
        return (width + height) * 2;
    }
    public int calculateSurface() {
        return (width * height);
    }
}
class RectangleTest {

    public static void main(String[] args) {
        var test = new RectangleTest();
        Scanner sc = new Scanner(System.in);
        int width, height;
        do {
            System.out.print("Input Width: ");
            width = sc.nextInt();
            System.out.print("Input height: ");
            height = sc.nextInt();

            test.Display_per(width, height);
            test.Display_sur(width, height);

        } while (width == 0 & height == 0);
    }
    private void Display_per(int width, int height) {
        var rech_p = new Rectangle(width, height);
        System.out.printf("Rechtangle: Width = %d, Height = %d, then the perimeter is %d.\n", width, height,
                rech_p.calculatePerimeter());
    }
    private void Display_sur(int width, int height) {
        var rech_p = new Rectangle(width, height);
        System.out.printf("Rechtangle: Width = %d, Height = %d, then the surface is %d.\n", width, height,
                rech_p.calculateSurface());
    }
}
