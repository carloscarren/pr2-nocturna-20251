package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2SinPatron;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}