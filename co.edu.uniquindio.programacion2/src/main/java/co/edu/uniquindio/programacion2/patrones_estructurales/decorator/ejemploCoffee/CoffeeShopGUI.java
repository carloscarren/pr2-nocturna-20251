package co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee;

import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.model.SimpleCoffee;
import co.edu.uniquindio.programacion2.patrones_estructurales.decorator.ejemploCoffee.service.ICoffee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeShopGUI extends JFrame {
    private JCheckBox milkCheckBox;
    private JCheckBox sugarCheckBox;
    private JButton calculateButton;
    private JLabel costLabel;
    private JLabel ingredientsLabel;
    private ICoffee coffee;

    public CoffeeShopGUI() {
        // Configuración de la ventana principal
        setTitle("Cafetería - Patrón Decorador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear los componentes de la interfaz
        JLabel titleLabel = new JLabel("Elige los ingredientes para tu café:");
        titleLabel.setBounds(50, 30, 300, 30);
        add(titleLabel);

        milkCheckBox = new JCheckBox("Añadir Leche");
        milkCheckBox.setBounds(50, 70, 150, 30);
        add(milkCheckBox);

        sugarCheckBox = new JCheckBox("Añadir Azúcar");
        sugarCheckBox.setBounds(50, 100, 150, 30);
        add(sugarCheckBox);

        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(50, 140, 150, 30);
        add(calculateButton);

        costLabel = new JLabel("Costo: $0.0");
        costLabel.setBounds(50, 180, 300, 30);
        add(costLabel);

        ingredientsLabel = new JLabel("Ingredientes: Ninguno");
        ingredientsLabel.setBounds(50, 210, 300, 30);
        add(ingredientsLabel);

        // Agregar el ActionListener para el botón
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCoffee();
            }
        });

        setVisible(true);
    }

    private void calculateCoffee() {
        // Crear un café simple
        coffee = new SimpleCoffee();

        // Verificar si se seleccionó leche y aplicar el decorador
        if (milkCheckBox.isSelected()) {
            coffee = new MilkDecorator(coffee);
        }

        // Verificar si se seleccionó azúcar y aplicar el decorador
        if (sugarCheckBox.isSelected()) {
            coffee = new SugarDecorator(coffee);
        }

        // Mostrar el costo y los ingredientes
        costLabel.setText("Costo: $" + coffee.getCost());
        ingredientsLabel.setText("Ingredientes: " + coffee.getDescription());
    }

    public static void main(String[] args) {
        new CoffeeShopGUI();
    }
}
