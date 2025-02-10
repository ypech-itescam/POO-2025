package DanaChin.Progrmas.HolaMundo;

import java.awt.*;
import javax.swing.*;

public class HolaMundo2D {
    private String texto;
    private Color color;
    private int size;

    // Constructor
    public HolaMundo2D(String texto, Color color, int size) {
        this.texto = texto;
        this.color = color;
        this.size = size;
    }

    // Método para obtener el texto
    public String getTexto() {
        return texto;
    }

    // Método para establecer el texto
    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Método para obtener el color
    public Color getColor() {
        return color;
    }

    // Método para establecer el color
    public void setColor(Color color) {
        this.color = color;
    }

    // Método para obtener el tamaño de letra
    public int getSize() {
        return size;
    }

    // Método para establecer el tamaño de letra
    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        // Crear una instancia de HolaMundo2D con atributos personalizados
        HolaMundo2D miHolaMundo = new HolaMundo2D("¡Hola, Mundo!", Color.BLUE, 14);

        // Configurar la consola para mostrar el texto en el color y tamaño
        // especificados
        System.out.println("\u001B[34m" + miHolaMundo.getTexto() + "\u001B[0m");

    }
}
