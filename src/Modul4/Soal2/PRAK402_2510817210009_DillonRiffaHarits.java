package Modul4.Soal2;

import java.util.Scanner;

public class PRAK402_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.print("""
            Pilih jenis hewan yang ingin diinputkan:
            1 = Kucing
            2 = Anjing
            Masukkan pilihan:\s""");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan != 1 && pilihan != 2) {
                System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 1 && pilihan != 2);


        switch (pilihan) {
            case 1: {
                System.out.print("Nama Hewan Peliharaan: ");
                String nama = input.nextLine();

                System.out.print("Ras: ");
                String ras = input.nextLine();

                System.out.print("Warna Bulu: ");
                String warnaBulu = input.nextLine();

                Kucing kucing = new Kucing(ras, nama, warnaBulu);
                kucing.displayDetailKucing();
                break;
            }

            case 2: {
                System.out.print("Nama Hewan Peliharaan: ");
                String nama = input.nextLine();

                System.out.print("Ras: ");
                String ras = input.nextLine();

                System.out.print("Warna Bulu: ");
                String warnaBulu = input.nextLine();

                System.out.print("Kemampuan : ");
                String[] kemampuan = input.nextLine().split(",\\s");

                Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
                anjing.displayDetailAnjing();
                break;
            }
        }
    }
}
