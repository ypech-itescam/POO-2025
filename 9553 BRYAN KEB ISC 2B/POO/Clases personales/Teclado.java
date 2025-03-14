public class Teclado {
    //Atributos
    private String marca; 
    private int estado;
    private String color;

 // Método constructor

    public Teclado(String Marca,String Color,int Estado){
        setMarca(marca);
        setEstado(estado);
        setColor(color);
    } 
// Metodos get
    public String getMarca(){
        return marca;
    }
    public int getEstado(){
        return estado;
    }
    public String getColor(){
        return color;
    }
    // Método set
    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void onRgb(int estado){
        if (estado <= 0 && estado>=1){
            System.out.println("EL RGB SE ENCUENTRA APAGADO");

        }else{
            System.out.println("EL RGB SE ENCUENTRA ENCENDIDO");
        }
    }
    @Override
    public String toString() {
        return ("Marca :" + getMarca()+ "\n"+ "Estado :" + getEstado()+"\n" + "Color :" + getColor()+"\n");
        }
}
