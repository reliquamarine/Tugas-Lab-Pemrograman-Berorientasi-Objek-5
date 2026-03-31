package edu.university.staff;

public class Main {
    public static void main(String[] args) {

        Pegawai[] daftarPegawai = new Pegawai[4];

        daftarPegawai[0] = new Dosen("Ripki", 3000000, 10);
        daftarPegawai[1] = new Dosen("Iyep", 3500000, 8);
        daftarPegawai[2] = new StafAdministrasi("Pito", 2500000, 20);
        daftarPegawai[3] = new StafAdministrasi("Akip", 2700000, 15);

        for (Pegawai p : daftarPegawai) {
            System.out.println("Nama: " + p.getNama());
            System.out.println("Gaji: " + p.hitungGaji());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
