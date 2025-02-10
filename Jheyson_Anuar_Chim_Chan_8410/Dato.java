class Dato{
    private String fecha;
    private String nombre; 
    private String contenido;
    private String tipo;
    private String finaliza;

    public void setFecha( String fecha){
        this.fecha=fecha;
    }
    public String getFecha(){
        return fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public String getContenido(){
        return contenido;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setFinaliza(String finaliza){
        this.finaliza = finaliza;
    }
    public String getFinaliza(){
        return finaliza;
    }


}