package ClasesObjetos;
import java.util.Vector;

public class Mochila {
    private String color;
    private String marca;
    private Vector<Camara>camaras;

    public Mochila(String color, String marca) {
        setMarca(marca);
        setColor(color);
        camaras = new Vector<>();
    }

    public Mochila(){
        setMarca("Chenson");
        setColor("Verde");
        camaras = new Vector<>();
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca.equals("")? "Desconocido":marca;
    }

    public void setColor(String color) {
        this.color = color.equals("")? "Negro":color;
    }

    public void agregarCamara(Camara camara) {
        camaras.add(camara);
    }

    public String toString() {
        String resultado = "Mochila " + getMarca() + " De color " + getColor() + " con " + camaras.size() + " cámara (s)";

        for (int i = 0; i < camaras.size(); i++) {
            resultado += "\n\r   " + (i + 1) + ". " + camaras.get(i) + "\n";
        }

        return resultado;
    }
}