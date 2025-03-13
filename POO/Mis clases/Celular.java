public class Celular{
    //Creamos los atributos con el modificador de acceso 
    private String marca;
    private String modelo;
    private String color;
    private int cant_camara;
    private int pixeles;
    private int almcenamiento;
    private boolean estado;

    //Creamos el metodo constructor de nuestra clase
    public Celular(String marca, String modelo, boolean estado){
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }
    //Creamos el metodo get del color del celular
    public String getColor(){
        return color;
    }
    //Creamos el metodo set del color de celular para los parametros
    public void setColor(String color){
        if (color.equals("")) {
            this.color = "blanco";
        }else{
            this.color = color;
        }
    }
    //Creamos el metodo de get de la cantidad de camaras
    public int getCant_camara(){
        return cant_camara;
    }
    //Creamos el metodo set de la cantidad de camaras
    public void setCant_camara(int cant_camara){
        if(cant_camara == 0){//Validamos el numero de serie en dado caso que el usuario no mande ningun numero de parametro
        this.cant_camara = 4;
        }else{
            this.cant_camara = cant_camara;
        }
    }
    //Creamos el metodo get de la cantidad de pixeles que tiene
    public int getPixeles(){
        return pixeles;
    }
    //Creamos el metodo set de la cantidad de pixeles
    public void setPixeles(int pixeles){
        if (pixeles == 0) {//Validamos el numero de camara para saber si se envia algun parametro
            this.pixeles = 108;
        }else{
            this.pixeles = pixeles;
        }
    }
    //Metodo del almacenamiento
    public int getAlmacenamiento(){
        return almcenamiento;
    }
    //Metoso set del almacenamiento
    public void setAlmacenamiento(int almacenamiento){
        if (almacenamiento == 0) {
            this.almcenamiento = 256;
        }else{
            this.almcenamiento = almacenamiento;
        }
    }
    //Creamos el metodo get del estado
    public boolean getEstado(){
        return estado;
    }
    //Creamos el metodo set del estado
    public void setEstado(boolean estado){
        if (estado == true ) {
            System.out.println("Encendido");
        }else if (estado == false){
            System.out.println("Apagado");
        }
    }
    //Creamos el metodo toString
    public String toString(){
        return "\nMarca = " + marca + "\nModelo = "+modelo;
    }

}
