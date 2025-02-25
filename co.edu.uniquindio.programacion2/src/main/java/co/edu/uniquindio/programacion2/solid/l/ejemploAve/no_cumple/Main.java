package co.edu.uniquindio.programacion2.solid.l.ejemploAve.no_cumple;

class Ave {
    void volar() {
        System.out.println("Esta ave está volando.");
    }
}

class Gorrion extends Ave {
    // El gorrión puede volar, por lo que respeta la herencia.
}

class Pinguino extends Ave {
    // El pingüino no puede volar, pero está obligado a heredar volar()
    @Override
    void volar() {
        throw new UnsupportedOperationException("Los pingüinos no pueden volar.");
    }
}

public class Main {
    public static void main(String[] args) {
        Ave gorrion = new Gorrion();
        gorrion.volar(); // Funciona correctamente

        Ave pinguino = new Pinguino();
        pinguino.volar(); // Lanza una excepción, rompiendo el principio de Liskov
    }
}

/**
Ejemplo 1: Violación del Principio de Liskov
En este caso, el diseño de clases no es correcto porque un pingüino no puede volar,
pero al heredar de Ave, está obligado a implementar volar(). Esto genera un problema
cuando intentamos sustituir cualquier Ave por un Pingüino.

Contexto
Queremos modelar diferentes tipos de aves. Todas las aves tienen la capacidad de volar,
por lo que definimos un metodo volar(). Sin embargo, los pingüinos no pueden volar, lo que
rompe la jerarquía de herencia.

 Problema
 La clase Pinguino hereda volar(), pero debe lanzar una excepción porque no puede volar.
 Esto viola el LSP, ya que Pinguino no puede ser usado en lugar de Ave sin errores.
 No es seguro tratar a un Pinguino como un Ave si se espera que todas las Aves puedan volar.
**/