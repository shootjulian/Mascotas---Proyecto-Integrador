package interfaz;

import mundo.GestorMascotas;
import mundo.Mascota;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ventana principal del sistema de mascotas.
 *
 * Esta clase integra los paneles de datos, botones y resultado. También se
 * encarga de escuchar los eventos de los botones y llamar los métodos
 * correspondientes del gestor.
 */
public class InterfazMascotas extends JFrame implements ActionListener {

    private PanelDatos panelDatos;
    private PanelBotones panelBotones;
    private PanelResultado panelResultado;
    private GestorMascotas gestor;

    /**
     * Construye la ventana principal del programa.
     *
     * Inicializa el gestor, crea los paneles, define la distribución gráfica
     * y registra los eventos de los botones.
     */
    public InterfazMascotas() {

        gestor = new GestorMascotas();

        setTitle("Sistema de Mascotas - Proyecto Integrador");
        setSize(850, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        panelDatos = new PanelDatos();
        panelBotones = new PanelBotones();
        panelResultado = new PanelResultado();

        add(panelDatos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.WEST);
        add(panelResultado, BorderLayout.CENTER);

        registrarEventos();
    }

    /**
     * Conecta cada botón con la ventana principal como escuchador de eventos.
     *
     * Cuando el usuario presiona un botón, Java llama automáticamente al método
     * actionPerformed.
     */
    private void registrarEventos() {

        panelBotones.btnRegistrar.addActionListener(this);
        panelBotones.btnMostrar.addActionListener(this);
        panelBotones.btnBuscar.addActionListener(this);
        panelBotones.btnActualizar.addActionListener(this);
        panelBotones.btnEliminar.addActionListener(this);
        panelBotones.btnCategorias.addActionListener(this);
        panelBotones.btnLimpiar.addActionListener(this);
    }

    /**
     * Atiende los eventos generados por los botones.
     *
     * @param e evento producido al presionar un botón.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        Object origen = e.getSource();

        if (origen == panelBotones.btnRegistrar) {
            registrarMascota();
        }

        if (origen == panelBotones.btnMostrar) {
            mostrarMascotas();
        }

        if (origen == panelBotones.btnBuscar) {
            buscarMascota();
        }

        if (origen == panelBotones.btnActualizar) {
            actualizarMascota();
        }

        if (origen == panelBotones.btnEliminar) {
            eliminarMascota();
        }

        if (origen == panelBotones.btnCategorias) {
            mostrarCategorias();
        }

        if (origen == panelBotones.btnLimpiar) {
            limpiar();
        }
    }

    /**
     * Valida que los campos estén completos y que la edad sea numérica.
     *
     * @return true si los datos son válidos; false si falta información o la edad no es válida.
     */
    private boolean validarCamposCompletos() {

        if (panelDatos.getId().isEmpty() ||
                panelDatos.getNombre().isEmpty() ||
                panelDatos.getEspecie().isEmpty() ||
                panelDatos.getEdad().isEmpty() ||
                panelDatos.getDueno().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return false;
        }

        try {
            Integer.parseInt(panelDatos.getEdad());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número entero.");
            return false;
        }

        return true;
    }

    /**
     * Valida que el usuario haya digitado un ID.
     *
     * @return true si el ID no está vacío; false en caso contrario.
     */
    private boolean validarId() {

        if (panelDatos.getId().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el ID de la mascota.");
            return false;
        }

        return true;
    }

    /**
     * Registra una mascota usando los datos ingresados en el panel.
     */
    private void registrarMascota() {

        if (!validarCamposCompletos()) {
            return;
        }

        boolean registrado = gestor.registrarMascota(
                panelDatos.getId(),
                panelDatos.getNombre(),
                panelDatos.getEspecie(),
                panelDatos.getEdad(),
                panelDatos.getDueno()
        );

        if (registrado) {
            JOptionPane.showMessageDialog(this, "Mascota registrada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe una mascota con ese ID.");
        }
    }

    /**
     * Muestra en pantalla todas las mascotas registradas.
     */
    private void mostrarMascotas() {

        panelResultado.mostrarTexto(gestor.mostrarMascotas());
    }

    /**
     * Busca una mascota por ID y muestra su información.
     */
    private void buscarMascota() {

        if (!validarId()) {
            return;
        }

        Mascota mascota = gestor.buscarMascota(panelDatos.getId());

        if (mascota == null) {
            JOptionPane.showMessageDialog(this, "No existe una mascota con ese ID.");
        } else {
            panelResultado.mostrarTexto(mascota.toString());
        }
    }

    /**
     * Actualiza los datos de una mascota existente.
     */
    private void actualizarMascota() {

        if (!validarCamposCompletos()) {
            return;
        }

        boolean actualizado = gestor.actualizarMascota(
                panelDatos.getId(),
                panelDatos.getNombre(),
                panelDatos.getEspecie(),
                panelDatos.getEdad(),
                panelDatos.getDueno()
        );

        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Mascota actualizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No existe una mascota con ese ID.");
        }
    }

    /**
     * Elimina una mascota registrada usando su ID.
     */
    private void eliminarMascota() {

        if (!validarId()) {
            return;
        }

        boolean eliminado = gestor.eliminarMascota(panelDatos.getId());

        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Mascota eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No existe una mascota con ese ID.");
        }
    }

    /**
     * Muestra la matriz de categorías de referencia.
     */
    private void mostrarCategorias() {

        panelResultado.mostrarTexto(gestor.mostrarCategorias());
    }

    /**
     * Limpia los campos de entrada y el área de resultado.
     */
    private void limpiar() {

        panelDatos.limpiarCampos();
        panelResultado.limpiar();
    }

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos. No se usan en este proyecto.
     */
    public static void main(String[] args) {

        InterfazMascotas ventana = new InterfazMascotas();
        ventana.setVisible(true);
    }
}
