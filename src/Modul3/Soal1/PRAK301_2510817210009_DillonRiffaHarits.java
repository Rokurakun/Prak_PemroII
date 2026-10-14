package Modul3.Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class PRAK301_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakDadu = input.nextInt();
        while (banyakDadu <= 0) {
            System.out.println("Input tidak valid");
            banyakDadu = input.nextInt();
        }

        LinkedList<Dadu> listDadu = new LinkedList<>();

        int total = 0;
        for (int i = 1; i <= banyakDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai();
            listDadu.add(dadu);

            System.out.printf("Dadu ke-%d bernilai %d\n", i, dadu.getNilai());
            total += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
