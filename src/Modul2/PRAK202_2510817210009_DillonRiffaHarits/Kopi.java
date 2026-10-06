package Modul2.PRAK202_2510817210009_DillonRiffaHarits;

public class Kopi {
    String namaKopi, ukuran;
    double harga;
    private String pembeli;

    public void setPembeli(String pembeli) {
        this.pembeli =pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    double getPajak() {
        return harga * 0.11;
    }

    void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}
