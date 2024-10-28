import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MiGUI extends JFrame {
    public MiGUI() {
        // Configuración de la ventana principal
        setTitle("Mi GUI Básica");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Etiqueta fija con los datos de los miembros del equipo
        JLabel etiquetaEquipo = new JLabel("Equipo: Raul Rodriguez, Andre Gonzales, Carlos");
        add(etiquetaEquipo);

        // Botón "Prueba"
        JButton botonPrueba = new JButton("Prueba");
        botonPrueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar mensaje "Hello World" en una ventana pequeña cerrable
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
        add(botonPrueba);

        // Botón "Salir"
        JButton botonSalir = new JButton("Salir");
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la aplicación
                System.exit(0);
            }
        });
        add(botonSalir);
    }

    public static void main(String[] args) {
        // Crear y mostrar la GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MiGUI().setVisible(true);
            }
        });
    }
}
