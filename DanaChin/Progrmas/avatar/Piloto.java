package DanaChin.Progrmas.avatar;

public class Piloto {
    private String nombre;
    private int edad;
    private double altura; // 1.63m
    private String genero;

    // Constructor
    public Piloto(String nombre, int edad, double altura, String genero) {
        setNombre(nombre);
        setEdad(edad);
        setAltura(edad);
        setGenero(genero);
    }

    // Métodos getter y setter para el nombre y la edad
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
