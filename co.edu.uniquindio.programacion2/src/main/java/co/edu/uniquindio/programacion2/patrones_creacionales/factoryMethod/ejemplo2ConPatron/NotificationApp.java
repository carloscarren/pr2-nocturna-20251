package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron;

import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.EmailNotificationFactory;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.NotificationFactory;
import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.ejemplo2ConPatron.factory.SMSNotificationFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotificationApp extends JFrame {
    private JComboBox<String> notificationTypeComboBox;
    private JTextField messageField;
    private JButton sendButton;

    public NotificationApp() {
        setTitle("Notification Sender");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        // Componentes de la UI
        JLabel typeLabel = new JLabel("Notification Type:");
        notificationTypeComboBox = new JComboBox<>(new String[]{"Email", "SMS"});
        JLabel messageLabel = new JLabel("Message:");
        messageField = new JTextField();
        sendButton = new JButton("Send Notification");

        // Agregar componentes a la ventana
        add(typeLabel);
        add(notificationTypeComboBox);
        add(messageLabel);
        add(messageField);
        add(new JLabel()); // Espacio vacío
        add(sendButton);

        // Acción del botón
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = (String) notificationTypeComboBox.getSelectedItem();
                String message = messageField.getText();

                NotificationFactory factory = null;

                if ("Email".equalsIgnoreCase(type)) {
                    factory = new EmailNotificationFactory();
                } else if ("SMS".equalsIgnoreCase(type)) {
                    factory = new SMSNotificationFactory();
                }

                if (factory != null) {
                    Notification notification = factory.createNotification();
                    notification.send(message);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NotificationApp().setVisible(true);
        });
    }
}