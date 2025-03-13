public class Circulo extends FiguraGeo{
    private double radio;
    private final double pi = 3.14;

    //Creacion del metodo constructor
    public Circulo(String nombre, String color, double radio){
        super(nombre,color);
        setRadio(radio);
    }
    //Creacion del metodo set y get
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = (radio <= 0)?3:radio;
    }
    //Creacion del metodo para calcular el area del circulo y la circunferencia
    public double circunferenciaC(){
        return (2* pi * radio);
    }
    public double areaCirculo(){
        return(pi* Math.pow(radio, 2));
    }
    //Creacion del metodo toString
    public String toString(){
        return"\n\r---FIGURA GEOMETRICA---\n\rNombre = "+getNonbre()+"\n\rColor = "+getColor()+"\n\rRadio = "+radio+
        "\n\rCircunferencia = "+circunferenciaC()+"\n\rArea = "+areaCirculo();
    }
    
}
