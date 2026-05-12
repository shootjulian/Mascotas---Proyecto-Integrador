package mundo;

import java.util.ArrayList;

/**
 * Administra la información de las mascotas registradas.
 *
 * Esta clase contiene la lógica principal del CRUD:
 * registrar, buscar, actualizar, eliminar y mostrar mascotas.
 */
public class GestorMascotas {

    /**
     * Lista unidimensional donde se almacenan las mascotas.
     * Se usa ArrayList porque permite agregar y eliminar elementos fácilmente.
     */
    private ArrayList<Mascota> mascotas;

    /**
     * Arreglo bidimensional de referencia.
     * Cada fila contiene una especie y una descripción general.
     */
    private String[][] categorias;

    /**
     * Crea el gestor e inicializa la lista de mascotas y la matriz de categorías.
     */
    public GestorMascotas() {
        mascotas = new ArrayList<>();

        categorias = new String[][]{
                {"Perro", "Canino"},
                {"Gato", "Felino"},
                {"Ave", "Animal con plumas"},
                {"Pez", "Animal acuático"}
        };
    }

    /**
     * Registra una nueva mascota si el ID no existe previamente.
     *
     * @param id identificador único de la mascota.
     * @param nombre nombre de la mascota.
     * @param especie especie de la mascota.
     * @param edad edad de la mascota.
     * @param dueno nombre del dueño.
     * @return true si la mascota fue registrada; false si ya existía una mascota con ese ID.
     */
    public boolean registrarMascota(String id, String nombre, String especie, String edad, String dueno) {

        if (buscarMascota(id) != null) {
            return false;
        }

        Mascota mascota = new Mascota(id, nombre, especie, edad, dueno);
        mascotas.add(mascota);
        return true;
    }

    /**
     * Busca una mascota por su identificador.
     *
     * @param id identificador de la mascota que se desea buscar.
     * @return la mascota encontrada; null si no existe.
     */
    public Mascota buscarMascota(String id) {

        for (Mascota mascota : mascotas) {

            if (mascota.getId().equals(id)) {
                return mascota;
            }
        }

        return null;
    }

    /**
     * Actualiza los datos de una mascota existente.
     *
     * @param id identificador de la mascota que se desea actualizar.
     * @param nombre nuevo nombre.
     * @param especie nueva especie.
     * @param edad nueva edad.
     * @param dueno nuevo dueño.
     * @return true si la mascota fue actualizada; false si no existe.
     */
    public boolean actualizarMascota(String id, String nombre, String especie, String edad, String dueno) {

        Mascota mascota = buscarMascota(id);

        if (mascota == null) {
            return false;
        }

        mascota.setNombre(nombre);
        mascota.setEspecie(especie);
        mascota.setEdad(edad);
        mascota.setDueno(dueno);

        return true;
    }

    /**
     * Elimina una mascota usando su ID.
     *
     * @param id identificador de la mascota que se desea eliminar.
     * @return true si la mascota fue eliminada; false si no existe.
     */
    public boolean eliminarMascota(String id) {

        Mascota mascota = buscarMascota(id);

        if (mascota == null) {
            return false;
        }

        mascotas.remove(mascota);
        return true;
    }

    /**
     * Genera un texto con todas las mascotas registradas.
     *
     * @return texto con el listado de mascotas o mensaje si no hay registros.
     */
    public String mostrarMascotas() {

        if (mascotas.isEmpty()) {
            return "No hay mascotas registradas.";
        }

        String texto = "MASCOTAS REGISTRADAS\n\n";

        for (Mascota mascota : mascotas) {
            texto += mascota.toString() + "\n";
        }

        return texto;
    }

    /**
     * Genera un texto con las categorías de referencia almacenadas en la matriz.
     *
     * @return texto con las categorías disponibles.
     */
    public String mostrarCategorias() {

        String texto = "CATEGORÍAS DE REFERENCIA\n\n";

        for (int fila = 0; fila < categorias.length; fila++) {
            texto += categorias[fila][0] + " - " + categorias[fila][1] + "\n";
        }

        return texto;
    }
}
