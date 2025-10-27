package co.edu.uniquindio.programacion2.patrones_estructurales.facade.ejemploReserva;

public class SistemaAlquilerAutos {
    public void buscarAutos(String destino) {
        System.out.println("Buscando autos de alquiler en " + destino);
    }

    public void reservarAuto() {
        System.out.println("Auto de alquiler reservado.");
    }
}
