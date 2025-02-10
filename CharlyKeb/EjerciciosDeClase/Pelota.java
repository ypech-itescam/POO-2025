package CharlyKeb.EjerciciosDeClase;

public class Pelota {
    // Atributos
    private String marca;
    private String color;
    private int numTamanio;

    public Pelota(String marca, String color, int numTamanio) {
        setMarca(marca);
        setColor(color);
        setNumTamanio(numTamanio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "Void" : marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.equals("") ? "Blanco" : color;
    }

    public int getNumTamanio() {
        return numTamanio;
    }

    public void setNumTamanio(int numTamanio) {
        this.numTamanio = numTamanio == 0 ? 1 : numTamanio;
    }

    public void rodar() {
        System.out.println("La pelota está rodando");

    }

    public void rebotar() {
        System.out.println("La pelota está rebotando");
    }

}
