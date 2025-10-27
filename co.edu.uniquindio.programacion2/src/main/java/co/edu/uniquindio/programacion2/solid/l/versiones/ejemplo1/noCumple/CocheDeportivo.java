package co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo1.noCumple;

class CocheDeportivo extends Vehiculo {
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Coches deportivos no pueden moverse.");
    }
}
