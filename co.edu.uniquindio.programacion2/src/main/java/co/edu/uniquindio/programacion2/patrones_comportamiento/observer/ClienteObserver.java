package co.edu.uniquindio.programacion2.patrones_comportamiento.observer;

import javax.swing.*;
import java.awt.*;

class ClienteObserver extends JFrame implements Observer {
    private JLabel stockLabel;
    private Producto producto;

    public ClienteObserver(Producto producto) {
        this.producto = producto;
        this.producto.agregarObserver(this);

        setTitle("Notificación de Inventario");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        stockLabel = new JLabel("Stock actual: " + producto.getStock());
        add(stockLabel);

        setVisible(true);
    }

    @Override
    public void actualizar(int stock) {
        stockLabel.setText("Stock actual: " + stock);
        if (stock <= 0) {
            stockLabel.setForeground(Color.RED);
            stockLabel.setText("Producto fuera de stock");
        } else {
            stockLabel.setForeground(Color.BLACK);
        }
    }
}
