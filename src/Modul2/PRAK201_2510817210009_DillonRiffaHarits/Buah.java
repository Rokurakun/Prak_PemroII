package Modul2.PRAK201_2510817210009_DillonRiffaHarits;

import java.util.Locale;

public class Buah {
    private String namaBuah;
    private double berat, harga, jumlahBeli, hargaPerKg, hargaPreDiskon, totalDiskon, hargaSetelahDiskon;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.hargaPerKg = harga / berat;
        this.hargaPreDiskon = jumlahBeli * hargaPerKg;
        this.totalDiskon = (int)(jumlahBeli / 4) * (4 * this.hargaPerKg) * 0.02;
        this.hargaSetelahDiskon = this.hargaPreDiskon - this.totalDiskon;
    }

    public void tampilkanData() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaPreDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }
}
