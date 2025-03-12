public class Telefono {
    private String color;
    private String marca;
    private boolean estado; // true: encendido, false: apagado
    private int almacenamiento;
    private String modelo;

    public Telefono(String marca, String color, boolean estado, int almacen, String modelo) {
        setMarca(marca);
        setColor(color);
        setEstado(estado);
        setAlmacen(almacen);
        setModelo(modelo);
    }
    public Telefono(String marca, String color, boolean estado) {
        setMarca(marca);
        setColor(color);
        setEstado(estado);
        setModelo("No definido");
    }

    public void setColor(String color) {
        this.color = (color.equals("")) ? "Blanco" : color;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "Samsung" : marca;
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

    public void setAlmacen(int almacenamiento) {
        this.almacenamiento = (almacenamiento <= 0) ? 0 : almacenamiento;
    }

    public int getAlmacen() {
        return almacenamiento;
    }

    public void setModelo(String modelo) {
        this.modelo = (modelo.equals("")) ? "A32"  : modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString() {
        return "----------------------\n" +
           "Marca: " + marca + "\n" +
           "Color: " + color + "\n" +
           "Estado: " + (estado ? "Encendido" : "Apagado") + "\n" +
           "Almacenamiento: " + almacenamiento + "GB\n" +
           "Modelo: " + modelo + "\n";
    }
}



