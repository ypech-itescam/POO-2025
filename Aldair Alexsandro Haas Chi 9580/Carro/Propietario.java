public class Propietario {
    private String nombre;
    private Vehiculo carro;

    public Propietario() {
        setNombre("Juanito");
        setCarro(new Vehiculo("P90","Negro"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"Juanito" : nombre;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }
    public String toString(){
        return "Datos del propietario \n - Nombre:" +getNombre()+ "\n" + carro.toString();  
    }

   
}