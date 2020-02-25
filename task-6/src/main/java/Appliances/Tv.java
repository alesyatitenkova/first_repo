package Appliances;

public class Tv extends Equipment {

    private int channels;

    public Tv(int channels, String color) {
        super(220, color);
        this.channels = channels;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }
}