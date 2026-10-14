package Modul3.Soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class PRAK302_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int banyakNegara = input.nextInt();
        while (banyakNegara <= 0) {
            System.out.println("Input tidak valid");
            banyakNegara = input.nextInt();
        }
        input.nextLine();

        LinkedList<Negara> listNegara = new LinkedList<>();

        for (int i = 0; i < banyakNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                listNegara.add(negara);
            } else {
                int tanggal, bulan, tahun;
                while (true) {
                    int batasHari = 31;
                    tanggal = input.nextInt();
                    bulan = input.nextInt();
                    tahun = input.nextInt();

                    if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                        batasHari = 30;
                    } else if (bulan == 2) {
                        boolean isKabisat = (tahun % 400 == 0 || tahun % 4 == 0 && tahun % 100 != 0);
                        batasHari = isKabisat ? 29 : 28;
                    }

                    if (tanggal <= 0 || tanggal > batasHari || bulan <= 0 || bulan > 12 || tahun <= 0) {
                        System.out.println("Input tidak valid");
                        continue;
                    }
                    break;
                }
                input.nextLine();
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun);
                listNegara.add(negara);
            }
        }
        for (Negara negara : listNegara) {
            negara.tampilkanData();
        }
    }
}