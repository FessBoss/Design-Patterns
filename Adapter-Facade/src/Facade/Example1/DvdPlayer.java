package Facade.Example1;

public class DvdPlayer {
    private String movie;
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        if (movie != null) setMovie(movie);
        System.out.println("Top-O-Line DVD Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"" + movie + "\"");
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
