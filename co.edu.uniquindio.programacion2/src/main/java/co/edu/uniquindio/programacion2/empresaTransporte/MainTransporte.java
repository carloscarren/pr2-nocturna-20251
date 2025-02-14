package co.edu.uniquindio.programacion2.empresaTransporte;

import co.edu.uniquindio.programacion2.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.programacion2.empresaTransporte.model.Propietario;

public class MainTransporte {

    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = inicializarDatos();
        int totalPropietarios = obtenerNumeroPropietarios(empresaTransporte);
        String datosPropietarios = obtenerDatosPropietarios(empresaTransporte);
        System.out.println(datosPropietarios);
    }

    private static String obtenerDatosPropietarios(EmpresaTransporte empresaTransporte) {
        String datosPropietarios = "";
        for(Propietario propietario: empresaTransporte.getListaPropietarios()){
            datosPropietarios += propietario.getNombre() + "\n";
        }

        return datosPropietarios;
    }

    private static int obtenerNumeroPropietarios(EmpresaTransporte empresaTransporte) {
        return empresaTransporte.getListaPropietarios().size();
    }

    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Transporte UQ");
        Propietario propietario = new Propietario();
        propietario.setNombre("Pedro");
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Ana");
        empresaTransporte.getListaPropietarios().add(propietario);
        empresaTransporte.getListaPropietarios().add(propietario2);

        return empresaTransporte;
    }


}
