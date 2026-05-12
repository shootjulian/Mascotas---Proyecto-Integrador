package interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que agrupa los botones de acción del sistema.
 *
 * Cada botón representa una operación del CRUD o una acción auxiliar.
 */
public class PanelBotones extends JPanel {

    public JButton btnRegistrar;
    public JButton btnMostrar;
    public JButton btnBuscar;
    public JButton btnActualizar;
    public JButton btnEliminar;
    public JButton btnCategorias;
    public JButton btnLimpiar;

    /**
     * Construye el panel de botones y crea las opciones disponibles.
     */
    public PanelBotones() {

        setLayout(new GridLayout(7, 1, 8, 8));
        setBorder(BorderFactory.createTitledBorder("Opciones"));

        btnRegistrar = new JButton("Registrar");
        btnMostrar = new JButton("Mostrar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnCategorias = new JButton("Categorías");
        btnLimpiar = new JButton("Limpiar");

        add(btnRegistrar);
        add(btnMostrar);
        add(btnBuscar);
        add(btnActualizar);
        add(btnEliminar);
        add(btnCategorias);
        add(btnLimpiar);
    }
}
