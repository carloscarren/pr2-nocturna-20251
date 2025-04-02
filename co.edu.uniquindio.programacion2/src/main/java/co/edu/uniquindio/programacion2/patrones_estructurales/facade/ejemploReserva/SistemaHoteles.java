package co.edu.uniquindio.programacion2.patrones_estructurales.facade.ejemploReserva;

public class SistemaHoteles {
    public void buscarHoteles(String destino) {
        System.out.println("Buscando hoteles en " + destino);
    }

    public void reservarHotel() {
        System.out.println("Hotel reservado.");
    }
}
