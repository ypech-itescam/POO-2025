public class Motor {
    private String marca;;
    private String tipo;
    private int hp;

    //Creacion del metodo constructor
    public Motor(String marca, String tipo, int hp){
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }
    //Creacion de los metodos set del atributo marca
    public void setMarca(String marca){
        this.marca = marca.equals("")?"Nissan":marca;
    }
    //Creacion del metodo set de tipo de motor
    public void setTipo(String tipo){
        this.tipo = tipo.equals("")?"Hibrido" :tipo;
    }
    //Creacion del metodo set de hp
    public void setHp( int hp){
        if(hp <= 0){
            this.hp = (249);
        }else{
            this.hp = hp;
        }
    }
    //Creacion del metodo getMarca
    public String getMarca(){
        return marca;
    }
    //Creacion del metodo getTipo
    public String getTipo(){
        return tipo;
    }
    //Creacion del metodo getHp
    public int getHp(){
        return hp;
    }
    //Creacion del metodo toString
    public String toString(){
        return "Detalles del Motor\n\rMarca : "+getMarca()+"\n\rTipo: "+getTipo()+"\n\rHp: "+getHp();
    }
    

}
