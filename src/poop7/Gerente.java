/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Gerente, que es una especialización de la clase Empleado.
 * Un gerente tiene, además de los atributos de un empleado, un presupuesto asignado.
 * 
 * Atributos:
 * - presupuesto: El presupuesto que maneja el gerente.
 * 
 * Métodos:
 * - Getters y Setters para acceder y modificar el presupuesto.
 * - asignarPresupuesto(float presupuesto): Asigna un nuevo presupuesto al gerente.
 * - toString(): Retorna una representación en cadena de los atributos del gerente y del empleado.
 * 
 * Hereda de la clase Empleado los atributos:
 * - nombre: Nombre del gerente (empleado).
 * - numEmpleado: Número de empleado o matrícula del gerente.
 * - sueldo: Sueldo del gerente.
 * 
 * @author Ivan Ocadiz
 */
public class Gerente extends Empleado {

    private float presupuesto; // Presupuesto que maneja el gerente

    /**
     * Constructor vacío que crea un objeto Gerente sin inicializar sus atributos.
     */
    public Gerente() {
    }

    /**
     * Constructor que inicializa un objeto Gerente con el presupuesto y los atributos del empleado.
     * 
     * @param presupuesto El presupuesto que maneja el gerente.
     * @param nombre El nombre del gerente.
     * @param numEmpleado El número de empleado del gerente.
     * @param sueldo El sueldo del gerente.
     */
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo); // Llama al constructor de la clase padre (Empleado)
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene el presupuesto asignado al gerente.
     * 
     * @return El presupuesto del gerente.
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto para el gerente.
     * 
     * @param presupuesto El nuevo presupuesto asignado al gerente.
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Asigna un nuevo presupuesto al gerente y lo retorna.
     * 
     * @param presupuesto El presupuesto a asignar.
     * @return El presupuesto asignado.
     */
    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    /**
     * Retorna una representación en cadena de los atributos del gerente,
     * incluyendo los atributos heredados de la clase Empleado.
     * 
     * @return Una cadena que representa al objeto Gerente.
     */
    @Override
    public String toString() {
        return super.toString() + " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}