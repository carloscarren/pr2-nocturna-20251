package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploClavoTuerca;

// Clase existente con interfaz incompatible
public class Clavo {
    private double width;

    public Clavo(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
