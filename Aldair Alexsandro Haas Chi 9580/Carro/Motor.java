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
        this.marca = marca.equals("")?"Ferrari":marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Diesel") || tipo.equals("Gasolina") || tipo.equals("Hibrido")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Gasolina";
        }
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
      this.hp = hp <= 0 && hp>=300 ? 250: hp;
    }

    public String toString(){
        return "Motor:\n -Marca : " + getMarca() + "\n -Tipo : " + getTipo() + "\n -HP : " + getHp();
    }
   
}