package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploDocumento;

        // Uso del patrón Proxy - Actúa como intermediario para controlar el acceso a otro objeto.
public class Main {

    public static void main(String[] args) {
        IDocumento documento = new DocumentoProxy("archivo.pdf");
        // El documento solo se carga cuando se necesita mostrar
        String conteindo1 = documento.mostrar();  // Carga y muestra el documento
        String contenido2 = documento.mostrar();  // Solo muestra el documento, sin recargar

        System.out.println(conteindo1);
        System.out.println(contenido2);
    }
}
