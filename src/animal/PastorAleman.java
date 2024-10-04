/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que representa un Pastor Alemán, que hereda de Perro.
 * @author nadia
 */
public class PastorAleman extends Perro {
    // Atributos específicos del Pastor Alemán
    private String nivelDeEnergia; // Nivel de energía (ej. alto, medio, bajo)
    private boolean esProtector;   // Indica si es protector
    private String habilidadEspecial; // Habilidad especial (ej. búsqueda, guardia)
    private boolean leGustaCorrer; // Indica si le gusta correr
    private String comidaFavorita; // Comida favorita

    /**
     * Constructor vacío de PastorAleman.
     */
    public PastorAleman() {
        super();  // Llama al constructor vacío de Perro
    }

    /**
     * Constructor completo de PastorAleman.
     * 
     * @param nombre            Nombre del pastor alemán
     * @param edad              Edad del pastor alemán
     * @param peso              Peso del pastor alemán
     * @param habitat           Hábitat donde vive el pastor alemán
     * @param especie           Especie del pastor alemán
     * @param raza              Raza del pastor alemán 
     * @param esAdoptado        Indica si el pastor alemán ha sido adoptado
     * @param colorPelaje       Color del pelaje del pastor alemán
     * @param tieneCollar       Indica si el pastor alemán lleva collar
     * @param tamaño            Tamaño del pastor alemán
     * @param nivelDeEnergia    Nivel de energía
     * @param esProtector       Indica si es protector
     * @param habilidadEspecial Habilidad especial
     * @param leGustaCorrer     Indica si le gusta correr
     * @param comidaFavorita    Comida favorita
     */
    public PastorAleman(String nombre, int edad, float peso, String habitat, String especie, String raza, boolean esAdoptado, String colorPelaje, boolean tieneCollar, String tamaño, String nivelDeEnergia, boolean esProtector, String habilidadEspecial, boolean leGustaCorrer, String comidaFavorita) {
        super(nombre, edad, peso, habitat, especie, raza, esAdoptado, colorPelaje, tieneCollar, tamaño);
        this.nivelDeEnergia = nivelDeEnergia;
        this.esProtector = esProtector;
        this.habilidadEspecial = habilidadEspecial;
        this.leGustaCorrer = leGustaCorrer;
        this.comidaFavorita = comidaFavorita;
    }

/**
 * Obtiene el nivel de energía del Pastor Alemán.
 * 
 * @return El nivel de energía del Pastor Alemán (alto, medio, bajo).
 */
public String getNivelDeEnergia() {
    return nivelDeEnergia;
}

/**
 * Establece el nivel de energía del Pastor Alemán.
 * 
 * @param nivelDeEnergia El nuevo nivel de energía (alto, medio, bajo).
 */
public void setNivelDeEnergia(String nivelDeEnergia) {
    this.nivelDeEnergia = nivelDeEnergia;
}

/**
 * Verifica si el Pastor Alemán es protector.
 * 
 * @return true si el Pastor Alemán es protector, false en caso contrario.
 */
public boolean isEsProtector() {
    return esProtector;
}

/**
 * Establece si el Pastor Alemán es protector.
 * 
 * @param esProtector true si el Pastor Alemán debe ser protector, false si no.
 */
public void setEsProtector(boolean esProtector) {
    this.esProtector = esProtector;
}

/**
 * Obtiene la habilidad especial del Pastor Alemán.
 * 
 * @return La habilidad especial del Pastor Alemán (por ejemplo, búsqueda, guardia).
 */
public String getHabilidadEspecial() {
    return habilidadEspecial;
}

/**
 * Establece la habilidad especial del Pastor Alemán.
 * 
 * @param habilidadEspecial La nueva habilidad especial (búsqueda, guardia, etc.).
 */
public void setHabilidadEspecial(String habilidadEspecial) {
    this.habilidadEspecial = habilidadEspecial;
}

/**
 * Verifica si al Pastor Alemán le gusta correr.
 * 
 * @return true si al Pastor Alemán le gusta correr, false en caso contrario.
 */
public boolean isLeGustaCorrer() {
    return leGustaCorrer;
}

/**
 * Establece si al Pastor Alemán le gusta correr.
 * 
 * @param leGustaCorrer true si al Pastor Alemán le gusta correr, false si no.
 */
public void setLeGustaCorrer(boolean leGustaCorrer) {
    this.leGustaCorrer = leGustaCorrer;
}

/**
 * Obtiene la comida favorita del Pastor Alemán.
 * 
 * @return La comida favorita del Pastor Alemán.
 */
public String getComidaFavorita() {
    return comidaFavorita;
}

/**
 * Establece la comida favorita del Pastor Alemán.
 * 
 * @param comidaFavorita La nueva comida favorita del Pastor Alemán.
 */
public void setComidaFavorita(String comidaFavorita) {
    this.comidaFavorita = comidaFavorita;
}


    // Métodos propios de acción de PastorAleman

    /**
     * Método que simula el sonido del pastor alemán.
     */
    public void haceSonido() {
        System.out.println(getNombre() + " hace guaafff.");
    }

    /**
     * Método que simula el comportamiento protector del Pastor Alemán.
     */
    public void proteger() {
        if (esProtector) {
            System.out.println(getNombre() + " está protegiendo su hogar y su dueño.");
        } else {
            System.out.println(getNombre() + " es más amigable que protector.");
        }
    }

    /**
     * Método que muestra el nivel de energía del Pastor Alemán.
     */
    public void mostrarNivelDeEnergia() {
        System.out.println(getNombre() + " tiene un nivel de energía " + nivelDeEnergia + ".");
    }

    /**
     * Método que muestra la habilidad especial del Pastor Alemán.
     */
    public void mostrarHabilidadEspecial() {
        System.out.println(getNombre() + " tiene la habilidad especial de: " + habilidadEspecial + ".");
    }

    /**
     * Representación en cadena de los atributos del Pastor Alemán.
     */
    @Override
    public String toString() {
        return super.toString() + " PastorAleman{" +
                "nivelDeEnergia='" + nivelDeEnergia + '\'' +
                ", esProtector=" + esProtector +
                ", habilidadEspecial='" + habilidadEspecial + '\'' +
                ", leGustaCorrer=" + leGustaCorrer +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                '}';
    }
}
