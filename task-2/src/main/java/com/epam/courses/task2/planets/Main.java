package com.epam.courses.task2.planets;

public class Main {
    public static void main(String[] args) {
        SpaceObject satellite = new Satellite("Moon", 384400, 1);
        SpaceObject planet = new Planet("Earth", 150000000, 365);
        System.out.println(satellite.toString());
        System.out.println(planet.toString());
        satellite.printType();
        planet.printType();
        System.out.println(satellite.calculateDistance());
        System.out.println(planet.calculateDistance());
    }
}
