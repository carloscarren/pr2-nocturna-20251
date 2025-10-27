package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.implementacion.ISistemaPago;

// Abstracción: Pedido que usa un sistema de pago
public abstract class Pedido {
    protected ISistemaPago sistemaPago;

    public Pedido(ISistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public abstract void realizarPago(double monto);
}