public class Lapiz {
    private String color;
    private String marca;
    private String material;
    private String punta;

    // Constructor
    public Lapiz(String color, String marca, String material, String punta) {
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.punta = punta;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPunta() {
        return punta;
    }

    public void setPunta(String punta) {
        this.punta = punta;
    }

    public void mostrarInformacion() {
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Material: " + material);
        System.out.println("Punta: " + punta);
    }

    public static void main(String[] args) {
        Lapiz miLapiz = new Lapiz("Naranja", "Azor", "Madera", "Grafito");
        miLapiz.mostrarInformacion();
    }
}
