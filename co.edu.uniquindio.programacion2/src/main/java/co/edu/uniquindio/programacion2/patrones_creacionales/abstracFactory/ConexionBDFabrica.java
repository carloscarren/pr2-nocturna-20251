package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.FabricaAbstracta;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionBD;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionREST;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl.*;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
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

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
