public class Mochila{

    private int peso;
    private String color;
    private String utilidad;
    private String material;
    private String contenido;

    public Mochila (int peso, String color, String utilidad, String material, String contenido){
        this.peso = peso;
        this.color = color;
        this.utilidad = utilidad;
        this.material = material;
        this.contenido = contenido;

    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso = (peso <=0 )? peso:0;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color.equals("")? "Azul": color;
    }

    public String getUtilidad(){
        return utilidad;
    }

    public void setUtilidad(String utilidad){
        this.utilidad = utilidad.equals("")? "Para la escuela": utilidad;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material.equals("")? "Esta hecha de algodon": material;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido.equals("")? "Esta vacio": contenido;
    }

    public String toString(){
        return "Pesa: " + getPeso() + "Color: " + getColor() + "Utilidad: " + getUtilidad() + "Material: " + getMaterial() +
        "Contenido: " + getContenido();
    }
}