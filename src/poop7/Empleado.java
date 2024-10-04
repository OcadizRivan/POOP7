/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que crea un empleado
 * @author Ivan Ocadiz
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado;
    private float sueldo;
    /**
     * Constructor vacio.
     */
    public Empleado(){
    }
    /**
     * Constructor lleno
     * @param nombre el nombre del empleado
     * @param numEmpleado su matricula de registro
     * @param sueldo el sueldo del empleado
     */
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de empleado o matrícula de registro.
     * 
     * @return El número de empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Establece el número de empleado o matrícula de registro.
     * 
     * @param numEmpleado El nuevo número de empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Obtiene el sueldo actual del empleado.
     * 
     * @return El sueldo del empleado.
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado.
     * 
     * @param sueldo El nuevo sueldo del empleado.
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Aumenta el sueldo del empleado en base a un porcentaje proporcionado.
     * 
     * @param porcentajeDeAumento El porcentaje de aumento sobre el sueldo actual.
     */
    public void aumentarSueldo(int porcentajeDeAumento) {
        sueldo += (sueldo * porcentajeDeAumento / 100);
    }
    
    /**
     * Metodo sobreescrito que convierte los atributos del empleado a una cadena
     * @return los atributos del empleado en una cadena
     */
    @Override   //Override significa que toString lo esta heredando
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}



//MENCIONAR HEREDACION DE OBJECT EN PRACTICA 
//Mencionar lo de SUPER