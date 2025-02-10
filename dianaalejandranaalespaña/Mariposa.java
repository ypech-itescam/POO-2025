public class Mariposa {
    private String nombre;
    private String color;
    private int estado;

    public Mariposa(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void volar() {
        if (estado > 0) {
            System.out.println("La mariposa " + nombre + " está volando.");
        } else {
            System.out.println("La mariposa " + nombre + " no puede volar en este momento.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void comer(String comida) {
        System.out.println("La mariposa " + nombre + " está comiendo " + comida + ".");
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public static void main(String[] args) {
        Mariposa mariposaMonarca = new Mariposa("Monarca", "naranja y negro");
        mariposaMonarca.setEstado(1); //estado 1 significa que puede volar
        
        // Imprimir información de la mariposa
        System.out.println("Nombre: " + mariposaMonarca.getNombre());
        System.out.println("Color: " + mariposaMonarca.getColor());
        
        // Ejecutar acciones de la mariposa
        mariposaMonarca.volar();
        mariposaMonarca.comer("néctar");
    }
}
