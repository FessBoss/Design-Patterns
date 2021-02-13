package Facade.Example1;

public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD Player to Top-O-Line DVD Player");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to 5");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}
