package Modul1.Soal4;

import java.util.Scanner;

public class PRAK104_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] abu, bagas;
        while (true) {
            System.out.print("Tangan Abu: ");
            abu = input.nextLine().split(" ");

            System.out.print("Tangan Bagas: ");
            bagas = input.nextLine().split(" ");

            if (abu.length != 3 || bagas.length != 3) {
                System.out.println("Harus 3 ronde");
                continue;
            }
            break;
        }

        int poinAbu = 0;
        int poinBagas = 0;
        for (int i = 0; i < 3; i++){
            if(!abu[i].equals(bagas[i])){
                if(abu[i].equals("B") && bagas[i].equals("G") ||
                        abu[i].equals("G") && bagas[i].equals("K") ||
                        abu[i].equals("K") && bagas[i].equals("B")) {
                    poinAbu++;
                } else {
                    poinBagas++;
                }
            }
        }

        if (poinAbu == poinBagas ) {
            System.out.print("Seri");
        }else if (poinAbu < poinBagas) {
            System.out.print("Bagas");
        }else{
            System.out.print("Abu");
        }
    }
}
