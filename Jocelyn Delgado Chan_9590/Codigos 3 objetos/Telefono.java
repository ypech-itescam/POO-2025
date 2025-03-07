public class Telefono {
    // modo acceso

    private String color;
    private String marca;
    private boolean estado;
    private int almacenamiento;
    private String modelo;

    public Telefono (String color, String marca, boolean estado, int almacenamiento, String modelo){
        this.color = color;
        this.marca = marca;
        this.estado = estado;
        this.almacenamiento = almacenamiento;
        this.modelo = modelo;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public int getAlmacenamiento(){
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo =(modelo.equals(""))?"no definido":modelo;
    }
    
}
