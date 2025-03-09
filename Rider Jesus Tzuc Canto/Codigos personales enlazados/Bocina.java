public class Bocina{
    private String color;
    private String marca;
    private boolean estado;     // true prendido flase apagado
    private int modo;     // 1 blothu 2 radio 3 cable
    private int nivel_bateria;

    public Bocina(boolean estado, int modo,String color,String marca,int nivel_bateria){
    setcolor(color);
    setmarca(marca);
    setestado(estado);
    setmodo(modo);
    setnivel_bateria(nivel_bateria);

    }
    public String getcolor(){
        return color;
    }
    //set del color
    public void setcolor(String color){
        this.color=(color.equals(""))?"no expecifico":color;
    }

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca=(marca.equals(""))?"no definida":marca;

    }
    public boolean getestado(){
        return estado;
    }
    public void setestado(boolean estado){
        this.estado=(estado==false)?false:true;
    }
    public int getmodo(){
        return modo;
    }
    public void setmodo(int modo){
        this.modo=(modo>=3 && modo<=1)?modo:1;
    }
    public int getnivel_bateria(){
        return nivel_bateria;
    }
    public void setnivel_bateria(int nivel_bateria){
        this.nivel_bateria=(nivel_bateria>=100 && nivel_bateria<0 )?nivel_bateria:100;
    }
    public String toString(){
        return "Informacion de la bocina\n\r"+"\n\rColor :"+getcolor()+"\n\rMarca :"+getmarca()+"\n\rModo :"+getmodo()+"\n\rEstado :"+getestado()+"\n\rNivel de bateria :"+getnivel_bateria()+"\n\r";
    }


}
