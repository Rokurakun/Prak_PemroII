package Modul1.Soal2;

import java.util.Scanner;

public class PRAK102_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = input.nextInt();
        int batas = 0;
        while (batas < 10) {
            if (bilangan % 5 == 0) {
                System.out.print(bilangan / 5 - 1);
            } else {
                System.out.print(bilangan);
            }

            if (batas < 9) {
                System.out.print(", ");
            }
            bilangan++;
            batas++;
        }
    }
}
