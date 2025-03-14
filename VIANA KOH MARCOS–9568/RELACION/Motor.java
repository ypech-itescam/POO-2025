public class Motor {
    
    
    private String tipo;       //GASOLINA - DISEL - HIBRIDO
    private String marca;
    private int hp;

    
    public Motor(String tipo, String marca, int hp ){
        setTipo(tipo);
        setMarca(marca);
        setHp(hp);
    }

  
    public String getTipo(){
        return tipo;
    }


    public String getMarca(){
        return marca;
    }


    public int getHp(){
        return hp;
    }

   
    public void setTipo(String tipo){
        this.tipo =(tipo.equals(""))? "Hibrido" :tipo;
    }

    public void setMarca(String marca){
        this.marca=(marca.equals(""))? "Toyota": marca;
    }

    public void setHp(int hp) {
        // Si el valor de hp es invalido (fuera del parametro 0-1000), asignar un valor (350)
        this.hp = (hp >= 0 && hp <= 1000) ? hp : 350;
    }



   public String toString(){
    System.out.println("//MOTOR" + "\n");

    return("Marca: " + getMarca() + "\n" + "Tipo de motor" + getTipo() + "\n" + "Hp (Caballos de fuerza):" + getHp() + "\n");

   }
}
