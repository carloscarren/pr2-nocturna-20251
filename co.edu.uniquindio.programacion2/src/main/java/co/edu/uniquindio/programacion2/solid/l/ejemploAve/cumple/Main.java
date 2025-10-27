package co.edu.uniquindio.programacion2.solid.l.ejemploAve.cumple;

// Interfaz general para todas las aves
interface Ave {
    void comer();
}

// Interfaz específica para aves que pueden volar
interface AveVoladora extends Ave {
    void volar();
}

// Implementación para un gorrión, que puede volar
class Gorrion implements AveVoladora {
    @Override
    public void comer() {
        System.out.println("El gorrión está comiendo.");
    }

    @Override
    public void volar() {
        System.out.println("El gorrión está volando.");
    }
}

// Implementación para un pingüino, que NO puede volar
class Pinguino implements Ave {
    @Override
    public void comer() {
        System.out.println("El pingüino está comiendo.");
    }
}

public class Main {
    public static void main(String[] args) {
        AveVoladora gorrion = new Gorrion();
        gorrion.volar(); // Funciona correctamente

        Ave pinguino = new Pinguino();
        pinguino.comer(); // Funciona correctamente sin romper el LSP
    }
}

/**
Ejemplo 2: Corrección Respetando LSP
Para solucionar el problema, separamos la jerarquía de clases en dos interfaces:
 una para todas las aves y otra solo para las que pueden volar.

 Contexto
Queremos que la solución modele correctamente a las aves,
 permitiendo que solo las que realmente pueden volar tengan el metodo volar().


 Solución
 Ahora Pinguino no hereda un método volar() que no puede implementar.
 Se usa una interfaz separada AveVoladora solo para aves que pueden volar.
 Gorrion implementa AveVoladora correctamente, y Pinguino solo implementa Ave.
 Beneficios
 ✅ Evita la necesidad de lanzar excepciones en Pinguino.
 ✅ Garantiza que cualquier Ave pueda ser reemplazada sin problemas.
 ✅ Código más flexible, modular y fácil de mantener.
 **/