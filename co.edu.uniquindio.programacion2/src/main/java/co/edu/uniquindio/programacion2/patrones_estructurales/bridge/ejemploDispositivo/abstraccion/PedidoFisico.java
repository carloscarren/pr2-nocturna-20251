package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.implementacion.ISistemaPago;

// Implementación concreta: Pedido de producto físico
public class PedidoFisico  extends Pedido {
    public PedidoFisico(ISistemaPago sistemaPago) {
        super(sistemaPago);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pedido de producto físico.");
        sistemaPago.procesarPago(monto);
    }
}