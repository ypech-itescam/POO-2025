public class Gato {
    private String nombre;
    private String color;
    private String colordeojos;
    private String raza;
    private boolean genero;
    private int edad;
    private int peso;
    private int altura;
    
    public Gato () {
        setNombre ("Teresa");
        setColor("Gris");
        setColordeojos("Cafes");
        setRaza("Europea");
        setGenero(true);
        setEdad(8);
        setPeso(4000);
        setAltura(23);
    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre.equals("")?nombre:"Teresa";
    }

    public String getColor (){
        return color;
    }

    public void setColor (String color){
        this.color = color.equals ("")?color:"Gris";
    }

    public String getColordeojos (){
        return colordeojos;
    }

    public void setColordeojos (String color){
        this.colordeojos =  colordeojos.equals("")?colordeojos:"Cafes";
    }

    public String getRaza (){
        return raza;
    }

    public void setRaza (String raza){
        this.raza = raza.equals("")?raza:"Europea";
    }

    public boolean getGenero (){
        return genero;
    }

    public void setGenero (boolean genero){
        this.genero = genero;
    }

    public int getEdad (){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getPeso (){
        return peso;
    }

    public void setPeso (int peso){
        this.peso = peso;
    }

    public int getaltura (){
        return altura;
    }

    public void setAltura (int altura){
        this.altura = altura;
    }

    public void Comer (String comer){
        System.out.println ("Estoy comiendo");
    }

    public void Corre(){
        System.out.println("Estoy corriendo");
    }

    public void Caminar(){
        System.out.println("Estoy caminando");
    }

    public void MostrarInfo (){
        
        System.out.println ("Nombre");
        System.out.println ("Color");
        System.out.println ("Colordeojos");
        System.out.println ("Raza");
        System.out.println ("Genero");
        System.out.println ("Edad");
        System.out.println ("Peso");
        System.out.println ("Altura");
        
        
    }



}