package co.edu.uniquindio.programacion2.patrones_creacionales.builder.ejercicio2_reserva.model;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaViajeBuilder {

    private LocalDateTime fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private TipoTransporte transporte;
    private List<String> actividades;
    private String dietaEspecial;

    ReservaViajeBuilder(){}

    public ReservaViajeBuilder fechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public ReservaViajeBuilder duracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    public ReservaViajeBuilder tipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
        return this;
    }

    public ReservaViajeBuilder transporte(TipoTransporte transporte) {
        this.transporte = transporte;
        return this;
    }

    public ReservaViajeBuilder actividades(List<String> actividades) {
        this.actividades = actividades;
        return this;
    }

    public ReservaViajeBuilder dietaEspecial(String dietaEspecial) {
        this.dietaEspecial = dietaEspecial;
        return this;
    }

    public ReservaViaje build(){
        return new ReservaViaje(fechaSalida, duracion, tipoAlojamiento, transporte, actividades, dietaEspecial);
    }

}