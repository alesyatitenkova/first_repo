package Appliances;

public class Kettle extends Equipment{

    private int volume;

    public Kettle(int volume, String color) {
        super(220, color);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
