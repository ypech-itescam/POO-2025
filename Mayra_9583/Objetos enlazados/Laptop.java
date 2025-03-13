public class Laptop {
    private String marca;
    private String modelo;
    private boolean estado; // true: encendido, false: apagado
    private int ram; 
    private int almacenamiento; 
    private String color;

    
    public Laptop(String marca, String modelo, boolean estado, int ram, int almacenamiento, String color) {
        setMarca(marca);
        setModelo(modelo);
        setEstado(estado);
        setRam(ram);
        setAlmacenamiento(almacenamiento);
        setColor(color);
    }
    public Laptop(String marca, String modelo, boolean estado, int ram) {
        setMarca(marca);
        setModelo(modelo);
        setEstado(estado);
        setRam(ram); 
        setColor("No definido");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "HP" : marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = (modelo.equals("")) ? "Victus" : modelo;
    }

    public boolean getEstado() {  
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = (ram <= 0) ? 0 : ram; 
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = (almacenamiento <= 0) ? 0 : almacenamiento; 
    }
    public void setColor(String color) {
        this.color = (color.equals("")) ? "Blanco" : color;
    }

    public String getColor() {
        return color;
    }

  
    public String toString() {
        return "----------------------\n" +
        "Marca: " + marca + "\n" +
        "Modelo: " + modelo + "\n" +
        "Estado: " + (estado ? "Encendida" : "Apagada") + "\n" +
        "RAM: " + ram + "GB\n" +
        "Almacenamiento: " + almacenamiento + "GB\n" +
        "Color: " + color + "\n";
    }

}
