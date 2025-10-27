package co.edu.uniquindio.programacion2.solid.d.ejercicio1.cumple;

class CentroImpresion {
    private Impresora impresora;

    public CentroImpresion(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimir(String documento) {
        impresora.imprimirDocumento(documento);
    }
}