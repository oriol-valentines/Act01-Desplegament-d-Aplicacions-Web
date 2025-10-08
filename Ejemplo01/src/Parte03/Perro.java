package Parte03;

/**
 * Clase que representa un perro, hereda de {@link Animal}.
 * Contiene métodos específicos para perros.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Perro extends Animal {

    /**
     * Constructor por defecto.
     * Crea un perro con valores simples.
     */
    public Perro() {
        super();
    }

    /**
     * Constructor con parámetros.
     * 
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     */
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Hace que el perro ladre.
     */
    public void ladrar() {
        System.out.println(getNombre() + " esta ladrando!");
    }

    /**
     * Hace que el perro corra.
     */
    public void correr() {
        System.out.println(getNombre() + " esta corriendo felizmente.");
    }

    /**
     * Método principal para probar la clase.
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Perro p1 = new Perro("Firulais", 4);
        p1.despertar();      // Método heredado de Animal
        p1.ladrar();         // Método propio de Perro
        p1.correr();         // Método propio de Perro
        System.out.println(p1.descripcion()); // Método heredado
    }
}
