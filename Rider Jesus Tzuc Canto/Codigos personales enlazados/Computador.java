public class Computador{
    private String color;
    private boolean funcion;//true video flase musica 
    private int nivel_bateria;// de 1% a 100%
    private String marca;
    private String modelo;
    private Bocina bocina;
    private boolean estado;//true prendido flase agagado
    
    public Computador(boolean funcion,boolean estado,String color, String marca,String modelo,int nivel_bateria ,Bocina bocina ){
    setbocina(bocina);
    setfuncion(funcion);
    setestado(estado);
    setcolor(color);
    setnivel_bateria(nivel_bateria);
    setmarca(marca);
    setmodelo(modelo);
    }
    public void setbocina(Bocina bocina){
        this.bocina=(bocina);
    }
    public Bocina getbocina(){
        return bocina;
    }

    //medos get 
    public String getcolor(){
        return color;
    }
    //set del color
    public void setcolor(String color){
        this.color=(color.equals(""))?"no expecifico":color;
    }
    // get de funcion
    public boolean getfuncion(){
        return funcion;
    }
    //set de funcion
    public void setfuncion(boolean funcion){
        this.funcion=(funcion==false)?false:true;
    }
    //get de nivel de bateria
    public int getnivel_bateria(){
        return nivel_bateria;
    }
    //set de nivel_bateria
    public void setnivel_bateria(int nivel_bateria){
        this.nivel_bateria=(nivel_bateria< 101 && nivel_bateria>0)?nivel_bateria:100;
    }
    //grt de marca
    public String getmarca(){
        return marca;
    }
    //set de marca
    public void setmarca(String marca){
        this.marca=(marca.equals(""))?"no definida":marca;

    }
    //get modelo
    public String getmodelo(){
        return modelo;
    }
    //set modelo 
    public void setmodelo(String modelo){
        this.modelo=(modelo.equals(""))?"rtx":modelo;
    }
    //get estado
    public boolean getestado(){
        return estado;
    }
    //set estado
    public void setestado(boolean estado){
        this.estado=(estado==false)?false:true;
    }
    public String toString(){
        return "Informacion de la computadora\n\r"+"\n\rcolor"+color+"\n\rmarca :"+marca+"\n\rmodelo :"+modelo+"\n\rnievel de bateria :"+getnivel_bateria()+"\n\rInformacion de bocina externa\n\r"+getbocina()+"\n\r";
    }
}
