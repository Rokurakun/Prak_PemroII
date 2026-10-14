package Modul3.Soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class PRAK303_2510817210009_DillonRiffaHarits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        while (true) {
            System.out.print("""
                Menu:
                1. Tambah Mahasiswa
                2. Hapus Mahasiswa berdasarkan NIM
                3. Cari Mahasiswa berdasarkan NIM
                4. Tampilkan Daftar Mahasiswa
                0. Keluar
                Pilihan:\s""");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    String nim;
                    inputNim:
                    while (true) {
                        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                        nim = input.nextLine();

                        for (Mahasiswa mhs : listMahasiswa) {
                            if (mhs.getNim().equals(nim)) {
                                System.out.println("NIM Sudah Digunakan");
                                continue inputNim;
                            }
                        }
                        break;
                    }
                    listMahasiswa.add(new Mahasiswa(nama, nim));
                    System.out.printf("Mahasiswa %s ditambahkan.\n", nama);
                    break;

                case 2:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong");
                        break;
                    }

                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String hapusNim = input.nextLine();

                    boolean ketemuHapus = false;
                    for (int i = 0; i < listMahasiswa.size(); i++) {
                        Mahasiswa mhs = listMahasiswa.get(i);
                        if (mhs.getNim().equals(hapusNim)) {
                            listMahasiswa.remove(i);
                            System.out.printf("Mahasiswa dengan NIM %s dihapus.\n", hapusNim);
                            ketemuHapus = true;
                            break;
                        }
                    }
                    if (!ketemuHapus) {
                        System.out.printf("Mahasiswa dengan NIM %s tidak ditemukan.\n", hapusNim);
                    }
                    break;

                case 3:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong");
                        break;
                    }

                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String cariNim = input.nextLine();

                    boolean ketemuCari = false;
                    for (Mahasiswa mhs : listMahasiswa) {
                        if (mhs.getNim().equals(cariNim)) {
                            System.out.printf("Mahasiswa dengan NIM %s ditemukan\n", mhs.getNim());
                            System.out.printf("Nama: %s\n", mhs.getNama());
                            ketemuCari = true;
                            break;
                        }
                    }
                    if (!ketemuCari) {
                        System.out.printf("Mahasiswa dengan NIM %s tidak ditemukan.\n", cariNim);
                    }
                    break;

                case 4:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mhs : listMahasiswa) {
                            System.out.printf("NIM: %s, Nama: %s\n", mhs.getNim(), mhs.getNama());
                        }
                    }
                    break;

                case 0:
                    listMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Input tidak valid");
            }
        }
    }
}
