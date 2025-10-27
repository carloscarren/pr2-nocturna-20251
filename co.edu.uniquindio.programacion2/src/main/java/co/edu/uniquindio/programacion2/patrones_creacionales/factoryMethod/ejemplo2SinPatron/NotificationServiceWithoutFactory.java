package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2SinPatron;

public class NotificationServiceWithoutFactory {

    public static void main(String[] args) {
        String type = "email"; // Podría venir de un input

        Notification notification;
        if ("email".equalsIgnoreCase(type)) {
            notification = new EmailNotification();
        } else if ("sms".equalsIgnoreCase(type)) {
            notification = new SMSNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }

        notification.send("Hello World!");
    }
}
/**
1. Alta dependencia: NotificationServiceWithoutFactory depende de las clases concretas (EmailNotification y SMSNotification).
2. Difícil de extender: Si agregamos nuevos tipos de notificación, tendríamos que modificar NotificationServiceWithoutFactory.
3. No es reutilizable: Cada vez que queremos una notificación, debemos escribir lógica condicional.
 **/