/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *Clase que representa un Perico que hereda de Ave.
 * @author maiap
 */
public class Perico extends Ave {
    
    // Atributos específicos de un perico
    private String colorPrincipal; 
    private boolean puedeHablar; 
    private String tamañoPico; 
    private int nivelActividad; 
    private boolean esDomestico; 
    private String temperamento; 
    
    /**
     * Constructor vacío de la clase Perico.
     */
    public Perico() {
        super();
    }

    /**
     * Constructor que inicializa un Perico con valores específicos.
     * 
     * @param colorPrincipal Color dominante de las plumas del perico
     * @param puedeHablar Indica si el perico puede imitar sonidos o palabras humanas
     * @param tamañoPico Tamaño del pico (pequeño, mediano, grande)
     * @param nivelActividad Nivel de actividad del perico en una escala de 1 a 10
     * @param esDomestico Si el perico es doméstico o salvaje
     * @param temperamento Características de personalidad del perico
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
    public Perico(String colorPrincipal, boolean puedeHablar, String tamañoPico, int nivelActividad, boolean esDomestico, String temperamento, String nombre, int edad, float peso, String habitat, String especie, String tipoPlumaje, boolean puedeVolar, float envergaduraAlas, String tipoPico, boolean esMigratoria) {
        super(nombre, edad, peso, habitat, especie, tipoPlumaje, puedeVolar, envergaduraAlas, tipoPico, esMigratoria);
        this.colorPrincipal = colorPrincipal;
        this.puedeHablar = puedeHablar;
        this.tamañoPico = tamañoPico;
        this.nivelActividad = nivelActividad;
        this.esDomestico = esDomestico;
        this.temperamento = temperamento;
    }

    // Getters y Setters 

    /**
     * Obtiene el color principal del plumaje del perico.
     * 
     * @return el color principal de las plumas del perico
     */
    public String getColorPrincipal() {
        return colorPrincipal;
    }

    /**
     * Establece el color principal del plumaje del perico.
     * 
     * @param colorPrincipal el nuevo color principal de las plumas del perico
     */
    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    /**
     * Verifica si el perico tiene la capacidad de hablar o imitar sonidos.
     * 
     * @return true si el perico puede hablar, false en caso contrario
     */
    public boolean isPuedeHablar() {
        return puedeHablar;
    }

    /**
     * Establece si el perico puede hablar o imitar sonidos.
     * 
     * @param puedeHablar true si el perico tiene la capacidad de hablar, false si no la tiene
     */
    public void setPuedeHablar(boolean puedeHablar) {
        this.puedeHablar = puedeHablar;
    }

    /**
     * Obtiene el tamaño del pico del perico.
     * 
     * @return el tamaño del pico del perico (pequeño, mediano, grande)
     */
    public String getTamañoPico() {
        return tamañoPico;
    }

    /**
     * Establece el tamaño del pico del perico.
     * 
     * @param tamañoPico el nuevo tamaño del pico del perico (pequeño, mediano, grande)
     */
    public void setTamañoPico(String tamañoPico) {
        this.tamañoPico = tamañoPico;
    }

    /**
     * Obtiene el nivel de actividad del perico en una escala de 1 a 10.
     * 
     * @return el nivel de actividad del perico
     */
    public int getNivelActividad() {
        return nivelActividad;
    }

    /**
     * Establece el nivel de actividad del perico.
     * 
     * @param nivelActividad el nuevo nivel de actividad del perico (escala de 1 a 10)
     */
    public void setNivelActividad(int nivelActividad) {
        this.nivelActividad = nivelActividad;
    }

    /**
     * Verifica si el perico es doméstico o salvaje.
     * 
     * @return true si el perico es doméstico, false si es salvaje
     */
    public boolean isEsDomestico() {
        return esDomestico;
    }

    /**
     * Establece si el perico es doméstico o salvaje.
     * 
     * @param esDomestico true si el perico es doméstico, false si es salvaje
     */
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    /**
     * Obtiene el temperamento o personalidad del perico.
     * 
     * @return el temperamento del perico (por ejemplo, juguetón, tranquilo)
     */
    public String getTemperamento() {
        return temperamento;
    }

    /**
     * Establece el temperamento o personalidad del perico.
     * 
     * @param temperamento el nuevo temperamento del perico (por ejemplo, juguetón, tranquilo)
     */
    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    // Métodos específicos de un perico
    
    /**
     * Simula que el perico está imitando palabras o sonidos.
     */
    public void imitarSonido( ) {
            System.out.println(" está imitando un sonido");

    }
    
    /**
     * Simula que el perico está explorando su entorno.
     */
    public void ponerseEnHombroPirata() {
        System.out.println("Aaahgrrr");
    }
    
    /**
     * Permite que el perico juegue, mostrando su nivel de actividad.
     */
    public void bailar() {
        System.out.println("Bailando... Nivel de actividad: " + nivelActividad);
    }

    /**
     * Simula que el perico está tomando un baño.
     */
    public void tomarBaño() {
        System.out.println("tomando un baño");
    }

     /**
     * Simula que el perico está durmiendo.
     */
    public void dormir() {
        System.out.println("ZZZzzzzZZzzzZZz");
    }
}