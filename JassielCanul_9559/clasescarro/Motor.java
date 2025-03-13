package clasescarro;

public class Motor { 
    private String marca;
    private String tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp){
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }
    public Motor(){
        setMarca("Bentley");
        setTipo("Hibrido");
        setHp(450);
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca.equals("")? "Desconocido" : marca;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo.equals("Disel")||tipo.equals("Gasolina")
        ||tipo.equals("Hibrido")? tipo : "Disel";
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = (hp>0 && hp<1000)?hp:150;
    }
    
    public String toString(){
        return "Motor \n \r     - Marca: " + getMarca() + "\n \r     - Tipo: " + getTipo() + "\n \r     - Hp: " + getHp();
    }
}