package com.mycompany.tugas_5_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;
public class Tugas_5_nomor1_PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = inputNilai(input);
        cetakKalimat(N);
    }

    public static int inputNilai(Scanner input) {
        System.out.print("Masukkan nilai N: ");
        return input.nextInt();
    }
    
    public static void cetakKalimat(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
} 
