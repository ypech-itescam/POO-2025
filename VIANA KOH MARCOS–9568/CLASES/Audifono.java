public class Audifono {
    private String marca;
    private String modelo;
    private String tipoConector;
    private int nivelBateria;
    private Telefono telefonoConectado;

    
    public Audifono() {
        this.marca = "Desconocida"; 
        this.modelo = "";
        this.tipoConector = "";
        this.nivelBateria = 0;
        this.telefonoConectado = null;
    }

    public Audifono(String marca, String modelo, String tipoConector, int nivelBateria, Telefono telefonoConectado) {
        setMarca(marca);
        setModelo(modelo);
        setTipoConector(tipoConector);
        setNivelBateria(nivelBateria);
        setTelefonoConectado(telefonoConectado);
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
        // Si el modelo está vacío, se asigna un valor por defecto
        this.modelo = (modelo.equals("")) ? "Modelo desconocido" : modelo;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        // Si el tipo de conector está vacío, se asigna "Desconocido"
        this.tipoConector = (tipoConector.equals("")) ? "Desconocido" : tipoConector;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        // Si el nivel de batería no está en el rango de 0 a 100, se asigna 50 por defecto
        this.nivelBateria = (nivelBateria < 0 || nivelBateria > 100) ? 50 : nivelBateria;
    }

    public Telefono getTelefonoConectado() {
        return telefonoConectado;
    }

    public void setTelefonoConectado(Telefono telefonoConectado) {
        // Si el teléfono conectado es null, se asigna null (o puedes definir otro valor por defecto)
        this.telefonoConectado = (telefonoConectado == null) ? null : telefonoConectado;
    }

    public void mostrarNivelBateria() {
        System.out.println("El nivel de bateria del audifono es: " + nivelBateria + "%");
    }

    public void conectarATelefono(Telefono telefono) {
        this.telefonoConectado = telefono;
        System.out.println("Audifono conectado al telefono " + telefono.getModelo() + ".");
    }

    // Método toString
    
    public String toString() {
        return "Audifono {" +
               "Marca='" + marca + '\'' +", Modelo='" + modelo + '\'' + ", Tipo de conector='" + tipoConector + '\'' +", Nivel de bateria=" + nivelBateria + "%" +", Telefono Conectado=" + (telefonoConectado != null ? telefonoConectado.getModelo() : "Ninguno") +
               '}';
    }
}
