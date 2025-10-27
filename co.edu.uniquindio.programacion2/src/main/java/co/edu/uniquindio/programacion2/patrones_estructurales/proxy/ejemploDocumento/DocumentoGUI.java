package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploDocumento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DocumentoGUI extends JFrame {
    private JTextField documentNameField;
    private JButton loadButton;
    private JTextArea documentContentArea;
    private IDocumento documentoProxy;

    public DocumentoGUI() {
        // Configuración de la ventana principal
        setTitle("Gestión de Documentos - Proxy");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Etiqueta para el nombre del documento
        JLabel nameLabel = new JLabel("Nombre del Documento:");
        nameLabel.setBounds(20, 20, 200, 30);
        add(nameLabel);

        // Campo de texto para ingresar el nombre del documento
        documentNameField = new JTextField();
        documentNameField.setBounds(180, 20, 200, 30);
        add(documentNameField);

        // Botón para cargar el documento
        loadButton = new JButton("Cargar Documento");
        loadButton.setBounds(180, 60, 150, 30);
        add(loadButton);

        // Área de texto para mostrar el contenido del documento
        documentContentArea = new JTextArea();
        documentContentArea.setBounds(20, 100, 440, 200);
        documentContentArea.setEditable(false);
        add(documentContentArea);

        // Acción al presionar el botón "Cargar Documento"
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadDocument();
            }
        });

        setVisible(true);
    }

    private void loadDocument() {
        // Obtener el nombre del documento desde el campo de texto
        String documentName = documentNameField.getText();

        // Crear el proxy y cargar el documento
        documentoProxy = new DocumentoProxy(documentName);
        String contenido = documentoProxy.mostrar();

        // Mostrar el contenido en el área de texto
        documentContentArea.setText(contenido);
    }

    public static void main(String[] args) {
        new DocumentoGUI();
    }
}
