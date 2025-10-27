package co.edu.uniquindio.programacion2.solid.l.versiones.centroImpresion.noCumple;

class ImpresoraLaser implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo en impresora láser: " + documento);
    }
}

