/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 * Clase que crea Animales de forma general
 * @author Ivan Ocadiz
 */
public class Animal {

    private String nombre; 
    private int edad;
    private float peso; 
    private String habitat; 
    private String especie; 

    /**
     * Constructor vacío.
     */
    public Animal() {
    }

    /**
     * Constructor lleno que inicializa un objeto Animal con los valores especificados.
     * 
     * @param nombre Nombre del animal
     * @param edad Edad del animal en años
     * @param peso Peso del animal en kilogramos
     * @param habitat Hábitat donde vive el animal
     * @param especie Especie del animal
     */
    public Animal(String nombre, int edad, float peso, String habitat, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
        this.especie = especie;
    }

    
    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del animal.
     * 
     * @return La edad del animal en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del animal.
     * 
     * @param edad La nueva edad del animal en años.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el peso del animal.
     * 
     * @return El peso del animal en kilogramos.
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Establece el peso del animal.
     * 
     * @param peso El nuevo peso del animal en kilogramos.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el hábitat donde vive el animal.
     * 
     * @return El hábitat del animal (ej. terrestre, acuático, aéreo).
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Establece el hábitat donde vive el animal.
     * 
     * @param habitat El nuevo hábitat del animal.
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * Obtiene la especie a la que pertenece el animal.
     * 
     * @return La especie del animal.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie a la que pertenece el animal.
     * 
     * @param especie La nueva especie del animal.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Simula que el animal está comiendo.
     */
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    /**
     * Simula que el animal está descansando en su hábitat.
     */
    public void descansar() {
        System.out.println(nombre + " está descansando en su hábitat: " + habitat);
    }

    /**
     * Incrementa la edad del animal y muestra un mensaje indicando que ha crecido.
     */
    public void crecer() {
        edad++;
        System.out.println(nombre + " ha crecido. Ahora tiene " + edad + " años.");
    }

    /**
     * Simula que el animal está jugando.
     */
    public void jugar() {
        System.out.println(nombre + " está jugando alegremente.");
    }

    /**
     * Simula el fallecimiento del animal.
     */
    public void morir() {
        System.out.println(nombre + " ha muerto.");
    }

    /**
     * Retorna una representación en cadena de los atributos del animal.
     * @return Una cadena que representa al objeto Animal.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", habitat=" + habitat + ", especie=" + especie + '}';
    }
}