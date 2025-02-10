public class Perro {
    private String nombre;
    private String color;
    private String raza;
    private double peso;
    private double altura;
    private boolean genero;
    private int edad;
    private boolean cola;
    private String colordeojos;

    public Perro() {
        setNombre("Mechudo");
        setColor("Blanco");
        setRaza("Raza");
        setPeso(12.5);
        setAltura(34.4);
        setGenero(false);
        setEdad(7);
        setCola(true);
        setColordeojos("Negros");
    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre.equals("")?nombre:"Mechudo";
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color.equals("")?color:"Blanco";
    }

    public String raza (){
        return raza;
    }

    public void setRaza (String raza){
        this.raza = raza.equals("")?raza:"French";
    }

    public double getPeso (){
        return peso;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }
    
    public double getAltura (){
        return altura;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public boolean getGenero () {
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

    public boolean getCola (){
        return cola;
    }

    public void setCola (boolean cola){
        this.cola = cola;
    }

    public String getColordeojos (){
        return colordeojos;
    }

    public void setColordeojos (String colordeojos){
        this.colordeojos = colordeojos.equals("")?colordeojos:"Negros";
    }

    public void Comer (String comida){
        System.out.println ("Estoy comiendo" + comida);
    }

    public void Corre(){
        System.out.println("Estoy corriendo");
    }

    public void Caminar(){
        System.out.println("Estoy caminando");
    }

    public void MostrarInfo (){
        
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Color: " + color);
        System.out.println ("Raza: " + raza);
        System.out.println ("Peso: " + peso + "Kg");
        System.out.println ("Altura: " + altura + "m");
        System.out.println ("Genero: " + genero );
        System.out.println ("Edad: " + edad + "años");
        System.out.println ("Cola: " + (cola ? "Si": "No") );
        System.out.println ("Colordeojos: " + colordeojos);
        
        
    }

    
        
    



}