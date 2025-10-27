package co.edu.uniquindio.programacion2.patrones_estructurales.facade.ejemploReserva;

public class SistemaVuelos {
    public void buscarVuelos(String origen, String destino) {
        System.out.println("Buscando vuelos desde " + origen + " hacia " + destino);
    }

    public void reservarVuelo() {
        System.out.println("Vuelo reservado.");
    }
}
