package co.edu.uniquindio.programacion2.patrones_estructurales.facade.videoIn;

public class VideoDecoder {
    public void decode(VideoFile file, Codec codec) {
        System.out.println("Decodificando " + file + " usando " + codec + "...");
    }
}
