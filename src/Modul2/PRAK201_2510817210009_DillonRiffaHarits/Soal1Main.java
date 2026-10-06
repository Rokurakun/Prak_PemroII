package Modul2.PRAK201_2510817210009_DillonRiffaHarits;

public class Soal1Main {
    public static void main(String[] args) {
        Buah buah1 = new Buah("Apel", 0.4, 7000, 40.0);
        Buah buah2 = new Buah("Mangga", 0.2, 3500, 15.0);
        Buah buah3 = new Buah("Alpukat", 0.25, 10000, 12.0);

        buah1.tampilkanData();
        buah2.tampilkanData();
        buah3.tampilkanData();
    }
}
