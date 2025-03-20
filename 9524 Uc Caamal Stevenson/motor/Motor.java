public class Motor {
    private String marca;
    private String tipo;
    private int hp; 

    public Motor(String marca, String tipo, int hp) {
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
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
        if (tipo.equals("diesel") || tipo.equals("gasolina") || tipo.equals("híbrido") || tipo.equals("hibrido")) {

        } else {
            this.tipo = "Gasolina";
        }
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
      this.hp = hp <= 0 ? 20 : hp;
    }

    public String toString(){
        return "Motor:\n -Marca : " + getMarca() + "\n -Tipo : " + getTipo() + "\n -HP : " + getHp();
    }
   
}
            