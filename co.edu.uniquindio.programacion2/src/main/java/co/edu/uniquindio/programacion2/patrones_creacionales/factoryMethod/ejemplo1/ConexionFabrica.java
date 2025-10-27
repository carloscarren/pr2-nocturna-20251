package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo1;


import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo1.inter.IConexion;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo1.inter.impl.*;

public class ConexionFabrica {

    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }
}
