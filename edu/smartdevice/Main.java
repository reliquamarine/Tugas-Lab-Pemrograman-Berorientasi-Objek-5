package edu.smartdevice;

public class Main {
    public static void main(String[] args) {

        SmartWatch watch = new SmartWatch();

        // Isi baterai
        watch.chargeBattery(50);
        watch.chargeBattery(50);

        // Coba koneksi WiFi
        watch.connectWifi("WiFi_Rumah_Biru");

        // Output
        System.out.println("-=- SmartWatch Status -=-");
        System.out.println("Battery Level: " + watch.getBatteryLevel() + "%");
        System.out.println("Connected: " + watch.isConnected());
        System.out.println("SSID: " + watch.getSsid());
    }
}
