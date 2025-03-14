 public class Tv {
    private String marca;
    private String color;
    private String tecpantalla;
    private String resolucion;
    private int pulgadas;

    public Tv (String marca, String color,String tecpantalla, String resolucio, int pulgadas){
        setMarca(marca);
        setColor(color);
        setTecpantalla(tecpantalla);
        setResolucion(resolucion);
        setPulgadas(pulgadas);
    }
    // Getter 

    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getTecpantalla(){
        return tecpantalla;
    }
    public String getResolucion(){
        return resolucion;
    }
    public int getPulgadas(){
        return pulgadas;
    }


    
       //Setter
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setTecpantalla(String tecpantalla){
        this.tecpantalla = tecpantalla;
    }
    public void setResolucion(String resolucion){
        this.resolucion = resolucion;
    }
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }

    public String toString(){
        return "Marca: " + getMarca() + "\n\r Color: " + getColor() + "\n\r Tecpantalla: " + getTecpantalla() + "\n\r Resolucion: " + getResolucion() + "\n\r Pulgadas: " + getPulgadas();
    }
}