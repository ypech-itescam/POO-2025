public class Cargador{
    //Atributos
    private String marca; 
    private int velcarga;
    private String tipo;

 // Método constructor

    public cargador(String marca,String tipo,int velcarga){
        setMarca(marca);
        setVelcarga(velcarga);
        setTipo(tipo);
    } 
// Metodos get
    public String getMarca(){
        return marca;
    }
    public int getVelcarga(){
        return velcarga;
    }
    public String getTipo(){
        return tipo;
    }
    // Método set
    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setVelcarga(int velcarga){
        this.velcarga=velcarga;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void cargaRapida(int velcarga){
        if (velcarga >= 67 && velcarga<=120){
            System.out.println("Carga rapida activa");

        }else{
            System.out.println("Carga normal activa");
        }
    }
    @Override
    public String toString() {
        return ("Marca :" + getMarca()+ "\n"+ "Velocidad de carga :" + getVelcarga()+"\n" + "Tipo :" + getTipo()+"\n");
        }
}