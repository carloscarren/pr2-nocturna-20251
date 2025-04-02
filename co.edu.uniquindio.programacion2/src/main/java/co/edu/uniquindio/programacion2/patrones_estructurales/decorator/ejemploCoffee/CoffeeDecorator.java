package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee;


import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.service.ICoffee;

// Decorador base
abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
