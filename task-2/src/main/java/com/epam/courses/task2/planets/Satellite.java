package com.epam.courses.task2.planets;

public class Satellite extends SpaceObject {

    public Satellite (String name, double distance, double rotationPeriod) {
        super(name, distance, rotationPeriod);
    }

    protected String getMessage() {
        return "this is satellite, class name - ";
    }
}
