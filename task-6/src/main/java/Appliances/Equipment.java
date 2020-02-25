package Appliances;

public class Equipment extends EquipmentProperty {

    private int voltage;
    private boolean turnedOn;

    public Equipment(int voltage, String color) {
        super(color);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(getClass().getSimpleName() + " Прибор включен в розетку!");
    }

    @Override
    public void turnOff() {
        this.turnedOn = false;
        System.out.println(getClass().getSimpleName() + " Прибор выключен из розетки!");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }
}