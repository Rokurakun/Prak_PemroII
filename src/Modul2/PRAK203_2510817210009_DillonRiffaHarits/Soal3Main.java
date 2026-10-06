package Modul2.PRAK203_2510817210009_DillonRiffaHarits;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // baris ini salah karena tidak ada tanda titik koma (;)
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Di code yang diberikan di soal tidak ada set umur jadi disini saya tambahkan
        p1.umur = 17;

        // Baris ini tidak sesuai dengan yang diminta di output soal yaitu "Nama: " saja
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Baris ini cuma kurang teks "tahun"
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
