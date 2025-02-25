package co.edu.uniquindio.programacion2.solid.l.versiones.jugadores.cumple;

class Portero implements Jugador {
    @Override
    public void entrenar() {
        System.out.println("El portero está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El portero está jugando el partido.");
    }

    // El portero no implementa EspecialistaEnEsquinas, por lo que no tiene este método
}
