package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.model;


import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.service.ICoffee;

// Objeto concreto
public class SimpleCoffee implements ICoffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
