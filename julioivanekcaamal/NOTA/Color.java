package julioivanekcaamal.NOTA;
/**
 * Color
 */
public class Color {

    private String nombre;
    private String ansi;
    

    public Color(String nombre){
        setColor(nombre);
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

    }
    
}



//color = nombre == ansi 
//Color 