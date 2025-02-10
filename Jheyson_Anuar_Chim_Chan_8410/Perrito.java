class Perrito{
    private String nombre;
    private String color;
    private int  edad;
    private String tamaño;
    private String raza;
    private String estado;

    public void setnombre( String nombre){
        this.nombre = nombre; 
    }
    public String getnombre(){
        return nombre;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public String getcolor(){
        return color;
    }
    public void setedad( int edad){
        this.edad=edad;
    }
    public int getedad(){
        return edad;
    }
    public void settamaño( String tamaño){
        this.tamaño=tamaño;
    }
    public String gettamaño(){
        return tamaño;
    }
    public void setraza( String raza){
        this.raza=raza;
    }
    public String getraza(){
        return raza;
    }
    public void setestado(String estado){
        this.estado=estado;
    }
    public String getestado(){
        return estado;
    }
}

