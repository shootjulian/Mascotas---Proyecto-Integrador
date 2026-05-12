package interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel encargado de recibir los datos digitados por el usuario.
 *
 * En este panel se encuentran los campos de texto para ingresar ID, nombre,
 * especie, edad y dueño de la mascota.
 */
public class PanelDatos extends JPanel {

    private JTextField campoId;
    private JTextField campoNombre;
    private JTextField campoEspecie;
    private JTextField campoEdad;
    private JTextField campoDueno;

    /**
     * Construye el panel de datos y organiza sus componentes en una cuadrícula.
     */
    public PanelDatos() {

        setLayout(new GridLayout(5, 2, 8, 8));
        setBorder(BorderFactory.createTitledBorder("Datos de la mascota"));

        add(new JLabel("ID:"));
        campoId = new JTextField();
        add(campoId);

        add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        add(campoNombre);

        add(new JLabel("Especie:"));
        campoEspecie = new JTextField();
        add(campoEspecie);

        add(new JLabel("Edad:"));
        campoEdad = new JTextField();
        add(campoEdad);

        add(new JLabel("Dueño:"));
        campoDueno = new JTextField();
        add(campoDueno);
    }

    /**
     * Obtiene el ID digitado por el usuario.
     *
     * @return ID sin espacios al inicio o al final.
     */
    public String getId() {
        return campoId.getText().trim();
    }

    /**
     * Obtiene el nombre digitado por el usuario.
     *
     * @return nombre sin espacios al inicio o al final.
     */
    public String getNombre() {
        return campoNombre.getText().trim();
    }

    /**
     * Obtiene la especie digitada por el usuario.
     *
     * @return especie sin espacios al inicio o al final.
     */
    public String getEspecie() {
        return campoEspecie.getText().trim();
    }

    /**
     * Obtiene la edad digitada por el usuario.
     *
     * @return edad sin espacios al inicio o al final.
     */
    public String getEdad() {
        return campoEdad.getText().trim();
    }

    /**
     * Obtiene el nombre del dueño digitado por el usuario.
     *
     * @return dueño sin espacios al inicio o al final.
     */
    public String getDueno() {
        return campoDueno.getText().trim();
    }

    /**
     * Limpia todos los campos de entrada del formulario.
     */
    public void limpiarCampos() {
        campoId.setText("");
        campoNombre.setText("");
        campoEspecie.setText("");
        campoEdad.setText("");
        campoDueno.setText("");
    }
}
