public class Cuadrado extends FiguraGeo{
    private double lado;

    //Creacion del metodo constructor
    public Cuadrado(String nombre,String color, double lado){
        super(nombre, color);
        setLado(lado);
    }
    //Metodo set y get
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = (lado <= 0)?10:lado;
    }
    //Metodo para calcular el area y perimetro del cuadrado
    public double areaCuadrado(){
        return (lado * lado);
    }
    public double perimetroCuadrado(){
        return(lado + lado + lado + lado);
    }
    //Metodo toString
    @Override
    public String toString(){
        return "\n\r---FIGURA GEOMETRICA---\n\rNombre = "+getNonbre()+"\n\rColor = "+getColor()+ "\n\rLado = "+lado+"\n\rArea = "+areaCuadrado()+"\n\rPerimetro = "+perimetroCuadrado();
    }


}
