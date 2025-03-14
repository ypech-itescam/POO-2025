public class Motor{
    private String marca;
    private String tipo;
    private int hp;

    public Motor(String marca, String tiop, int hp){
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }

    //Setter

    public void setMarca(String marca){
        this.marca = (marca.equals(""))? "Toyota" : marca;
    }
    public void setTipo(String tipo){ 
        this.tipo = (tipo.equals(""))? "Hibrido" :tipo;
    }
    public void setHp(int hp){
        this.hp = (hp>=0 && hp<=1000)? hp : 0;
    }

    //Getter

    public String getMarca(){
        return marca;
    }   
    public String getTipo(){
        return tipo;
    }
    public int getHp(){
        return hp;
    }

    public String toString(){
        System.out.println("//Motor" +"\n");
        return "Marca: " + getMarca() + "\n\r Tipo: " + getTipo() + " \n\r  Hp:" + getHp();
    }


}