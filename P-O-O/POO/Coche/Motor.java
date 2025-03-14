package POO.Coche;
public class Motor {
    //ATRIBUTOS
    private String tipo;  //GASOLINA - DIESEL- HÍBRIDO-ELECTRICO
    private String marca;
    private int hp;

    //Constructor
    public Motor (String tipo, String marca, int hp){
        setTipo(tipo);
        setMarca(marca);
        setHp(hp);
    }
    //Get

    public String getTipo(){
        return tipo;
    }
    public String getMarca(){
        return marca;
    }
    public int getHp(){
        return hp;
    }

    //Set

    public void setTipo(String tipo){
        this.tipo=(tipo.equals(""))?"Hibrido": tipo;
    }
    public void setMarca(String marca){
        this.marca=(marca.equals(""))?"Dodge": marca; 
    }
    public void setHp(int hp){
        this.hp=(hp >= 0 && hp <= 1000)? hp: 300;
    }

    //toString

    public String toString(){
        return("Marca:"+ getMarca() + "\n"+ "Tipo de motor"+ getTipo() + "\n"+ "Hp(caballos de fuerza):"+ getHp()+ "\n");
    }

}
