public class Militar {
    private int edad;
    private String nombre;
    private double altura;
    private char sexo;
    private Arma arma;
    private Vehiculo vehiculo;

    
    public Militar(int edad, String nombre, double altura, char sexo) {
        setEdad(edad);
        setNombre(nombre);
        setAltura(altura);
        setSexo(sexo);
        setArma(new Rifle());
        setVehiculo(null);
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

 
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}