/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que representa a un Ave, que hereda de la clase Animal.
 * 
 * @author Ivan Ocadiz
 */
public class Ave extends Animal {

    // Atributos específicos de la clase Ave
    private String tipoPlumaje;
    private boolean puedeVolar;
    private float envergaduraAlas;
    private String tipoPico;
    private boolean esMigratoria;

    /**
     * Constructor vacío de la clase Ave.
     */
    public Ave() {
        super();
    }

    /**
     * Constructor que inicializa un Ave con valores específicos, incluyendo los de la clase Animal.
     * 
     * @param nombre Nombre del ave
     * @param edad Edad del ave en años
     * @param peso Peso del ave en kilogramos
     * @param habitat Hábitat donde vive el ave
     * @param especie Especie del ave
     * @param tipoPlumaje Tipo de plumaje del ave
     * @param puedeVolar Indica si el ave puede volar
     * @param envergaduraAlas Envergadura de las alas del ave en metros
     * @param tipoPico Tipo de pico del ave
     * @param esMigratoria Indica si el ave es migratoria
     */
    public Ave(String nombre, int edad, float peso, String habitat, String especie, String tipoPlumaje, boolean puedeVolar, float envergaduraAlas, String tipoPico, boolean esMigratoria) {
        super(nombre, edad, peso, habitat, especie);
        this.tipoPlumaje = tipoPlumaje;
        this.puedeVolar = puedeVolar;
        this.envergaduraAlas = envergaduraAlas;
        this.tipoPico = tipoPico;
        this.esMigratoria = esMigratoria;
    }

    // Getters y Setters

    /**
     * Obtiene el tipo de plumaje del ave.
     * 
     * @return El tipo de plumaje del ave.
     */
    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    /**
     * Establece el tipo de plumaje del ave.
     * 
     * @param tipoPlumaje El nuevo tipo de plumaje del ave.
     */
    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    /**
     * Verifica si el ave puede volar.
     * 
     * @return true si el ave puede volar, false en caso contrario.
     */
    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    /**
     * Establece si el ave puede volar.
     * 
     * @param puedeVolar El nuevo estado de vuelo del ave.
     */
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    /**
     * Obtiene la envergadura de las alas del ave.
     * 
     * @return La envergadura de las alas en metros.
     */
    public float getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    /**
     * Establece la envergadura de las alas del ave.
     * 
     * @param envergaduraAlas La nueva envergadura de las alas del ave en metros.
     */
    public void setEnvergaduraAlas(float envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    /**
     * Obtiene el tipo de pico del ave.
     * 
     * @return El tipo de pico del ave.
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Establece el tipo de pico del ave.
     * 
     * @param tipoPico El nuevo tipo de pico del ave.
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * Verifica si el ave es migratoria.
     * 
     * @return true si el ave es migratoria, false en caso contrario.
     */
    public boolean isEsMigratoria() {
        return esMigratoria;
    }

    /**
     * Establece si el ave es migratoria.
     * 
     * @param esMigratoria El nuevo estado migratorio del ave.
     */
    public void setEsMigratoria(boolean esMigratoria) {
        this.esMigratoria = esMigratoria;
    }

    /**
     * Simula que el ave está volando.
     */
    public void volar() {
        if (puedeVolar) {
            System.out.println(getNombre() + " está volando.");
        } else {
            System.out.println(getNombre() + " no puede volar.");
        }
    }

    /**
     * Simula que el ave está cantando.
     */
    public void cantar() {
        System.out.println(getNombre() + " está cantando.");
    }

    /**
     * Simula que el ave está construyendo un nido.
     */
    public void construirNido() {
        System.out.println(getNombre() + " está construyendo su nido.");
    }

    /**
     * Simula que el ave está migrando.
     */
    public void migrar() {
        if (esMigratoria) {
            System.out.println(getNombre() + " está migrando.");
        } else {
            System.out.println(getNombre() + " no migra.");
        }
    }

    /**
     * Simula que el ave está incubando sus huevos.
     */
    public void incubarHuevos() {
        System.out.println(getNombre() + " está incubando sus huevos.");
    }

    /**
     * Retorna una representación en cadena de los atributos del ave.
     * @return Una cadena que representa al objeto Ave.
     */
    @Override
    public String toString() {
        return "Ave{" + "nombre=" + getNombre() + ", tipoPlumaje=" + tipoPlumaje + ", puedeVolar=" + puedeVolar + ", envergaduraAlas=" + envergaduraAlas + ", tipoPico=" + tipoPico + ", esMigratoria=" + esMigratoria + '}';
    }
}