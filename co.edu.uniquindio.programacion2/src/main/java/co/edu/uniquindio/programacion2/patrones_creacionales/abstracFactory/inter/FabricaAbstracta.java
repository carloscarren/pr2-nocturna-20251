package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter;

public interface FabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
