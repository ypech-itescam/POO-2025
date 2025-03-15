package ClasesPersonales;
public class Camionetas {
    
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private int kilometraje;
    private int numeroLlantas;
    private boolean estado;

    
    public Camionetas(String marca, String modelo, String color, int año,
     int kilometraje, int numeroLlantas, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.numeroLlantas = numeroLlantas;
        this.estado = estado;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAño() {
        return año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public boolean getEstado() {
        return estado;
    }

    
    @Override
    public String toString() {
        return "Camionetas[ Marca = " + marca + ", Modelo = " + modelo + ",  Color= " + color +", Año =" + año + ", Kilometraje = " + kilometraje +", NumeroLlantas = "+ numeroLlantas +"]";
    }

}