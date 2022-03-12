package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{

    private int memoryRom;
    private int systemMemory;
    private int displayInchs;
    private double batteryCapacity;
    private double cpu;
    private String os;


    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                displayInchs == laptop.displayInchs &&
                Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryRom, systemMemory, displayInchs, batteryCapacity, cpu, os);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", displayInchs=" + displayInchs +
                ", batteryCapacity=" + batteryCapacity +
                ", cpu=" + cpu +
                ", os='" + os + '\'' +
                '}';
    }
}

