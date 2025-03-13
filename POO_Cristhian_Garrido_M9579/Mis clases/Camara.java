public class Camara {
    //Creamos los atributos con el modificador de acceso
    private String marca;
    private String modelo;
    private String color;
    private int camara;
    private int pixeles;

    //Creamos el metodo constructor de nuestra clase
    public Camara (String marca, String modelo){
        
    }
    //Creamos el metodo get del color
    public String getColor(){
        return color;
    }
    //Creamos el metodo set del color
    public void setColor(String color){
        if (color.equals("")) {//Validamos el color en dado que no manden nada en el parametro 
            this.color = "Negro";
        }else{
          this.color = color;
        }
    }
    //Creamos el metodo get de cantidad de camaras
    public int getCamara(){
        return camara;
    }
    //Creamos el metodo set de cantidad de camaras
    public void setCamara(int camara){
        if( camara == 0){//Se crea un valor por si el usuario no pone ningun dato de parametro
        this.camara = 4;
        }else{
            this.camara = camara;
        }
    }
    //Creamos el metodo get de los pixeles
    public int getPixeles(){
        return pixeles;
    }

    //Creamos el metodo set de los pixeles
    public void setPixeles(int pixeles){
        if (pixeles == 0) {
            this.pixeles = 64;//Se crea un valor por si el usuario no pone ningun dato de parametro
        }else{
            this.pixeles = pixeles;
        }
    }

        
}
