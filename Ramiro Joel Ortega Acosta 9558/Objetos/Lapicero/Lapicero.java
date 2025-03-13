public class Lapicero {

    // Atributos privados
    private String marca;
    private String color;
    private int nivel_tinta;
    private String material;

    // Constructor vacío
    public Lapicero() {
    }

    // Constructor con parámetros
    public Lapicero(String marca, String color, int nivel_tinta, String material) {
        this.marca = marca;
        this.color = color;
        this.nivel_tinta = nivel_tinta;
        this.material = material;
    }

    // Getter y Setter de marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter y Setter de color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter y Setter de nivel_tinta
    public int getNivel_tinta() {
        return nivel_tinta;
    }

    public void setNivel_tinta(int nivel_tinta) {
        this.nivel_tinta = nivel_tinta;
    }

    // Getter y Setter de material
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Método para mostrar información del lapicero
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Nivel de tinta: " + nivel_tinta);
        System.out.println("Material: " + material);
    }

    // Método para usar el lapicero (reduce nivel de tinta)
    public void usarLapicero(int consumo) {
        if (nivel_tinta > 0) {
            nivel_tinta -= consumo;
            if (nivel_tinta < 0) {
                nivel_tinta = 0;
            }
            System.out.println("Usaste el lapicero, nivel de tinta restante: " + nivel_tinta);
        } else {
            System.out.println("¡El lapicero ya no tiene tinta!");
        }
    }
}