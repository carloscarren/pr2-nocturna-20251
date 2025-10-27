package co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.impl;


import co.edu.uniquindio.programacion2.patrones_creacionales.abstracFactory.inter.IConexionBD;

public class ConexionVacia implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
