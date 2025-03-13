public class Libreta {
    private String marca;
    private String tipo;
    private int cantidad;
    private int altura;
    private int ancho;
    
    //Creamos el metodo constructor de nuestra clase
    public Libreta(String marca){

    }
    //Creamos el metod get de tipo de hoja
    public String getTipo(){
        return tipo;
    }
    //Creamos el metodo set del tipo de hoja
    public void setTipo(String tipo){
        if (tipo.equals("")) {
            this.tipo = "Rayas";//Validamos si el usaurio no nos da un valor
        }else{
            this.tipo = tipo;
        }
    }
    //Creamos el metodo get de la cantidad de hoja
    public int getCantidad(){
        return cantidad;
    }
    //Creamos el metodo set de la cantidad de hoja
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    //Creamos el metodo get de la altura de la libreta
    public int getAltura(){
        return altura;
    }
    //Creamos el metodo set dde la altura de la libreta
    public void setAltura(int altura){
        if (altura == 0) {
            this.altura = 30;
        }else{
            this.altura = altura;
        }
    }
    //Creamos el metodo get del ancho de la ibreta
    public int getAncho(){
        return ancho;
    }
    //Creamos el metodo set del ancho de la libreta
    public void setAncho(int ancho){
        if (ancho == 0) {
            this.ancho = 25;
        }else{
            this.ancho = ancho;
        }
    }
}
