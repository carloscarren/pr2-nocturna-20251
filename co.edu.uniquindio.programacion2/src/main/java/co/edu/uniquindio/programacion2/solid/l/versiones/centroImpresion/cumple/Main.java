package co.edu.uniquindio.programacion2.solid.l.versiones.centroImpresion.cumple;

public class Main {
    public static void main(String[] args) {
        Impresora impresoraLaser = new ImpresoraLaser();
        CentroImpresion centroImpresion = new CentroImpresion(impresoraLaser);
        centroImpresion.imprimir("Documento1.pdf");  // Salida: Imprimiendo en impresora láser: Documento1.pdf

        Impresora impresoraVirtual = new ImpresoraVirtual();
        centroImpresion = new CentroImpresion(impresoraVirtual);
        centroImpresion.imprimir("Documento2.pdf");
    }
}
