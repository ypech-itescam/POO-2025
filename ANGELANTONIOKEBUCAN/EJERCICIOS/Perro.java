public class Perro {
    // Atributos
    private String nombre;
    private int edad;
    private double peso;
    private int estado;

    // Constructor
    public Perro(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estado = 1; // Por defecto, el estado es 1 (vivo)
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Otros métodos
    public void ladrar() {
        System.out.println("¡Guau!");
    }

    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    public void correr() {
        System.out.println(nombre + " está corriendo");
    }

    public String jugar(String juguete) {
        // Implementación del método jugar
        return nombre + " está jugando con " + juguete;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }

    public void crecer() {
        edad++;
        System.out.println(nombre + " ha crecido, ahora tiene " + edad + " años");
    }

    public void llorar() {
        System.out.println(nombre + " está llorando");
    }

    public void morir() {
        if (estado == 1) {
            estado = 0;
            System.out.println(nombre + " ha muerto");
        } else {
            System.out.println(nombre + " ya está muerto");
        }
    }

    public void escuchar(String sonido) {
        System.out.println(nombre + " escucha " + sonido);
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola");
    }

    public void changeEstado(int estado) {
        this.estado = estado;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido", 2, 5.5);
        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Peso: " + miPerro.getPeso());

        miPerro.ladrar();
        miPerro.comer("croquetas");
        miPerro.correr();
        miPerro.dormir();
        miPerro.crecer();
        miPerro.llorar();
        miPerro.morir();
        miPerro.escuchar("música");
        miPerro.moverCola();
    }
}
