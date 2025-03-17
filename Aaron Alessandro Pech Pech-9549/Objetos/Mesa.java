public class Mesa {
    private String color;
    private String material;
    private String forma;
    private String textura;

    public Mesa(String color, String material, String forma, String textura){
        this.color = color;
        this.material = material;
        this.forma = forma;
        this.textura = textura;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color.equals("")? "Cafe": color;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material.equals("")? "No definido": material; 
    }

    public String getforma(){
        return forma;
    }

    public void setForma(String forma){
        this.forma = forma.equals("")? "Redonda": forma;
    }

    public String getTextura(){
        return textura;
    }

    public void setTextura(String textura){
        this.textura = textura.equals("")? "Fina": textura;
    }

    public String toString(){
        return "Color: " + getColor() + "Meterial: " + getMaterial() + "Forma: " + getforma() + "Textura: " + getTextura();
    }
}
