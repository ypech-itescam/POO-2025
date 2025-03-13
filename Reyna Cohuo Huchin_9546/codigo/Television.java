public class Television{

    private String marca;
    private String color;
    private int estado; //1:Apagado 2:Prendido
    private int tamaño;
    private String modelo;
    private int funcion; //1:ver programas

    public Television (String marca, String color, int estado, int tamaño, String modelo,int funcion){
        setMarca(marca);
        setColor(color);
        setEstado(estado);
        setTamaño(tamaño);
        setModelo(modelo);
        setFuncion(funcion);
    }
    public Television(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.color = "Negro"; // Valor por defecto
        this.estado = 1; // Apagado por defecto
        this.modelo = "Básico"; // Modelo por defecto
        this.funcion = 1; // Ver programas por defecto
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
    public int getEstado(){
        return estado;

    }
    public void setEstado(int estado){
        this.estado=estado;

    }
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public String getModelo() {
        return modelo;

    }
    public void setModelo(String modelo) {
        this.modelo = modelo;

    }
    public int getFuncion() {
        return funcion;

    }
    public void setFuncion(int funcion) {
        this.funcion = funcion;


}

public String toString() {
    return "Televisión: " + marca + "\r\n " +"Color:" + color + "\r\n " + (estado == 1 ? "Apagado" : "Prendido") + "\r\n " +"Tamaño:" + tamaño + " pulgadas, " +"Modelo:"+ modelo + 
           "\r\n Función: Ver programas" + "\r\n";
}
}