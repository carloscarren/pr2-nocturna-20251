package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploClavoTuerca;

// Clase con la que queremos que trabaje Clavo
public class Tuerca {
    private double radius;

    public Tuerca(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean enrroscar(Tornillo tornillo){
        return this.radius >= tornillo.getRadius();
    }

}
