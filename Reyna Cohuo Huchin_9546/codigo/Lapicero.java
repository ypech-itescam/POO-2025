public class Lapicero{

    private String marca;
    private String color;
    private String tamaño;
    private int funcion; // 1:escribir 2:dibujar

    public Lapicero(String marca, String color, String tamaño, int funcion){
        setMarca(marca);
        setColor(color);
        setTamaño(tamaño);
        setFuncion(funcion);
    }
     // Nuevo constructor con solo marca y color
     public Lapicero(String marca, String color) {
        this.marca = marca;
        this.color = color;
        this.tamaño = "Mediano"; // Valor por defecto
        this.funcion = 1; // Escribir por defecto
    }

    public String getMarca(){
         return marca;

    }
    public void setMarca(String marca){
        this.marca=marca;

    }
    public String getColor(){
        return color;

    }
    public void setColor(String color){
        this.color=color;

    }
    public String getTamaño(){
        return tamaño;

    }
    public void setTamaño(String tamaño){
        this.tamaño=tamaño;

    }
    public int getFuncion(){
        return funcion;

    }
    public void setFuncion(int funcion){
        this.funcion=funcion;
    }

    public String toString() {
        return "Lapicero: " + marca + "\r\n" + "color:" +
               color + "\r\n Tamaño: " + tamaño + "\r\n Función: " + 
               (funcion == 1 ? "Escribir" : "Dibujar") + "\r\n";

}
}