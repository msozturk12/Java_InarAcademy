package chapters.chapter09.Listing09;

public class TV {
    private int channel; //default
    private int volumeLevel;//default
    private boolean on;

    public TV() {
        this(1, 1, false);//default values
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        if (on && channel > 1 && channel < 100) {
            this.channel = channel;
        }
    }

    public void setVolume(int volumeLevel) {
        if (on && volumeLevel > 1 && volumeLevel < 7) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 100) {
            channel++;
        }

    }

    public void channelDown() {
        if (on && 1 < channel) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 10) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && 1 < volumeLevel) {
            volumeLevel--;
        }
    }
    public void print(){
        System.out.println("tv channel is " + this.channel + " and volume level is " + this.volumeLevel);


    }

}
