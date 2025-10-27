package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}
