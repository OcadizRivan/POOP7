/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que representa un Dálmata, que hereda de Perro.
 * 
 * @author nadia
 */
public class Dalmata extends Perro {
    // Atributos específicos del Dálmata
    private String tipoDeManchas;    // Tipo de manchas (negro, marrón)
    private boolean esEntrenado;     // Indica si el dálmata ya ha sido entrenado
    private String estiloDeVida;     // Estilo de vida (activo, relajado)
    private boolean leGustaNadar;    // Indica si le gusta nadar
    private String jugueteFavorito;  // Juguete favorito

    /**
     * Constructor vacío de Dalmata.
     */
    public Dalmata() {
        super();  // Llama al constructor vacío de Perro
    }

    /**
     * Constructor completo de Dalmata.
     * 
     * @param nombre           Nombre del dálmata
     * @param edad             Edad del dálmata
     * @param peso             Peso del dálmata
     * @param habitat          Hábitat donde vive el dálmata
     * @param especie          Especie del dálmata
     * @param raza             Raza del dálmata
     * @param esAdoptado       Indica si el dálmata ha sido adoptado
     * @param colorPelaje      Color del pelaje del dálmata
     * @param tieneCollar      Indica si el dálmata lleva collar
     * @param tamaño           Tamaño del dálmata
     * @param tipoDeManchas    Tipo de manchas
     * @param esEntrenado      Indica si ha sido entrenado
     * @param estiloDeVida     Estilo de vida
     * @param leGustaNadar     Indica si le gusta nadar
     * @param jugueteFavorito  Juguete favorito
     */
    public Dalmata(String nombre, int edad, float peso, String habitat, String especie, String raza, boolean esAdoptado, String colorPelaje, boolean tieneCollar, String tamaño, String tipoDeManchas, boolean esEntrenado, String estiloDeVida, boolean leGustaNadar, String jugueteFavorito) {
        super(nombre, edad, peso, habitat, especie, raza, esAdoptado, colorPelaje, tieneCollar, tamaño);
        this.tipoDeManchas = tipoDeManchas;
        this.esEntrenado = esEntrenado;
        this.estiloDeVida = estiloDeVida;
        this.leGustaNadar = leGustaNadar;
        this.jugueteFavorito = jugueteFavorito;
    }

    // Getters y Setters

    public String getTipoDeManchas() {
        return tipoDeManchas;
    }

    public void setTipoDeManchas(String tipoDeManchas) {
        this.tipoDeManchas = tipoDeManchas;
    }

    public boolean isEsEntrenado() {
        return esEntrenado;
    }

    public void setEsEntrenado(boolean esEntrenado) {
        this.esEntrenado = esEntrenado;
    }

    public String getEstiloDeVida() {
        return estiloDeVida;
    }

    public void setEstiloDeVida(String estiloDeVida) {
        this.estiloDeVida = estiloDeVida;
    }

    public boolean isLeGustaNadar() {
        return leGustaNadar;
    }

    public void setLeGustaNadar(boolean leGustaNadar) {
        this.leGustaNadar = leGustaNadar;
    }

    public String getJugueteFavorito() {
        return jugueteFavorito;
    }

    public void setJugueteFavorito(String jugueteFavorito) {
        this.jugueteFavorito = jugueteFavorito;
    }

    // Métodos propios de acción de Dalmata

    /**
     * Método que simula el sonido del dálmata.
     */
    public void haceSonido() {
        System.out.println(getNombre() + " hace grrr.");
    }

    /**
     * Método específico para que el dálmata juegue con su juguete favorito.
     */
    public void jugarConJuguete() {
        System.out.println(getNombre() + " está jugando con su " + jugueteFavorito + ".");
    }

    /**
     * Método específico para nadar. No hereda de la clase Perro.
     */
    public void nadar() {
        if (leGustaNadar) {
            System.out.println(getNombre() + " está nadando alegremente.");
        } else {
            System.out.println(getNombre() + " no le gusta nadar.");
        }
    }

    /**
     * Método que muestra el estilo de vida del dálmata.
     */
    public void mostrarEstiloDeVida() {
        System.out.println(getNombre() + " tiene un estilo de vida " + estiloDeVida + ".");
    }

    /**
     * Método que muestra el tipo de manchas del dálmata.
     */
    public void mostrarTipoDeManchas() {
        System.out.println(getNombre() + " tiene manchas de tipo: " + tipoDeManchas + ".");
    }

    /**
     * Representación en cadena de los atributos del Dálmata.
     */
    @Override
    public String toString() {
        return super.toString() + " Dalmata{" +
                "tipoDeManchas='" + tipoDeManchas + '\'' +
                ", esEntrenado=" + esEntrenado +
                ", estiloDeVida='" + estiloDeVida + '\'' +
                ", leGustaNadar=" + leGustaNadar +
                ", jugueteFavorito='" + jugueteFavorito + '\'' +
                '}';
    }
}
