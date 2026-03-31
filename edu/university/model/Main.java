package edu.university.model;

import edu.university.model.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("003", "Iyan", 2.7);
        Mahasiswa m2 = new Mahasiswa("009", "Paler", 3.7);
        Mahasiswa m3 = new Mahasiswa("102", "Oed", 3.4);

        // simpan dalam array
        Mahasiswa[] data = {m1, m2, m3};

        // tampilkan
        System.out.println("-=- Data Mahasiswa -=-");
        for (Mahasiswa m : data) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("NIM   : " + m.getNim());
            System.out.println("Nama  : " + m.getNama());
            System.out.println("IPK   : " + m.getIpk());
            System.out.println("Kategori: " + m.getKategoriIPK());
        }
    }
}
