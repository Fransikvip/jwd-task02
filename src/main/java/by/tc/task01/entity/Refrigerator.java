package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{

    private int powerConsumption;
    private int freezerCapacity;
    private int overallCapacity;
    private double weight;
    private double height;
    private double wight;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                freezerCapacity == that.freezerCapacity &&
                overallCapacity == that.overallCapacity &&
                Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.wight, wight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, freezerCapacity, overallCapacity, weight, height, wight);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", weight=" + weight +
                ", height=" + height +
                ", wight=" + wight +
                '}';
    }
}