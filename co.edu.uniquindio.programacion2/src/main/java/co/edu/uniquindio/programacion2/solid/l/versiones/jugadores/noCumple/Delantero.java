package co.edu.uniquindio.programacion2.solid.l.versiones.jugadores.noCumple;

class Delantero implements Jugador {
    @Override
    public void entrenar() {
        System.out.println("El delantero está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El delantero está jugando el partido.");
    }

    @Override
    public void cobrarTiroDeEsquina() {
        System.out.println("El delantero está cobrando el tiro de esquina.");
    }
}
