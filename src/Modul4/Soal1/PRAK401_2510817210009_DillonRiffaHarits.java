package Modul4.Soal1;

import java.util.Scanner;

public class PRAK401_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();

        System.out.print("Ras: ");
        String ras = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);
        hewan.display();
    }
}
