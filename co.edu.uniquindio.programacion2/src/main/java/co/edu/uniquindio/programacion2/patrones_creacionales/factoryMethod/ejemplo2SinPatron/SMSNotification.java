package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2SinPatron;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}