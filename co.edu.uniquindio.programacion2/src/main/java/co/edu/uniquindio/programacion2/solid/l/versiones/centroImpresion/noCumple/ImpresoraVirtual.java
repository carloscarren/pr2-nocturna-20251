package co.edu.uniquindio.programacion2.solid.l.versiones.centroImpresion.noCumple;

class ImpresoraVirtual implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        throw new UnsupportedOperationException("Impresión virtual no soportada.");
    }
}
