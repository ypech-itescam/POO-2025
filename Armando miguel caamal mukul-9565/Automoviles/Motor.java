package Automoviles;
public class Motor {
    private String marca;
    private String tipo;
    private int hp;
    
    public Motor(String marca, String tipo, int hp) {
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getHp() {
        return hp;
    }
    
    @Override
    public String toString() {
        return "Motor{" +"marca='" + marca + '\'' +", tipo='" + tipo + '\'' +", hp=" + hp +'}';
    }
}