package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.implementacion;

public class PagoPaypal implements ISistemaPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de " + monto + " procesado con PayPal.");
    }
}