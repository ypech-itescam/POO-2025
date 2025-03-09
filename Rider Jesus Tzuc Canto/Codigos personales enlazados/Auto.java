public class Auto{
    private String color;
    private String marca;
    private String modelo;
    private int velocidad;
    private Computador computador;
    private boolean combustible;// true gasolina false electrico


    public Auto(Computador computador,String color,String marca,String modelo,boolean combustible, int velocidad){
        setcolor(color);
        setcomputador(computador);
        setmarca(marca);
        setmodelo(modelo);
        setvelociada(velocidad);
        setcombustible(combustible);

    }
    public void setcomputador(Computador computador){
        this.computador=(computador);
    }
    public Computador getComputador(){
        return computador;
    }
        //medos get 
    public String getcolor(){
        return color;
    }
        //set del color
    public void setcolor(String color){
        this.color=(color.equals(""))?"no definido":color;
    }
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca=(marca.equals(""))?"no definido":marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo=(modelo.equals(""))?"gtr":modelo;
    }
    public int getvelocidad(){
        return velocidad;
    }
    public void setvelociada(int velociada){
        this.velocidad=(velocidad<0 && velocidad>300)?velocidad:150;
    }
    public boolean getcombustible(){
        return combustible;
    }
    public void setcombustible(boolean combustible){
        this.combustible=(combustible==false)?false:true;
    }
    public String toString(){
        return "Informacion del vehiculo\n\r"+"\n\rColor :"+getcolor()+"\n\r Marca"+getmarca()+"\n\rModelo"+getmodelo()+"\n\rVelocidad :"+getvelocidad()+"\n\rCombustible :"+getcombustible()+"\n\rInformacion de la computadora del auto\n\r"+getComputador()+"\n\r";
    }





    
}
