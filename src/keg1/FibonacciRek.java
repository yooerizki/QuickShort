package keg1;

import java.util.Scanner;

public class FibonacciRek {

    static int fibo(int n) { // method dengan variabel
        if (n == 0 || n == 1) { // jika kondisi sama kembalikan ke n
            return n;
        } else {
            return (fibo(n - 1) + fibo(n - 2)); // oprasi fibonacci
            // hasil n - 1 + hasil n - 2
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j = 0; // variabel

        System.out.print("Masukkan jumlah bilangan fibonacci: ");
        int n = scan.nextInt();

        System.out.print("Hasil bilangan fibonacci: ");
        for (i = 0; i < n; i++) { // inkremen sebanyak inputan
            System.out.print(fibo(j) + ", "); // inkremen sebanyak fibonacci
            j++;
        }
        System.out.println();
    }
}
