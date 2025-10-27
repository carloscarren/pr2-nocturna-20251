package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee;

import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.service.ICoffee;

// Decorador concreto (Agrega azúcar)
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.3;
    }
}
