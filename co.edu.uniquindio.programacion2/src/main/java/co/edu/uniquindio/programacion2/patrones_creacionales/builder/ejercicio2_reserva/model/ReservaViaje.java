package co.edu.uniquindio.programacion2.patrones_creacionales.builder.ejercicio2_reserva.model;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaViaje {

    private LocalDateTime fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private TipoTransporte transporte;
    private List<String> actividades;
    private String dietaEspecial;

    public ReservaViaje(LocalDateTime fechaSalida, int duracion, String tipoAlojamiento, TipoTransporte transporte, List<String> actividades, String dietaEspecial) {
        this.fechaSalida = fechaSalida;
        this.duracion = duracion;
        this.tipoAlojamiento = tipoAlojamiento;
        this.transporte = transporte;
        this.actividades = actividades;
        this.dietaEspecial = dietaEspecial;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }


    public int getDuracion() {
        return duracion;
    }




    public TipoTransporte getTransporte() {
        return transporte;
    }


    public List<String> getActividades() {
        return actividades;
    }


    public String getDietaEspecial() {
        return dietaEspecial;
    }


    public static ReservaViajeBuilder builder(){
        return new ReservaViajeBuilder();
    }
}
