public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private int estado; 

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.estado = 1; 
    }

    public String ladrar() {
        this.estado = 3; 
        return this.nombre + " dice: ¡Guau guau!";
    }

    public void comer() {
        this.estado = 4; 
        System.out.println(this.nombre + " está comiendo.");
    }

    public void jugar() {
        this.estado = 5; 
        System.out.println(this.nombre + " está jugando.");
    }

    public void crecer() {
        this.edad++;
        System.out.println(this.nombre + " ha crecido. Ahora tiene " + this.edad + " años.");
    }

    public void morir() {
        this.estado = 0; 
        System.out.println("Lamentablemente, " + this.nombre + " ha muerto.");
    }

    public void mover() {
        this.estado = 1; 
        System.out.println(this.nombre + " se está moviendo.");
    }

    public void moverCola() {
        this.estado = 1; 
        System.out.println(this.nombre + " está moviendo la cola.");
    }

    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Ace", "Labrador", 5);

        System.out.println(miPerro.ladrar());

        miPerro.comer();

        miPerro.jugar();

        miPerro.crecer();

        miPerro.mover();

        miPerro.moverCola();
    }
}
