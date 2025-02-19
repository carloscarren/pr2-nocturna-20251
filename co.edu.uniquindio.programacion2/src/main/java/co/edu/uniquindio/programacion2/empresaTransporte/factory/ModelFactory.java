package co.edu.uniquindio.programacion2.empresaTransporte.factory;

import co.edu.uniquindio.programacion2.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.programacion2.empresaTransporte.model.Propietario;
import co.edu.uniquindio.programacion2.patrones_creacionales.singleton.model.Conexion;

public class ModelFactory {
    private static ModelFactory instancia;
    private EmpresaTransporte empresaTransporte;

    private ModelFactory() {
        empresaTransporte = inicializarDatos();
    }


    public static ModelFactory getInstancia() {
        if(instancia == null) {
            instancia = new ModelFactory();
        }
        return instancia;
    }

    private EmpresaTransporte inicializarDatos() {
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

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
}
