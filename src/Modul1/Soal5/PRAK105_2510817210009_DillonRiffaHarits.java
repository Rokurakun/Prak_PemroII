package Modul1.Soal5;

import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        double t = input.nextDouble();

        final double PHI = 3.14;
        double volumeTabung = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", r, t, volumeTabung);
    }
}
