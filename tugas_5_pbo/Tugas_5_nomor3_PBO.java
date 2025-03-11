package com.mycompany.tugas_5_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;
public class Tugas_5_nomor3_PBO {
    public static void main(String[] args) {
        int a = inputBilangan("Masukkan bilangan pertama a: ");
        int b = inputBilangan("Masukkan bilangan kedua b: ");
        int hasil = hitungPembagiBersamaTerbesar(a, b);
        System.out.println("Pembagi bersama terbesar adalah: " + hasil);
    }

    public static int inputBilangan(String pesan) {
        Scanner input = new Scanner(System.in);
        System.out.print(pesan);
        return input.nextInt();
    }
    
    public static int hitungPembagiBersamaTerbesar(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}