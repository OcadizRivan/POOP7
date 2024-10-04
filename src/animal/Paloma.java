/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que representa una paloma que hereda de Ave.
 * @author maiap
 *
 */
public class Paloma extends Ave {
    
    private String alimentacion; 
    private String mensajera; 
    private String sexo; 
    private float velocidadDeVuelo; 
    private String esDomestica;

    /**
     * Constructor vacío de la clase Paloma.
     */
    public Paloma() {
        super();
    }

    /**
     * Constructor que inicializa una Paloma con valores específicos.
     * 
     * @param alimentacion tipo de alimento que consume
     * @param mensajera si es o no mensajera
     * @param sexo hembra o macho
     * @param velocidadDeVuelo velocidad maxima de vuelo
     * @param esDomestica si es una paloma doméstica o salvaje
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
    public Paloma(String alimentacion, String mensajera, String sexo, float velocidadDeVuelo, String esDomestica, String nombre, int edad, float peso, String habitat, String especie, String tipoPlumaje, boolean puedeVolar, float envergaduraAlas, String tipoPico, boolean esMigratoria) {
        super(nombre, edad, peso, habitat, especie, tipoPlumaje, puedeVolar, envergaduraAlas, tipoPico, esMigratoria);
        this.alimentacion = alimentacion;
        this.mensajera = mensajera;
        this.sexo = sexo;
        this.velocidadDeVuelo = velocidadDeVuelo;
        this.esDomestica = esDomestica;
    }
// Getters y Setters

/**
 * Obtiene el tipo de alimentación de la paloma.
 * 
 * @return tipo de alimento que consume la paloma
 */
public String getAlimentacion() {
    return alimentacion;
}

/**
 * Establece el tipo de alimentación de la paloma.
 * 
 * @param alimentacion tipo de alimento que consume la paloma
 */
public void setAlimentacion(String alimentacion) {
    this.alimentacion = alimentacion;
}

/**
 * Obtiene si la paloma es mensajera o no.
 * 
 * @return "Sí" o "No" indicando si la paloma es mensajera
 */
public String getMensajera() {
    return mensajera;
}

/**
 * Establece si la paloma es mensajera.
 * 
 * @param mensajera "Sí" o "No" para indicar si la paloma es mensajera
 */
public void setMensajera(String mensajera) {
    this.mensajera = mensajera;
}

/**
 * Obtiene el sexo de la paloma.
 * 
 * @return "Hembra" o "Macho" indicando el sexo de la paloma
 */
public String getSexo() {
    return sexo;
}

/**
 * Establece el sexo de la paloma.
 * 
 * @param sexo "Hembra" o "Macho" para indicar el sexo de la paloma
 */
public void setSexo(String sexo) {
    this.sexo = sexo;
}

/**
 * Obtiene la velocidad máxima de vuelo de la paloma.
 * 
 * @return velocidad máxima de vuelo en km/h
 */
public float getVelocidadDeVuelo() {
    return velocidadDeVuelo;
}

/**
 * Establece la velocidad máxima de vuelo de la paloma.
 * 
 * @param velocidadDeVuelo velocidad máxima de vuelo en km/h
 */
public void setVelocidadDeVuelo(float velocidadDeVuelo) {
    this.velocidadDeVuelo = velocidadDeVuelo;
}

/**
 * Obtiene si la paloma es doméstica o salvaje.
 * 
 * @return "Doméstica" o "Salvaje" indicando el estado de domesticación de la paloma
 */
public String getEsDomestica() {
    return esDomestica;
}

/**
 * Establece si la paloma es doméstica o salvaje.
 * 
 * @param esDomestica "Doméstica" o "Salvaje" para indicar el estado de domesticación de la paloma
 */
public void setEsDomestica(String esDomestica) {
    this.esDomestica = esDomestica;
}
    
    /**
     * Simula que la paloma está buscando comida.
     */
    public void buscarComida() {
        System.out.println(getNombre() + " está buscando comida.");
    }

    /**
     * Simula que la paloma se está aseando las plumas.
     */
    public void asearse() {
        System.out.println(getNombre() + " está limpiándose las plumas.");
    }
    
    /**
     * Simula el proceso de orientación para encontrar el camino a casa.
     */
    public void orientarse() {
        System.out.println(getNombre() + " se está orientando para encontrar su camino a casa.");
    }
    
    /**
     * Permite que la paloma cuide a sus crías (alimentar, proteger).
     */
    public void cuidarCrias() {
        System.out.println(getNombre() + " está cuidando a sus crías.");
    }

    /**
     * Simula el proceso de defender el territorio de la paloma.
     */
    public void defenderTerritorio() {
        System.out.println(getNombre() + " está defendiendo su territorio de otras aves.");
    }
    
}