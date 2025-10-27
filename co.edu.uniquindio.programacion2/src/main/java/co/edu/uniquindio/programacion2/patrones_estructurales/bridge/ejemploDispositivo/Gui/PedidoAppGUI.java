package co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.Gui;

import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.abstraccion.*;
import co.edu.uniquindio.programacion2.patrones_estructurales.bridge.ejemploDispositivo.implementacion.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedidoAppGUI extends JFrame {

    private JComboBox<String> tipoPedidoCombo;
    private JComboBox<String> sistemaPagoCombo;
    private JTextField montoField;
    private JTextArea outputArea;

    public PedidoAppGUI() {
        setTitle("Pedido App - Patrón Bridge");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de opciones
        JPanel optionsPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        optionsPanel.add(new JLabel("Tipo de Pedido:"));
        tipoPedidoCombo = new JComboBox<>(new String[]{"Pedido Físico", "Pedido Digital"});
        optionsPanel.add(tipoPedidoCombo);

        optionsPanel.add(new JLabel("Sistema de Pago:"));
        sistemaPagoCombo = new JComboBox<>(new String[]{"Tarjeta", "PayPal"});
        optionsPanel.add(sistemaPagoCombo);

        optionsPanel.add(new JLabel("Monto:"));
        montoField = new JTextField();
        optionsPanel.add(montoField);

        JButton realizarPagoButton = new JButton("Realizar Pago");
        realizarPagoButton.addActionListener(new RealizarPagoListener());
        optionsPanel.add(realizarPagoButton);

        add(optionsPanel, BorderLayout.NORTH);

        // Área de salida
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private class RealizarPagoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tipoPedido = (String) tipoPedidoCombo.getSelectedItem();
            String sistemaPago = (String) sistemaPagoCombo.getSelectedItem();
            double monto;

            try {
                monto = Double.parseDouble(montoField.getText());
            } catch (NumberFormatException ex) {
                outputArea.append("Por favor, ingrese un monto válido.\n");
                return;
            }

            ISistemaPago sistemaPagoObj;
            if ("Tarjeta".equals(sistemaPago)) {
                sistemaPagoObj = new PagoTarjeta();
            } else {
                sistemaPagoObj = new PagoPaypal();
            }

            Pedido pedido;
            if ("Pedido Físico".equals(tipoPedido)) {
                pedido = new PedidoFisico(sistemaPagoObj);
            } else {
                pedido = new PedidoDigital(sistemaPagoObj);
            }

            outputArea.append("Realizando " + tipoPedido + " con " + sistemaPago + "...\n");
            pedido.realizarPago(monto);
            outputArea.append("Pago completado por $" + monto + ".\n\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PedidoAppGUI frame = new PedidoAppGUI();
            frame.setVisible(true);
        });
    }
}
