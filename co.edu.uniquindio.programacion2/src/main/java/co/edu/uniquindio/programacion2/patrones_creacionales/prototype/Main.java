package co.edu.uniquindio.programacion2.patrones_creacionales.prototype;

import co.edu.uniquindio.programacion2.patrones_creacionales.prototype.model.CuentaAHImpl;

public class Main {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl("Corriente");
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();
        cuentaAhorro2.setMonto(cuentaAhorro.getMonto());





        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);

		/*if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuentaAhorro);*/
    }
}
