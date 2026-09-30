package Modul1.Soal3;

import java.util.Scanner;

public class PRAK103_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int banyakBaris = input.nextInt();
        int bilangan = input.nextInt();
        int batas = 0;

        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                batas++;
                if (batas < banyakBaris) {
                    System.out.print(", ");
                }
            }
            bilangan++;
        } while (batas < banyakBaris);
    }
}
