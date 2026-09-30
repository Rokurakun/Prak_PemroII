package Modul1.Soal1;

import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        int tanggalLahir, bulanLahir, tahunLahir;
        while (true) {
            try {
                System.out.print("Masukkan Tanggal Lahir: ");
                tanggalLahir = input.nextInt();

                System.out.print("Masukkan Bulan Lahir: ");
                bulanLahir = input.nextInt();

                System.out.print("Masukkan Tahun Lahir: ");
                tahunLahir = input.nextInt();

                if (tanggalLahir <= 0 || bulanLahir <= 0 || bulanLahir > 12 || tahunLahir <= 0) {
                    System.out.println("Input tidak valid");
                    continue;
                }

                boolean isKabisat = (tahunLahir % 400 == 0 || tahunLahir % 4 == 0 && tahunLahir % 100 != 0);
                int batasHari;
                switch (bulanLahir) {
                    case 2: batasHari = isKabisat ? 29 : 28; break;
                    case 4: case 6: case 9: case 11: batasHari = 30; break;
                    default: batasHari = 31; break;
                }

                if (tanggalLahir > batasHari) {
                    System.out.println("Tanggal melebihi batas untuk bulan dan tahun tersebut");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Input harus angka");
                input.nextLine();
            }
        }

        int tinggiBadan;
        double beratBadan;
        while (true) {
            try {
                System.out.print("Masukkan Tinggi Badan: ");
                tinggiBadan = input.nextInt();

                System.out.print("Masukkan Berat Badan: ");
                beratBadan = input.nextDouble();

                if (tinggiBadan <= 0 || beratBadan <= 0) {
                    System.out.println("Input tidak valid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Input harus angka");
                input.nextLine();
            }
        }

        String namaBulan = "";
        switch (bulanLahir) {
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
        }

        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }
}
