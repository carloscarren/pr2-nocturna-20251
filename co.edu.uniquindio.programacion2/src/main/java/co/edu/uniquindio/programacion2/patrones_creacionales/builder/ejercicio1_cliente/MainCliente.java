package co.edu.uniquindio.programacion2.patrones_creacionales.builder.ejercicio1_cliente;


import co.edu.uniquindio.programacion2.patrones_creacionales.builder.ejercicio1_cliente.model.Cliente;

import java.util.ArrayList;

public class MainCliente {

    public static void main(String[] args) {
        ejemplo1();
    }


    private static void ejemplo1() {
        Cliente cliente1 = Cliente.builder()
                .apellido("pepe")
                .cedula("45455")
                .email("")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula("1094")
                .nombre("juan")
                .apellido("arias")
                .direccion("armenia")
                .build();
    }

}
