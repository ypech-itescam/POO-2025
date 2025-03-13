public class Motor {
    private String marca;
    private String tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp) {
        this.marca = marca;
        this.tipo = tipo;
        this.hp = hp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
    public String toString() {
        return "Motor: \n\r-Marca: " + getMarca() +"\n\r -Tipo: " + getTipo() + "\n\r -HP: " + getHp();
    }
}