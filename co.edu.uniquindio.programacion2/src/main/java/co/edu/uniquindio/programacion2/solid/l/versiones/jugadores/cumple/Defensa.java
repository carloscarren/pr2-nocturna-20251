package co.edu.uniquindio.programacion2.solid.l.versiones.jugadores.cumple;

class Defensa implements Jugador, EspecialistaEnEsquinas {
    @Override
    public void entrenar() {
        System.out.println("El defensa está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El defensa está jugando el partido.");
    }

    @Override
    public void cobrarTiroDeEsquina() {
        System.out.println("El defensa está cobrando el tiro de esquina.");
    }
}
