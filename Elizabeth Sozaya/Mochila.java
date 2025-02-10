public class Mochila {
    private String color;
    private String marca;
    private int altura;
    private int numerodecierres;

    public Mochila () {
        setColor ("Verde Olivo");
        setMarca ("Golden Star");
        setAltura (50);
        setNumerodecierres (4);
    }

    public String getColor(){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }

    public String getMarca (){
        return marca;
    }

    public void setMarca (String marca){
        this.marca = marca.equals("")?marca:"Golden Star";
    }

    public int getAltura (){
        return altura;
    }

    public void setAltura (int altura){
        this.altura = altura;
    }

    public int getNumerodecierres(){
        return numerodecierres;
    }

    public void setNumerodecierres(int numerodecierres){
        this.numerodecierres = numerodecierres;
    }

    public void MostrarInfo () {

        System.out.println ("Color");
        System.out.println ("Marca");
        System.out.println ("Altura");
        System.out.println ("Numerodecierres");
    }
}