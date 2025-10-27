package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCuentaBancaria;

// Componente concreto
public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void abrirCuenta() {
        System.out.println("Cuenta corriente abierta.");
    }
}