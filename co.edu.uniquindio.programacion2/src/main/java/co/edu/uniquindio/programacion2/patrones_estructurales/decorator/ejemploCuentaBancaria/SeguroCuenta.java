package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCuentaBancaria;

public class SeguroCuenta extends CuentaBancariaDecorator {
    public SeguroCuenta(ICuentaBancaria cuentaBancaria) {
        super(cuentaBancaria);
    }

    @Override
    public void abrirCuenta() {
        cuentaBancaria.abrirCuenta();
        agregarSeguro();
    }

    private void agregarSeguro() {
        System.out.println("Seguro de cuenta agregado.");
    }
}