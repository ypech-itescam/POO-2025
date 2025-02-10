public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void imprimirInformacion() {
        System.out.println("El perro se llama: " + nombre);
        System.out.println("Tiene: " + edad + " años de edad");
        System.out.println("Es de raza: " + raza);
    }

    public void comer() {
        System.out.println("Está comiendo : mmm me gusta mucho comer croquetas");
    }

    public void brincar() {
        System.out.println("Está Saltando");
    }

    public void ladra() {
        System.out.println("Está ladrando : Guaf Guaf");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Coffe", 3, "Golden retriever");

        miPerro.imprimirInformacion();

        miPerro.comer();
        miPerro.brincar();
        miPerro.ladra();
    
    }
}
