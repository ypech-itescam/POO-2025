package julioivanekcaamal.NOTA;
/**
 * Color
 */
import java.util.Scanner;


public class Color {

    private String nombre;
    private String ansi;
    private Color color;

    public Color(String nombre, String ansi){
        setColor(nombre);
        setColorAnsi(ansi);
    }

    public String getColor(){
        return nombre;
    }
    public void setColor(String nombre){
        this.nombre = nombre.equals(" ")? "Blanco" : nombre;
    }
    public String getColorAnsi(){
        return ansi;
    }
    public void setColorAnsi(String ansi){
        this.ansi = ansi.equals(" ")? " ":ansi;
    }
    public void colores(){
       
    }
}



//color = nombre == ansi 
//Color 