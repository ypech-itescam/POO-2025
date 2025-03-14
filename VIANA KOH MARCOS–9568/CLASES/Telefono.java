public class Telefono {
    private String marca;
    private String modelo;
    private int capacidadBateria;
    private Audifono audifonoConectado;  
    private Cargador cargadorConectado;

    // Constructor vacío
    public Telefono() {
        this.marca = "Desconocida"; // Valor por defecto
        this.modelo = "Desconocido"; // Valor por defecto
        this.capacidadBateria = 3000; // Valor por defecto
        this.audifonoConectado = null;
        this.cargadorConectado = null;
    }

    // Constructor con parámetros
    public Telefono(String marca, String modelo, int capacidadBateria, Audifono audifonoConectado, Cargador cargadorConectado) {
        setMarca(marca);
        setModelo(modelo);
        setCapacidadBateria(capacidadBateria);
        setAudifonoConectado(audifonoConectado);
        setCargadorConectado(cargadorConectado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        // Si marca está vacía, se asigna "Desconocida" por defecto
        this.marca = (marca.equals("")) ? "Desconocida" : marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        // Si el modelo está vacío, se asigna "Desconocido"
        this.modelo = (modelo.equals("")) ? "Desconocido" : modelo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        // Si la capacidad de batería es menor o igual a 0, se asigna 3000 como valor por defecto
        this.capacidadBateria = (capacidadBateria <= 0) ? 3000 : capacidadBateria;
    }

    public Audifono getAudifonoConectado() {
        return audifonoConectado;
    }

    public void setAudifonoConectado(Audifono audifonoConectado) {
        // Si audifonoConectado es null, se asigna null (o podrías poner otro valor por defecto)
        this.audifonoConectado = (audifonoConectado == null) ? null : audifonoConectado;
    }

    public Cargador getCargadorConectado() {
        return cargadorConectado;
    }

    public void setCargadorConectado(Cargador cargadorConectado) {
        // Si cargadorConectado es null, se asigna null
        this.cargadorConectado = (cargadorConectado == null) ? null : cargadorConectado;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de bateria: " + capacidadBateria + " mAh");
    }

    public void conectarAudifono(Audifono audifono) {
        this.audifonoConectado = audifono;
        System.out.println("Audifono " + audifono.getMarca() + " " + audifono.getModelo() + " conectado.");
    }

     // Método toString
    
     public String toString() {
        return "Telefono {" + "Marca='" + marca + '\'' + ", Modelo='" + modelo + '\'' + ", Capacidad de bateria=" + capacidadBateria + " mAh" + ", Audifono Conectado=" + (audifonoConectado != null ? audifonoConectado.getMarca() + " " + audifonoConectado.getModelo() : "Ninguno") +", Cargador Conectado=" + (cargadorConectado != null ? cargadorConectado.getMarca() : "Ninguno") +
               '}';
    }
}


