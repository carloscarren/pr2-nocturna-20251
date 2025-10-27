package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory;

import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.Notification;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.model.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
