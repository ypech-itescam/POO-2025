public class Motor {
    private String marca;
    private String tipo;//gasolona,disel,hibrido
    private int hp;

    //metodo costructor 
    public Motor(String marca,String tipo, int hp){
        setmarca(marca);
        settipo(tipo);
        sethp(hp);

    }
    public void setmarca(String marca){
        this.marca=(marca.equals(""))?"no esta definida":marca;
    }
    public void settipo(String tipo){
        this.tipo=(tipo.equals("Gasolina")||tipo.equals("Diesel")||tipo.equals("Hibrido"))?tipo:"no definido";
    }
    public void sethp(int hp){
        this.hp=(hp<0)?0:hp;
    }
    public String getmarca(){
        return marca;
    }
    public String gettipo(){
        return tipo;
    }
    public int gethp(){
        return hp;
    }
    public String toString(){
        return"Motor"+"\n\r-marca:"+getmarca()+"\n\r-tipo:"+gettipo()+"\n\r-hp:"+gethp()+"\n\r"+"-----------";
    }
    
}
