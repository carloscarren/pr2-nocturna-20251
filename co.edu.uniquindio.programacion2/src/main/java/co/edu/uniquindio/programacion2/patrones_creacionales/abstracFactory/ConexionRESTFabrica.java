package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.FabricaAbstracta;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionBD;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionREST;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl.ConexionRESTCompras;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl.ConexionRESTNoArea;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
