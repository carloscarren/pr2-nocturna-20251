package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploImagen;

// Proxy que controla el acceso a RealImage
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);  // Se crea solo cuando es necesario
        }
        realImage.display();
    }
}
