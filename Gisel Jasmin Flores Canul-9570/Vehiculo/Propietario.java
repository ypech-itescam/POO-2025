class Propietario {
    private String nombre;
    private Vehiculo carro;

    public Propietario(String nombre, Vehiculo carro) {
        this.nombre = nombre;
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    
    public String toString() {
        return "Propietario: " + nombre + "\n" + carro.toString();
    }
}

