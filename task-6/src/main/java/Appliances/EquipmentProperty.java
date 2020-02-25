package Appliances;

public abstract class EquipmentProperty {

    private String color;

    public EquipmentProperty(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract boolean isTurnedOn();
}
