package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.model;


import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}