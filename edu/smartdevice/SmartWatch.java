package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {

    private int batteryLevel;
    private boolean connected;
    private String ssid;

    public SmartWatch() {
        this.batteryLevel = 0;
        this.connected = false;
        this.ssid = "";
    }

    // Implement Rechargeable
    @Override
    public void chargeBattery(int menit) {
        batteryLevel += menit; // 1 menit = 1%

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Implement Connectable
    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.ssid = ssid;
            this.connected = true;
        } else {
            this.connected = false;
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    public String getSsid() {
        return ssid;
    }
}
