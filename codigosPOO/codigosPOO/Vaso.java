public class Vaso {
    private String material;
    private String color;
    private int contenido;

    public Vaso(String material, int contenido, String color) {
        this.material = material;
        this.color = color;
        this.contenido = contenido;
    }

    public void estado() {
        if (contenido == 0) {
            System.out.println("El vaso esta vacio");
        } 
        else {
            System.out.println("El vaso esta lleno");
        }
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Vaso vasoPlastico = new Vaso("Plastico", 1, "Verde");

        vasoPlastico.estado();
        System.out.println("Material del vaso de plastico: " + vasoPlastico.getMaterial());
        System.out.println("Color del vaso de plástico: " + vasoPlastico.getColor());

        Vaso vasoCristal = new Vaso("Cristal", 1, "Transparente");

        vasoCristal.estado();
        System.out.println("Material del vaso de cristal: " + vasoCristal.getMaterial());
        System.out.println("Color del vaso de cristal: " + vasoCristal.getColor());
    }
}
