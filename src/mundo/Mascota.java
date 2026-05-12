package mundo;

/**
 * Representa una mascota registrada en el sistema.
 *
 * Esta clase funciona como modelo de datos. Su responsabilidad principal es
 * guardar la información básica de una mascota: identificador, nombre,
 * especie, edad y nombre del dueño.
 */
public class Mascota {

    private String id;
    private String nombre;
    private String especie;
    private String edad;
    private String dueno;

    /**
     * Construye una nueva mascota con todos sus datos básicos.
     *
     * @param id identificador único de la mascota.
     * @param nombre nombre de la mascota.
     * @param especie especie o tipo de animal.
     * @param edad edad de la mascota.
     * @param dueno nombre del dueño de la mascota.
     */
    public Mascota(String id, String nombre, String especie, String edad, String dueno) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueno = dueno;
    }

    /**
     * Retorna el identificador de la mascota.
     *
     * @return id de la mascota.
     */
    public String getId() {
        return id;
    }

    /**
     * Modifica el nombre de la mascota.
     *
     * @param nombre nuevo nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la especie de la mascota.
     *
     * @param especie nueva especie de la mascota.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Modifica la edad de la mascota.
     *
     * @param edad nueva edad de la mascota.
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Modifica el nombre del dueño de la mascota.
     *
     * @param dueno nuevo dueño de la mascota.
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * Retorna los datos de la mascota en formato de texto.
     * Este método se usa para mostrar la información en pantalla.
     *
     * @return cadena de texto con los datos de la mascota.
     */
    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Especie: " + especie +
                " | Edad: " + edad +
                " | Dueño: " + dueno;
    }
}
