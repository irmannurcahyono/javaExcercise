package org.example;

import java.util.Scanner;

public class shapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void drawShape(int choice) {
        // conditional pilih menu
        switch (choice){
            case 1:
                System.out.print("Masukkan berapa tinggi segitiga sama kaki : ");
                int triangleHeight = scanner.nextInt();
                drawTriangleSS(triangleHeight);
                break;
            case 2:
                System.out.print("Masukkan berapa tinggi segitiga sama kaki : ");
                int triangleHeight2 = scanner.nextInt();
                drawTriangleSK(triangleHeight2);
                break;
            case 3:
                System.out.print("Masukkan berapa tinggi segitiga pyramid : ");
                int triangleHeight3 = scanner.nextInt();
                drawTrianglePyramid(triangleHeight3);
                break;
            case 4:
                System.out.print("Masukkan berapa tinggi square : ");
                int squareHeight = scanner.nextInt();
                drawSquare(squareHeight);
                break;
            case 5:
                System.out.print("Masukkan berapa tinggi rectangle : ");
                int rectangleHeight = scanner.nextInt();
                drawRectangle(rectangleHeight);
                break;
            case 6:
                System.out.print ("Masukkan berapa Tinggi rectangle : ");
                int rectangleHeight2 = scanner.nextInt();
                System.out.print("dan Lebar : ");
                int rectangleLength = scanner.nextInt();
                System.out.println();
                drawRectangle2(rectangleHeight2, rectangleLength);
                break;
            case 7:
                System.out.print("Masukkan berapa tinggi square Tepi : ");
                int squareHeight2 = scanner.nextInt();
                drawSquareTepi(squareHeight2);
                break;
            case 8:
                break;
            default:
                System.out.println("tulung dicoba kembali ya");
        }
    }

    public void drawTriangleSS(int triangleHeight) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i <= triangleHeight; i++){
            // inner loop to take care column
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int triangleHeight) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i <= triangleHeight; i++){
            // inner loop to take care column
            for(int j = 1; j<= triangleHeight -1 ; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTrianglePyramid(int triangleHeight) {
        // nested loop
        // outer loop (take case the rows)
        int triangleWidth = triangleHeight - 1;
        for (int i = 1; i <= triangleHeight; i++){
            // inner loop to take care column
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

    public void drawSquare(int squareHeight) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i < squareHeight; i++){
            // inner loop to take care column
            for(int j = 0; j< squareHeight; j++) {
                System.out.print("S");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int rectangleHeight) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 0; i <= rectangleHeight; i++){
//            System.out.print("r");
            System.out.println();
            // inner loop to take care column
            for(int j = 0; j< rectangleHeight; j++)
                System.out.print("a");

//            for(int k = 0; k<=rectangleHeight;k++)
//            System.out.print("t");
        }
    }

    public void drawRectangle2(int rectangleHeight, int rectangleLength) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i <= rectangleHeight; i++){
//            System.out.print("r");
//            System.out.println();
            // inner loop to take care column
            for(int j = 1; j<= rectangleLength; j++) {
                System.out.print("a");
            }
            System.out.println();
//            for(int k = 0; k<=rectangleHeight;k++)
//            System.out.print("t");
        }
    }
    public void drawSquareTepi(int squareHeight2) {
        // nested loop
        // outer loop (take case the rows)
        for (int i = 1; i <= squareHeight2; i++){
            // inner loop to take care column
            for(int j = 1; j<=squareHeight2; j++) {
                if( i==1 || i==squareHeight2 || j==1 || j==squareHeight2)
                System.out.print("S");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII gambar");
        System.out.println("Pilih Gambar : ");
        System.out.println("1. Segitiga Siku-siku");  // nested loop
        System.out.println("2. Segitiga Sama kaki");  // nested loop, tapi inner loop ada 2
        System.out.println("3. Segitiga Pyramid");
        System.out.println("4. Square");
        System.out.println("5. Rectangle");
        System.out.println("6. Rectangle 2");
        System.out.println("8. Exit");
    }

    public void run() {
        // Loop while aplikasi terus running sampai ada exit
        while(true){
            displayMenu();
            System.out.print("Masukan pilihan Anda : ");
            int choice = scanner.nextInt();
            drawShape(choice);  // dimana ada condition
            System.out.println();
        }
    }


    // new *
    public static void main(String[] args) {
        // inheritance OOP, untuk remining
        shapeDrawer drawer = new shapeDrawer();
        drawer.run();
    }
}
