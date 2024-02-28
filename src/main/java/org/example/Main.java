package org.example;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome ");
        System.out.println("Hello and welcome!");
        System.out.print("Hello and welcome!");
        System.out.println("");

        boolean flag;
        float num;

    // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            System.out.print("i = " +i);
        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Irman";
        char q = 'Y';
        boolean flag2 = false;

        float result; // sebelumnya integer, diubah menjadi float
        //  result = a/b;  // 10 devide 2 (both integer)
        result = (a/c); // 10 devide 3 (one of them is float)
        int resultType = (int) (a/c); // type casting
        System.out.println();
        System.out.println("Test result berapa : " +result);
        System.out.println("Test resultType berapa : " +resultType);


        int timeStart = 6;
        int timeFinish = 17;
        int waktuSaya = 9;
        int waktuPulang = 18;

        // karyawan tepat waktu datang dan pulang dapat selamat
        // karyawan tepat waktu dapat selamat, karyawan telat disoraki
        // karyawan telat, pulang lama, dimaafkan
        // karyawan datang duluan, pulang cepat, dicengin
        if(waktuSaya <= timeStart && waktuPulang >= timeFinish){
            System.out.println();
            System.out.println("Selamat kamu tepat waktu");
            System.out.println("Anda Datang " +(timeStart - waktuSaya)+ " jam lebih cepat");
            System.out.println("Anda Pulang " +(waktuPulang - timeFinish)+ " jam lebih lama");

        }
        // karyawan datang duluan, pulang cepet dicengin
        else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("Datang awal pulang cepet");
        }

        else if (waktuSaya >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Dimaafkan datangnya telat, pulangnya lama");

        } else {
            System.out.println();
            System.out.println("YEU TELAT");
            System.out.println("Anda Telat " +(waktuSaya - timeStart)+ " jam");
            System.out.println("Anda Pulang Duluan " +(timeFinish - waktuPulang)+ " jam lebih cepat");
        }

        int day = 4;
        switch(day) {
            case 1 :
                System.out.println("Saya WFO");
                break;
            case 2 :
                System.out.println("saya libut / cuti");
                break;
            case 3 :
                System.out.println("saya WFH");
                break;
            default:
                System.out.println("Liburan alias weekend");
                break;
        }
        System.out.println("testing hehehe");


    }

}