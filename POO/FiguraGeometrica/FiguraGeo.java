public class FiguraGeo{
    private String nombre;//Atributos de la clase padre
    private String color;

    //Metodo constructor
    public FiguraGeo(String nombre, String color){
        setNombre(nombre);
        setColor(color);
      
    }
    //Metodos set y get
    public String getNonbre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Nombre no definido":nombre;
    }
    public void setColor(String color){
        this.color = color.equals("")?"Color no definido":color;
    }
    //Metodo para calcular el area
    public double calcularArea(){
        return 0;
    }
    //Metodo calcular el perimetro
    public double calcularPerimetro(){
        return 0;
    }
   

}