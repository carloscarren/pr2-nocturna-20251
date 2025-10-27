package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploClavoTuerca;

// Adaptador para que Clavo funcione con Tuerca
public class ClavoAdapter extends Tornillo{
private Clavo clavo;

    public ClavoAdapter(Clavo clavo) {
        this.clavo = clavo;
    }

    @Override
    public double getRadius() {
        return clavo.getWidth() * Math.sqrt(2)/2;
    }
}
