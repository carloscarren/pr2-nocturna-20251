package co.edu.uniquindio.programacion2.patrones_estructurales.facade.videoIn;

class VideoFacade {
    public void playVideo(String filename) {
        VideoFile file = new VideoFile(filename);
        Codec codec = new Codec("mp4"); // supongamos que lo detectamos automáticamente
        VideoDecoder decoder = new VideoDecoder();
        decoder.decode(file, codec);

        VideoPlayer player = new VideoPlayer();
        player.play(file);
    }
}
