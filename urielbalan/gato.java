public class Gato {
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private String genero;
    private String estado;

    public Gato(String nombre, String raza, String color, int edad, String genero, String estado) {
        setNombre(nombre);
        setRaza(raza);
        setColor(color);
        setEdad(edad);
        setEstado(estado);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        this.genero = macho;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

    public void rasguñar() {
        System.out.println(nombre + " está rasguñando.");
    }

    public void morir() {
        this.estado = "muerto";
        System.out.println(nombre + " ha muerto.");
    }

    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    public void crecer() {
        this.edad++;
        System.out.println(nombre + " ha crecido y ahora tiene " + edad + " años.");
    }

    public void defecar() {
        System.out.println(nombre + " está defecando.");
    }

    public void pelear() {
        System.out.println(nombre + " está peleando.");
    }

    public void ver() {
        System.out.println(nombre + " está viendo.");
    }

    public void cazar() {
        System.out.println(nombre + " está cazando.");
    }

    public static void main(String[] args) {
    
        Gato gato = new Gato("Stiven", "siberiano", "gris", "4", "macho");
        gato.comer();
        gato.dormir()
        gato.maullar();
        gato.crecer();
        gato.cazar();
        gato.morir();
    }
}
