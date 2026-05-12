package interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel utilizado para mostrar resultados al usuario.
 *
 * Contiene un área de texto no editable donde se presentan listados,
 * búsquedas y categorías.
 */
public class PanelResultado extends JPanel {

    private JTextArea areaTexto;

    /**
     * Construye el panel de resultado con un área de texto dentro de un scroll.
     */
    public PanelResultado() {

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Resultado"));

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    /**
     * Muestra un texto en el área de resultado.
     *
     * @param texto contenido que se desea mostrar.
     */
    public void mostrarTexto(String texto) {
        areaTexto.setText(texto);
        areaTexto.setCaretPosition(0);
    }

    /**
     * Limpia el área de resultado.
     */
    public void limpiar() {
        areaTexto.setText("");
    }
}
