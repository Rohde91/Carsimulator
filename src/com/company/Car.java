package com.company;

public class Car{
    String bilType = "Tesla";
    String bilModel = "Model x";
    String stelNummer = "02930923";
    int doors = 4;
    String softwareVersion = "0.0.1";
    double gpsCordX = 55.22458;
    double gpsCordY = 11.757075;
    double speed = 0;

    engine motor = new engine();

    public String toString() {
        return String.format("%s\n%s\n%s\n%1d\n%s\n%02.5f\n%02.5f\n%.2f",
                this.bilType, this.bilModel, this.stelNummer, this.doors, this.softwareVersion, this.gpsCordX, this.gpsCordY, this.speed);
    }

    /*@Override
    public String toString() {
        return "car{" +
                "bilType='" + bilType + '\'' +
                ", bilModel='" + bilModel + '\'' +
                ", stelNummer='" + stelNummer + '\'' +
                ", doors=" + doors +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", gpsCordX=" + gpsCordX +
                ", gpsCordY=" + gpsCordY +
                ", speed=" + speed +
                '}';
    }*/

    /*public car(String type, String model, String stel, int doors, String software, double xCord, double yCord, int speed) {
    }*/

    public String getBilType() {
        return bilType;
    }
    public void setBilType(String bilType) {
        this.bilType = bilType;
    }

    public String getBilModel() {
        return bilModel;
    }
    public void setBilModel(String bilModel) {
        this.bilModel = bilModel;
    }

    public String getStelNummer() {
        return stelNummer;
    }
    public void setStelNummer(String stelNummer) {
        this.stelNummer = stelNummer;
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public double getGpsCordX() {
        return gpsCordX;
    }
    public void setGpsCordX(double gpsCordX) {
        this.gpsCordX = gpsCordX;
    }

    public double getGpsCordY() {
        return gpsCordY;
    }
    public void setGpsCordY(double gpsCordY) {
        this.gpsCordY = gpsCordY;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
