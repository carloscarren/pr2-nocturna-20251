package co.edu.uniquindio.programacion2.patrones_estructurales.flyweight.ejemploCaracter;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {

    private Map<Character, Caracter> caracteres = new HashMap<>();

    public Caracter obtenerCaracter(char simbolo) {
        Caracter caracter = caracteres.get(simbolo);
        if (caracter == null) {
            caracter = new Caracter(simbolo);
            caracteres.put(simbolo, caracter);
        }
        return caracter;
    }

}
