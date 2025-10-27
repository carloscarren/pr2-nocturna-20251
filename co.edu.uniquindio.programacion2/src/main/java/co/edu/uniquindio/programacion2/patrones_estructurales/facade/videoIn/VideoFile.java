package co.edu.uniquindio.programacion2.patrones_estructurales.facade.videoIn;

public class VideoFile {
    private String filename;
    public VideoFile(String filename) {
        this.filename = filename;
        System.out.println("Archivo de video: " + filename + " cargado.");
    }
}
