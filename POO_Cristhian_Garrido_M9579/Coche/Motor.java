public class Motor {
    private String marca;//Atributos del motor
    private String tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp){//Metodo constructor
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }
    //Metodos getter de los atributos
    public String getMarca(){
        return marca;
    }
    public String getTipo(){
        return tipo;
    }
    public int getHp(){
        return hp;
    }
    //Metodos setter de los atributos
    public void setMarca(String marca){
        this.marca = marca.equals("")?"Marca no definida": marca;
    }
    public void setTipo(String tipo){
        this.tipo = tipo.equals("")?"Tipo de motor no definifo": tipo;
    }
    public void setHp(int hp){
        this.hp =(hp <= 0)?27:hp;
    }
    @Override
    public String toString() {
        return "\n\r---Detalles del Motor---\n\rMarca: "+marca+"\n\rTipo: "+tipo+"\n\rHp: "+hp;
}
}
