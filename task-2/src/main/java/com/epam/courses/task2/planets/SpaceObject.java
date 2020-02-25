package com.epam.courses.task2.planets;

public abstract class SpaceObject {

    private String name;
    private double distance;
    private double rotationPeriod;

    public SpaceObject(String name, double distance, double rotationPeriod) {
        this.name = name;
        this.distance = distance;
        this.rotationPeriod = rotationPeriod;
    }

    public void printType() {
        System.out.println(getMessage() + getClass().getSimpleName());
    }

    protected abstract String getMessage();

    public double calculateDistance() {
        return 2 * 3.14 * 1 * distance / rotationPeriod;
    }

    @Override
    public String toString() {
        return name + ", distance = " + distance + ", rotation period = " + rotationPeriod + ".";
    }
}
