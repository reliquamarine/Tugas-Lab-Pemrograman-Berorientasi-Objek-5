package edu.transport;

public class Main {
    public static void main(String[] args) {
        double jarak = 120; // km

        Kendaraan mobil = new Mobil("Toyota", 150);
        Kendaraan motor = new Motor("Honda", 120);

        double waktuMobil = mobil.hitungWaktuTempuh(jarak);
        double waktuMotor = motor.hitungWaktuTempuh(jarak);

        System.out.println("-=- Waktu Tempuh -=-");
        System.out.println("Mobil (" + mobil.getNama() + "): " + waktuMobil + " jam");
        System.out.println("Motor (" + motor.getNama() + "): " + waktuMotor + " jam");
    }
}
