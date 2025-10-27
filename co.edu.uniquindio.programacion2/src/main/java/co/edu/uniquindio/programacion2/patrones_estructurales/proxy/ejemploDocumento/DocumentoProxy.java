package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploDocumento;

public class DocumentoProxy implements IDocumento {
    private DocumentoReal documentoReal;
    private String nombreArchivo;

    public DocumentoProxy(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String mostrar() {
        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nombreArchivo);  // Cargar solo cuando sea necesario
        }
        return documentoReal.mostrar();
    }
}