package co.edu.uniquindio.programacion2.patrones_estructurales.facade.ejemploScreenSound;

// Fachada
class HomeTheaterFacade {
    private Screen screen;
    private SoundSystem sound;
    private Lights lights;

    public HomeTheaterFacade(Screen screen, SoundSystem sound, Lights lights) {
        this.screen = screen;
        this.sound = sound;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        sound.on();
        lights.dim();
    }

    public void endMovie() {
        System.out.println("Shutting down the movie...");
        screen.up();
        sound.off();
        lights.brighten();
    }
}
