package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.FabricaAbstracta;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}

		return null;
	}

}
