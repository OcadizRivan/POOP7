/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author Ivan Ocadiz
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("AimeP3",342674,20000f);
        
        Empleado empleado2 = new Empleado("Dado", 58241, 30000f);
        
        System.out.println(empleado1);
        
        empleado1.aumentarSueldo(10);
        
        System.out.println("");
        System.out.println(empleado1);
        System.out.println("");
        System.out.println("");
        
        
        Gerente gerente1 = new Gerente(1000f,"Oscar",321,20000f);
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        
        gerente2.setPresupuesto(34500f);
        System.out.println(gerente2);
        
        gerente2.setNombre("Chad");
        System.out.println(gerente2);
        
        System.out.println(gerente2.getNombre());
        System.out.println("###################################");
        System.out.println("");
        System.out.println("");
        
        
    }
}