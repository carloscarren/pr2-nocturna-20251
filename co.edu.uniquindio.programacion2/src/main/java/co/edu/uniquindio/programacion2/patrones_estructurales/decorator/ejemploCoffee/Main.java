package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee;

import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.model.SimpleCoffee;
import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.service.ICoffee;

// Uso del patrón Decorator - Añade dinámicamente funcionalidades a un objeto sin modificar su estructura original.
public class Main {

//    Los decoradores como MilkDecorator y SugarDecorator añaden
//    funcionalidad extra (leche, azúcar) a un objeto Coffee sin modificar sus clases.
    public static void main(String[] args) {
        ICoffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}