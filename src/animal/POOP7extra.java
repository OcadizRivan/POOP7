/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 * Ejemplifica la herencia entre Animal, Perro, Ave, Dalmata, PastorAleman, Perico y Paloma.
 * @author Ivan Ocadiz
 */
public class POOP7extra {

    public static void main(String[] args) {
        
        System.out.println("Ejemplo de herencia con las clases Perro, Dalmata y PastorAleman\n\n");

        // Ejemplo de la clase Animal
        Animal animalGenerico = new Animal("Tigre", 5, 200.5f, "Selva", "Felino");
        System.out.println(animalGenerico);
        animalGenerico.comer();
        animalGenerico.jugar();

        System.out.println("\n");

        // Ejemplo de la clase Perro
        Perro perroGenerico = new Perro("Bobby", 4, 18.0f, "Casa", "Canis lupus familiaris", "Labrador", true, "Dorado", true, "Grande");
        System.out.println(perroGenerico);
        perroGenerico.ladrar();
        perroGenerico.jugarConDueño();

        System.out.println("\n");

        // Ejemplo de la clase Dalmata
        Dalmata dalmata = new Dalmata("Scooby", 3, 25.0f, "Casa", "Canis lupus familiaris", "Dálmata", false, "Blanco con negro", true, "Mediano", "Negro", true, "Activo", true, "Pelota");
        System.out.println(dalmata);
        dalmata.mostrarTipoDeManchas();
        dalmata.jugarConJuguete();
        dalmata.nadar();

        System.out.println("\n");

        // Ejemplo de la clase PastorAleman
        PastorAleman pastor = new PastorAleman("Rex", 5, 30.0f, "Casa", "Canis lupus familiaris", "Pastor Alemán", true, "Negro y marrón", true, "Grande", "Alto", true, "Protección", true, "Hueso");
        System.out.println(pastor);
        pastor.mostrarNivelDeEnergia();
        pastor.proteger();
        pastor.mostrarHabilidadEspecial();
        pastor.haceSonido();
        
        System.out.println("\n\n");
        System.out.println("Ejemplo de herencia con las clases Ave, Paloma y Perico\n\n");

        // Creación de un objeto de la clase Animal
        Animal animal = new Animal("Tigre", 5, 220.5f, "Selva", "Felino");
        System.out.println("Animal: " + animal);
        animal.comer();
        animal.descansar();
        
        // Creación de un objeto de la clase Ave (hereda de Animal)
        Ave ave = new Ave("Águila Real", 3, 6.0f, "Montañas", "Aves de presa", "Plumaje dorado", true, 2.5f, "Pico curvado", true);
        System.out.println("\nAve: " + ave);
        ave.volar();
        ave.cantar();
        ave.migrar();
        
        // Creación de un objeto de la clase Paloma (hereda de Ave)
        Paloma paloma = new Paloma("Semillas", "No", "Hembra", 80.0f, "Doméstica", "Paloma Mensajera", 2, 0.35f, "Ciudad", "Columbidae", "Gris", true, 0.7f, "Pico corto", false);
        System.out.println("\nPaloma: " + paloma);
        paloma.volar();
        paloma.buscarComida();
        paloma.asearse();
        paloma.orientarse();
        paloma.cuidarCrias();
        paloma.defenderTerritorio();

        // Crear un objeto de tipo Perico
        Perico perico = new Perico("Verde", true, "Mediano", 9, true, "Juguetón", "Periquito", 1, 0.1f, "Selva", "Melopsittacus undulatus", "Verde brillante", true, 0.25f, "Curvo", false);
        System.out.println("\nPerico: " + perico);
        System.out.println(perico.toString());
        perico.imitarSonido();
        perico.bailar();
        perico.dormir();
        
    }
}