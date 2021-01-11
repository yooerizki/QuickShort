package keg2;

public class Quicksort {

    public static int partition(String stringArray[], int arrKiri, int arrKanan) { // variabel data
        String pivotValue = stringArray[arrKiri]; // index kiri
        while (arrKiri < arrKanan) { // cari pivot
            String kiri;
            String kanan;
            while ((kiri = stringArray[arrKiri]).compareTo(pivotValue) < 0) {
                arrKiri = arrKiri + 1;
            }
            while ((kanan = stringArray[arrKanan]).compareTo(pivotValue) > 0) {
                arrKanan = arrKanan - 1;
            }
            stringArray[arrKiri] = kanan;
            stringArray[arrKanan] = kiri;
        }
        return arrKiri;
    }

    public static void QuicksortString(String stringArray[], int arrKiri, int arrKanan) { // variabel data
        if (arrKiri >= arrKanan) { // cek arry kiri lebih besar dari arry kanan
            return;
        }
        int pivotIndex = partition(stringArray, arrKiri, arrKanan); // ambill data pivot
        QuicksortString(stringArray, arrKiri, pivotIndex);
        QuicksortString(stringArray, pivotIndex + 1, arrKanan);
    }

    public static void QuicksortString(String stringArray[]) { // jalankan quicksort
        QuicksortString(stringArray, 0, stringArray.length - 1);
    }

    public static void printArray(String stringArray[]) { // tampilkan array
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        String[] dataArray = { "Zidan", "Daniel", "Ahmad", "Wildan", "Bayu", "jago" }; // data array
        QuicksortString(dataArray); // panggil method
        printArray(dataArray); // panggil method
    }
}