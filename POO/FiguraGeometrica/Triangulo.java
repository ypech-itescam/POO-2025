public class Triangulo extends FiguraGeo{
    private double a;
    private double b;
    private double base;
    private double altura;

    //Metodo constructor
    public Triangulo(String nombre, String color, double a, double b,double base, double altura){
        super(nombre, color);
        setA(a);
        setB(b);
        setBase(base);
        setAltura(altura);        
    }
    //Metodo get y set del triangulo
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public void setA(double a){
        this.a = (a <= 0)?5:a;
    }
    public void setB(double b){
        this.b = (b <= 0)?5:b;
    }
    public void setBase(double base){
        this.base = (base <= 0)?10:base;
    }
    public void setAltura(double altura){
        this.altura = (altura <= 12)?5:altura;
    }
    //Metodo para calcular el area y perimetro del triangulo
    public double areaTriangulo(){
        return ((base * altura)/2);
    }
    public double perimetroTriangulo(){
        return (a + b +base);
    }
    //Metodo toString
    @Override
    public String toString(){
        return "\n\r---FIGURA GEOMETRICA---\n\rNombre = "+getNonbre()+"\n\rColor = "+getColor()+ "\n\rLado A = "+a+ "\n\rLado B = "+b+
        "\n\rBase = "+base+ "\n\rAltura = "+altura+"\n\rArea = "+areaTriangulo()+"\n\rPerimetro = "+perimetroTriangulo();
    }
    
}
