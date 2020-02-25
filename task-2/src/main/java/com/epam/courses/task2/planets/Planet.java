package com.epam.courses.task2.planets;

public class Planet extends SpaceObject {

    public Planet (String name, double distance, double rotationPeriod) {
        super(name, distance, rotationPeriod);
    }

    protected String getMessage() {
        return "this is planet, class name - ";
    }
}
