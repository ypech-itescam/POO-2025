public class Propietario {
    private String nombre;
    private Vehiculo carro;

    public Propietario(){
        setnombre("propietario general");
        setcarro(new Vehiculo("KIA","blanco"));

    }
    public void setnombre(String nombre){
        this.nombre= nombre.equals("") ?"no definido":nombre;
    }
    public void setcarro(Vehiculo vehiculo){
        carro=(vehiculo);
    }
    public String getnombre(){
        return nombre;
    }
    public Vehiculo getcarro(){
        return carro;
    }
    public String toString(){
        return "Datos del propietario"+"\n\r-Nombre:"+getnombre()+"\n\r"+getcarro();
    }

    
}
