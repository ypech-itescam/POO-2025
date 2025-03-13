public class Mouse {
    private String marca;
    private double precio;
    private String tipo;
    private String modelo;

    public Mouse(String marca, String modelo) {
        this.marca = marca.equals("") ? "HP" : marca;
        this.precio = precio <= 0 ? 100 : precio;
        this.tipo = "Gamer";
        this.modelo = modelo.equals("") ? "Xpz" : modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "Nike" : marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio <= 0 ? 100 : precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.equals("") ? "Gamer" : modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.equals("") ? "Xpz" : modelo;
    }

    public void mover() {
        System.out.println("El mouse se está moviendo.");
    }

    public void clic() {
        System.out.println("Click! El mouse ha hecho un clic.");
    }

    @Override
    public String toString() {
        return "Mochila [Marca=" + marca + ", Modelo=" + modelo + ", Precio =" + precio + 
               ", Tipo=" + tipo + "]";
    }
}

