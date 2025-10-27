package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion.Pedido;
import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion.PedidoDigital;
import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion.PedidoFisico;
import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.implementacion.*;

public class MainBridge {
    // Uso del patrón Bridge
    public static void main(String[] args) {
        ISistemaPago pagoTarjeta = new PagoTarjeta();
        Pedido pedidoFisico = new PedidoFisico(pagoTarjeta);
        pedidoFisico.realizarPago(100.0);

        ISistemaPago pagoConPayPal = new PagoPaypal();
        Pedido pedidoDigital = new PedidoDigital(pagoConPayPal);
        pedidoDigital.realizarPago(50.0);
    }

}
