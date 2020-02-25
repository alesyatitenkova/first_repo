package Appliances;

public class Refrigerator extends Equipment {

    public int power;
    public int height;

    public Refrigerator(int power, int height, String color) {
        super(220, color);
        this.power = power;
        this.height = height;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
