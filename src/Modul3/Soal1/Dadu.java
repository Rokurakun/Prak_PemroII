package Modul3.Soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public void setNilai(int nilai) { this.nilai = nilai; }

    public int getNilai() { return nilai; }

    public void acakNilai() {
        Random r = new Random();
        nilai = r.nextInt(1, 7);
    }
}
