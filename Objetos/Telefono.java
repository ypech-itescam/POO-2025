public class Telefono {
    private String marca;
    private String modelo;
    private String color;
    private int estado; //0->Apagado, 1->Encendido 3->Mantenimiento

    public Telefono(String marca, String modelo, String color, int estado){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;

    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca.equals("")? "Motorola": marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setForma(String forma){
        this.modelo = forma.equals("")?"Motorola G24": modelo;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color.equals("")? "Negro" : color;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = (estado <=3 && estado >=0 )? estado : 0;
    }

    public String toString(){
        return "Marca: " + getMarca() + "Modelo: " + getModelo() + "Color: " + getColor() + "Estado: " + getEstado();
    }


    

    
}
