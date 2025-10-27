package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.abstraccion;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.implementacion.IColor;

// Implementación de la abstracción con el puente
public class Circle extends Shape {
    public Circle(IColor color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle drawn with color " + color.applyColor();
    }
}
