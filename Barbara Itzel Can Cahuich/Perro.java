public class Perro {

    public static void main(String[] args) {
        Perro elPerro = new Perro("Jack", "Bulldog", 5, "Hembra");
        elPerro.comer();
        elPerro.ladrar();
        elPerro.correr();
        elPerro.dormir();
        elPerro.llorar();
    }

    private String nombre;
    private String raza;
    private int edad;
    private String genero;

    public Perro(String nombre, String raza, int edad, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void llorar() {
        System.out.println(nombre + " está llorando");
    }
}