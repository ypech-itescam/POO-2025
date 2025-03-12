public class Mochila {
   
    private String color;
    private String marca;
    private boolean estado;  // true: abierta, false: cerrada
    private int numeroDeBolsillos;
    private Laptop laptop; 
    private Telefono telefono; 

    
    public Mochila(String color, String marca, boolean estado, int numeroDeBolsillos) {
        setColor(color);
        setMarca(marca);
        setEstado(estado); 
        setNumeroDeBolsillos(numeroDeBolsillos);
        this.laptop = new Laptop("HP", "Victus", false, 8, 512, "Azul" );  
        this.telefono = new Telefono ("Motorola", "Azul", true, 8, "G22"); 
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
        return estado;
    }


    public void setNumeroDeBolsillos(int numeroDeBolsillos) {
        this.numeroDeBolsillos = (numeroDeBolsillos <= 0) ? 1 : numeroDeBolsillos;
    }

    public int getNumeroDeBolsillos() {
        return numeroDeBolsillos;
    }

    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
    public Telefono getTelefono() {
        return telefono;
    }
    public void setTelefono(Telefono telefono){
        this.telefono = telefono;
    }


    public String toString() {
        return "Color: " + color + "\n" +
               "Marca: " + marca + "\n" +
               "Estado: " + (estado ? "Abierta" : "Cerrada") + "\n" +
               "Numero de Bolsillos: " + numeroDeBolsillos + "\n\n" +
               "Dentro de la mochila hay:\n\n" + 
               "Laptop: " + laptop.toString() + "\n" +
               "Teléfono: " + telefono.toString() + "\n";
    
    }

}
   
   
