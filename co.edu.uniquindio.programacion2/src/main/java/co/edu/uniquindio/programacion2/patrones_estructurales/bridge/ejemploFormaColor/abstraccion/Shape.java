package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.abstraccion;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.implementacion.IColor;

// Abstracción
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    public abstract String draw();
}
