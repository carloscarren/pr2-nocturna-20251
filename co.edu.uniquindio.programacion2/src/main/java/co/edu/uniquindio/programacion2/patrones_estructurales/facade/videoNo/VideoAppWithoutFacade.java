package co.edu.uniquindio.programacion2.patrones_estructurales.facade.videoNo;



// Cliente que usa todo directamente
public class VideoAppWithoutFacade {
    public static void main(String[] args) {
        String filename = "pelicula.mp4";

        VideoFile file = new VideoFile(filename);
        Codec codec = new Codec("mp4");
        VideoDecoder decoder = new VideoDecoder();
        decoder.decode(file, codec);

        VideoPlayer player = new VideoPlayer();
        player.play(file);
    }
}


class VideoFile {
    private String filename;
    public VideoFile(String filename) {
        this.filename = filename;
        System.out.println("Archivo de video: " + filename + " cargado.");
    }
}

class Codec {
    public Codec(String type) {
        System.out.println("Códec " + type + " cargado.");
    }
}

class VideoDecoder {
    public void decode(VideoFile file, Codec codec) {
        System.out.println("Decodificando " + file + " usando " + codec + "...");
    }
}

class VideoPlayer {
    public void play(VideoFile file) {
        System.out.println("Reproduciendo " + file + "...");
    }
}

