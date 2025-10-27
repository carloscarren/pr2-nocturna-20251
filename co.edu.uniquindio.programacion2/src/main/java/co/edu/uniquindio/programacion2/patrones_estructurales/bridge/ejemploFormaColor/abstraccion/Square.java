package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.abstraccion;


import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploFormaColor.implementacion.IColor;

public class Square extends Shape {
    public Square(IColor color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn with color " + color.applyColor();
    }
}
