package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploDocumento;

// Documento real que puede ser costoso cargar
public class DocumentoReal implements IDocumento {
    private String nombreArchivo;

    public DocumentoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando documento " + nombreArchivo + " desde el disco.");
    }

    @Override
    public String mostrar() {
        return "Mostrando documento " + nombreArchivo;
    }
}