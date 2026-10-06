package Modul2.PRAK203_2510817210009_DillonRiffaHarits;

// baris ini salah karena penamaan class harus sesuia nama filenya yaitu Pegawai
// public class Employee {

public class Pegawai {
    public String nama;

    // Baris ini salah karena penggunaan char itu untuk 1 karakter saja, sedangkan "Kingdom of Orvel" itu seharusnya menggunakan String
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Tidak ada parameter untuk data dan variabel "j" itu kurang jelas definisinya dan mungkin saja membuat orang bingung, makanya saya ubah ke "jabatan"
    // public void setJabatan() {
    //     this.jabatan = j;
    // }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}