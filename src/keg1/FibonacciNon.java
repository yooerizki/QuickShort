package keg1;

public class FibonacciNon {
    public static void main(String[] args) {
        int a = 0, b = 1, hasil = 1; // deklarasi variabel
        int n = 10;

        for (int i = 0; i < n; i++) { // inkremen i sebanyak n
            System.out.print(hasil + " "); // nila awal
            hasil = a + b;
            a = b;
            b = hasil; // b di dapatkan dari hasilnya
        }
        System.out.println();
    }
}
