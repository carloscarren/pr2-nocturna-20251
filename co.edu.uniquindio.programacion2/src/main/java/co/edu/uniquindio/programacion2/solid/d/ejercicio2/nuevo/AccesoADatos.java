package co.edu.uniquindio.programacion2.solid.d.ejercicio2.nuevo;

public class AccesoADatos {
    Conexion conexion;

    public AccesoADatos(){

    }

    Dato getDatos(){
        return conexion.getDatos();
    }
}
