package Appliances;

public class Runner {
    public static void main(String[] args) {
        System.out.println(createSet());
        EquipmentProperty tv = new Tv(25, "white");
        tv.turnOn();
        tv.turnOff();
        Equipment kettle = new Kettle(1000, "red");
        kettle.turnOn();
        kettle.turnOff();
        Refrigerator refrigerator = new Refrigerator(550, 2200, "black");
        refrigerator.turnOn();
        refrigerator.turnOff();
    }

    private static int createSet() {
        return 0;
    }
}
