package co.edu.uniquindio.programacion2.patrones_estructurales.facade.videoIn;

// Cliente usando el Facade
public class VideoAppWithFacade {
    public static void main(String[] args) {
        VideoFacade videoFacade = new VideoFacade();
        videoFacade.playVideo("pelicula.mp4"); // Solo una línea para el cliente
    }
}
