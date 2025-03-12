public class Mochila {
   
    private String color;
    private String marca;
    private boolean estado;  // true: abierta, false: cerrada
    private int numeroDeBolsillos;
    

    
    public Mochila(String color, String marca, boolean estado, int numeroDeBolsillos) {
        setColor(color);
        setMarca(marca);
        setEstado(estado); 
        setNumeroDeBolsillos(numeroDeBolsillos);
    }
    public Mochila(String marca, boolean estado, int numeroDeBolsillos) {
        setColor("No definido");
        setMarca(marca);
        setEstado(estado); 
        setNumeroDeBolsillos(numeroDeBolsillos);
    }
    public void setColor(String color) {
        this.color = (color.equals("")) ? "Blanco" : color;
    }

    public String getColor() {
        return color;
    }

    
    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "chenson" : marca;
    }

    public String getMarca() {
        return marca;
    }

  
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;  // true si esta abierta, false si esta cerrada
    }

    
    public void setNumeroDeBolsillos(int numeroDeBolsillos) {
        this.numeroDeBolsillos = (numeroDeBolsillos <= 1) ? 1 : numeroDeBolsillos;
    }

    public int getNumeroDeBolsillos() {
        return numeroDeBolsillos;
    }


    public String toString() {
        return "----------------------\n" +
           "       Mochila       \n" +
           "Color: " + color + "\n" +
           "Marca: " + marca + "\n" +
           "Estado: " + (estado ? "Abierta" : "Cerrada") + "\n" +
           "Numero de Bolsillos: " + numeroDeBolsillos + "\n";
    }

   
   
    
}