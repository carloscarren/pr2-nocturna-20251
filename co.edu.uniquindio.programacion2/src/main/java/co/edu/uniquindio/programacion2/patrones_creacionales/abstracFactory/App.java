package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.FabricaAbstracta;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionBD;
import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionREST;

public class App {

	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
	}

}
