/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que representa a un Perro, que hereda de la clase Animal.
 * 
 * @author Ivan Ocadiz
 */
public class Perro extends Animal {

    // Atributos específicos de la clase Perro
    private String raza;
    private boolean esAdoptado;
    private String colorPelaje;
    private boolean tieneCollar;
    private String tamaño;

    /**
     * Constructor vacío de la clase Perro.
     */
    public Perro() {
        super();
    }

    /**
     * Constructor que inicializa un Perro con valores específicos, incluyendo los de la clase Animal.
     * 
     * @param nombre Nombre del perro
     * @param edad Edad del perro en años
     * @param peso Peso del perro en kilogramos
     * @param habitat Hábitat donde vive el perro
     * @param especie Especie del perro (generalmente "Canis lupus familiaris")
     * @param raza Raza del perro
     * @param esAdoptado Indica si el perro ha sido adoptado
     * @param colorPelaje Color del pelaje del perro
     * @param tieneCollar Indica si el perro lleva collar
     * @param tamaño Tamaño del perro (ej. pequeño, mediano, grande)
     */
    public Perro(String nombre, int edad, float peso, String habitat, String especie, String raza, boolean esAdoptado, String colorPelaje, boolean tieneCollar, String tamaño) {
        super(nombre, edad, peso, habitat, especie);
        this.raza = raza;
        this.esAdoptado = esAdoptado;
        this.colorPelaje = colorPelaje;
        this.tieneCollar = tieneCollar;
        this.tamaño = tamaño;
    }

    // Getters y Setters

    /**
     * Obtiene la raza del perro.
     * 
     * @return La raza del perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza del perro.
     * 
     * @param raza La nueva raza del perro.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Verifica si el perro ha sido adoptado.
     * 
     * @return true si el perro ha sido adoptado, false en caso contrario.
     */
    public boolean isEsAdoptado() {
        return esAdoptado;
    }

    /**
     * Establece el estado de adopción del perro.
     * 
     * @param esAdoptado El nuevo estado de adopción del perro.
     */
    public void setEsAdoptado(boolean esAdoptado) {
        this.esAdoptado = esAdoptado;
    }

    /**
     * Obtiene el color del pelaje del perro.
     * 
     * @return El color del pelaje del perro.
     */
    public String getColorPelaje() {
        return colorPelaje;
    }

    /**
     * Establece el color del pelaje del perro.
     * 
     * @param colorPelaje El nuevo color del pelaje del perro.
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    /**
     * Verifica si el perro tiene collar.
     * 
     * @return true si el perro tiene collar, false en caso contrario.
     */
    public boolean isTieneCollar() {
        return tieneCollar;
    }

    /**
     * Establece si el perro tiene collar.
     * 
     * @param tieneCollar El nuevo estado del collar del perro.
     */
    public void setTieneCollar(boolean tieneCollar) {
        this.tieneCollar = tieneCollar;
    }

    /**
     * Obtiene el tamaño del perro.
     * 
     * @return El tamaño del perro (pequeño, mediano o grande).
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Establece el tamaño del perro.
     * 
     * @param tamaño El nuevo tamaño del perro.
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Simula que el perro está ladrando.
     */
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    /**
     * Simula que el perro está corriendo.
     */
    public void correr() {
        System.out.println(getNombre() + " está corriendo.");
    }

    /**
     * Simula que el perro está jugando con su dueño.
     */
    public void jugarConDueño() {
        System.out.println(getNombre() + " está jugando con su dueño.");
    }

    /**
     * Simula que el perro está durmiendo.
     */
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo.");
    }

    /**
     * Simula que el perro está siendo entrenado.
     */
    public void entrenar() {
        System.out.println(getNombre() + " está siendo entrenado.");
    }

    /**
     * Retorna una representación en cadena de los atributos del perro.
     * @return Una cadena que representa al objeto Perro.
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + getNombre() + ", raza=" + raza + ", esAdoptado=" + esAdoptado + ", colorPelaje=" + colorPelaje + ", tieneCollar=" + tieneCollar + ", tamaño=" + tamaño + '}';
    }
}
