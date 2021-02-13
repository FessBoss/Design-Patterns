package Facade.Example1;

public class HomeTheaterFacade {
    // Композиция: компоненты подсистемы, которые мы собираемся использовать.
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    // В конструкторе фасада передаются ссылки на все компоненты.
    // Фасад присваивает их соответствие переменным экземпляра.
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // Метод watchMovie() выполняет те же операции, которые ранее выполнялись нами вручную.
    // Обратите внимание: выполнение каждой операции делегируется соответствующему компоненту подсистемы.
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    // Метод endMovie() выключает всю аппаратуру за нас.
    // И снова каждая операция делегируется соответствующему компоненту подсистемы.
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
