public class Motor{
    private  String marca;
    private String tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp){
        setmarca(marca);
        settipo(tipo);
        sethp(hp);
    }
    public Motor(){
        setmarca(marca);
        settipo(tipo);
        sethp(hp);
    }

    public String getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca=marca;

    }

    public String gettipo(){
        return tipo;

    }
    
    public void settipo(String tipo){
        this.tipo=(tipo.equals("Gasolina")||tipo.equals("Diasel")||tipo.equals("Hibrido"))?tipo:"no difinido";
    }

    public int gethp(){
        return hp;

    }

    public void sethp(int hp){
        this.hp=hp;

    }

    public String toString(){
        return "Motor" +"\n\r- Marca:"+ getmarca() +"\n\r-Tipo:" + gettipo()+ "\n\r-Hp: " + gethp() + "\n\r";
    }
}
