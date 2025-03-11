package com.mycompany.tugas_5_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;
public class Tugas_5_nomor2_PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasAwal = inputBatas(input, "Masukkan batas awal: ");
        int batasAkhir = inputBatas(input, "Masukkan batas akhir: ");
        int jumlah = tampilkanBilanganGenap(batasAwal, batasAkhir);
        System.out.println("\nJumlah deret bilangan genap: " + jumlah);
    }

    public static int inputBatas(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }

    public static int tampilkanBilanganGenap(int awal, int akhir) {
        int jumlah = 0;
        System.out.print("Bilangan genap: ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlah += i;
            }
        }
        return jumlah;
    }
} 
