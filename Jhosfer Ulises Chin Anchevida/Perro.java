public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private String genero;
    private double altura;
    private int edad;
    private double peso;
    private boolean estado;
    private boolean enCasita;

    public Perro(String nombre, String raza, String color, String genero, double altura, int edad, double peso, boolean estado) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.genero = genero;
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
        this.estado = estado;
        this.enCasita = false;
    }

    public void dormirEnCasita() {
        if (!estado) {
            System.out.println(nombre + " no puede dormir en su casita porque no está despierto.");
            return;
        }
        enCasita = true;
        System.out.println(nombre + " está durmiendo en su casita.");
    }

    public static void main(String[] args) {
        Perro luna = new Perro("Luna", "husky", "blanco con café", "hembra", 1.3, 5, 14, false);
        luna.dormirEnCasita();
    }
}

