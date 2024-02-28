package org.example;

import java.util.Scanner;

public class shapeDrawerTest {

    Scanner scanner = new Scanner(System.in);

    public void drawShape(int choice) {
        // conditional pilih menu
        switch (choice){
            case 1:
                System.out.print("Enter the height of the triangle : ");
                int triangleHeight = scanner.nextInt();
                drawTrianglePyramid(triangleHeight);
                break;
            case 2:
                System.out.print("Enter the height of the square : ");
                int squareHeight = scanner.nextInt();
                drawSquare(squareHeight);
                break;
            case 3:
                System.out.print ("Enter the height of the rectangle : ");
                int rectangleHeight = scanner.nextInt();
                System.out.print("and the width : ");
                int rectangleLength = scanner.nextInt();
                System.out.println();
                drawRectangle(rectangleHeight, rectangleLength);
                break;
            case 4:
                break;
            default:
                System.out.println("Please try again!");
        }
    }


    // in order to create triangle pyramid shape
    public void drawTrianglePyramid(int triangleHeight) {
        // nested loop
        int triangleWidth = triangleHeight - 1;
        for (int i = 1; i <= triangleHeight; i++){
            for(int j = 1; j<= triangleWidth; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
            triangleWidth--;
        }
    }

    // in order to create square shape
    public void drawSquare(int squareHeight) {
        // nested loop
        for (int i = 1; i <= squareHeight; i++){
            for(int j = 1; j<= squareHeight; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // in order to create rectangle shape
    public void drawRectangle(int rectangleHeight, int rectangleLength) {
        // nested loop
        for (int i = 1; i <= rectangleHeight; i++){
            for(int j = 1; j<= rectangleLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawSquareEdge(int squareHeight2) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i <= squareHeight2; i++){
            for(int j = 1; j<=squareHeight2; j++) {
                if( i==1 || i==squareHeight2 || j==1 || j==squareHeight2)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to ASCII Shape Drawer!");
        System.out.println();
        System.out.println("Choose a shape to draw : ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");
        System.out.println();
    }

    public void run() {
        // Loop while aplikasi terus running sampai ada exit
        while(true){
            displayMenu();
            System.out.print("Masukan pilihan Anda : ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // inheritance OOP, untuk remining
        shapeDrawerTest drawer = new shapeDrawerTest();
        drawer.run();
    }
}
