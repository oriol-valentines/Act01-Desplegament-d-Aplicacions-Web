package Parte03;

/**
 * Clase sencilla que representa un animal.
 * Contiene atributos básicos y algunos métodos de ejemplo.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Animal {

    /** Nombre del animal */
    private String nombre;

    /** Edad del animal */
    private int edad;

    /** Indica si el animal está despierto o dormido */
    private boolean despierto;

    /**
     * Constructor por defecto.
     * Inicializa los valores con datos simples.
     */
    public Animal() {
        nombre = "Sin nombre";
        edad = 0;
        despierto = false;
    }

    /**
     * Constructor con parámetros.
     * 
     * @param nombre Nombre del animal
     * @param edad Edad del animal
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.despierto = false;
    }

    /**
     * Devuelve el nombre del animal.
     * 
     * @return Nombre actual
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del animal.
     * 
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad del animal.
     * 
     * @return Edad actual
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Cambia la edad del animal.
     * 
     * @param edad Nueva edad
     * @throws IllegalArgumentException si la edad es negativa
     */
    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    /**
     * Despierta al animal.
     */
    public void despertar() {
        despierto = true;
        System.out.println(nombre + " se ha despertado.");
    }

    /**
     * Devuelve una breve descripción del animal.
     * 
     * @return Texto con nombre y edad
     */
    public String descripcion() {
        return nombre + " tiene " + edad + " años.";
    }

    /**
     * Hace que el animal emita un sonido.
     * 
     * @param sonido Texto del sonido (por ejemplo "guau" o "miau")
     */
    public void hacerSonido(String sonido) {
        System.out.println(nombre + " hace: " + sonido);
    }

    /**
     * Método principal para probar la clase.
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Animal a1 = new Animal("Luna", 3);
        a1.despertar();
        a1.hacerSonido("grrr");
        System.out.println(a1.descripcion());
    }
}

