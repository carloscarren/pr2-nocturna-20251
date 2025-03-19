package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron;

import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.EmailNotificationFactory;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.NotificationFactory;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.SMSNotificationFactory;

public class NotificationServiceWithoutFactory {

    public static void main(String[] args) {
        String type = "email"; // Podría venir de un input

        NotificationFactory factory;

        if ("email".equalsIgnoreCase(type)) {
            factory = new EmailNotificationFactory();
        } else if ("sms".equalsIgnoreCase(type)) {
            factory = new SMSNotificationFactory();
        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }

        Notification notification = factory.createNotification();
        notification.send("Hello World!");
    }
}
/**
 ✅ Bajo acoplamiento: NotificationServiceWithFactory no depende de las clases concretas.
 ✅ Fácil mantenimiento: Si agregamos nuevas notificaciones, solo creamos una nueva fábrica sin modificar el código existente.
 ✅ Código más organizado y reutilizable: La creación de instancias se encapsula en fábricas.
 Si en el futuro queremos agregar una nueva notificación (por ejemplo, Push Notification),
 solo tenemos que crear una nueva fábrica sin tocar el código de NotificationServiceWithFactory.
 **/