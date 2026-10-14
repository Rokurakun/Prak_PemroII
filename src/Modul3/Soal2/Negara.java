package Modul3.Soal2;

import java.util.HashMap;

public class Negara {
    private String nama, jenisKepemimpinan, namaPemimpin, bulan;
    private int tanggal, tahun;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggal = tanggal;
        this.bulan = konversiBulan(bulan);
        this.tahun = tahun;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public String getNama() { return nama; }
    public String getJenisKepemimpinan() { return jenisKepemimpinan; }
    public String getNamaPemimpin() { return namaPemimpin; }
    public String getBulan() { return bulan; }
    public int getTanggal() { return tanggal; }
    public int getTahun() { return tahun; }

    private static final HashMap<Integer, String> mapBulan = new HashMap<>();
    static {
        mapBulan.put(1, "Januari");
        mapBulan.put(2, "Februari");
        mapBulan.put(3, "Maret");
        mapBulan.put(4, "April");
        mapBulan.put(5, "Mei");
        mapBulan.put(6, "Juni");
        mapBulan.put(7, "Juli");
        mapBulan.put(8, "Agustus");
        mapBulan.put(9, "September");
        mapBulan.put(10, "Oktober");
        mapBulan.put(11, "November");
        mapBulan.put(12, "Desember");
    }

    public static HashMap<Integer, String> getMapBulan() {
        return mapBulan;
    }

    private String konversiBulan(int bulan) {
        return mapBulan.get(bulan);
    }

    public void tampilkanData() {
        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.printf("Negara %s mempunyai Raja bernama %s\n\n", nama, namaPemimpin);
        } else {
            System.out.printf("Negara %s mempunyai %s bernama %s\n", nama, jenisKepemimpinan, namaPemimpin);
            System.out.printf("Deklarasi Kemerdekaan pada Tanggal %d %s %d\n\n", tanggal, bulan, tahun);
        }
    }
}
