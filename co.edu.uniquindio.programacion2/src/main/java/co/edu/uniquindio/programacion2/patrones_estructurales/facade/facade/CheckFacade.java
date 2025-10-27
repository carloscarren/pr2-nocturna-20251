package co.edu.uniquindio.programacion2.patrones_estructurales.facade.facade;


import co.edu.uniquindio.programacion2.patrones_estructurales.facade.api.AvionAPI;
import co.edu.uniquindio.programacion2.patrones_estructurales.facade.api.HotelAPI;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}
