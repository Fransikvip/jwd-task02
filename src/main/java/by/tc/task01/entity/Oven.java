package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private int powerConsumption;
    private int capacity;
    private int depth;
    private double weight;
    private double height;
    private double wight;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
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
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", weight=" + weight +
                ", height=" + height +
                ", wight=" + wight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(oven.weight, weight) == 0 &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.wight, wight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, capacity, depth, weight, height, wight);
    }
}
