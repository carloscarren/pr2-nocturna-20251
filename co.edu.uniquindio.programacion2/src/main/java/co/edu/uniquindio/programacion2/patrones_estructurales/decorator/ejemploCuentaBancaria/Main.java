package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCuentaBancaria;

// Uso del patrón Decorator - Añade dinámicamente funcionalidades a un objeto sin modificar su estructura original.
public class Main {

    public static void main(String[] args) {
        ICuentaBancaria cuenta = new CuentaCorriente();

        cuenta = new SeguroCuenta(cuenta);

        cuenta.abrirCuenta();  // Abre cuenta corriente y agrega seguro

    }
}
