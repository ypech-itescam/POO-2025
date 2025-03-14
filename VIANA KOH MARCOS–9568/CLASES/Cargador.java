public class Cargador {
    private String marca;
    private String tipoConector;
    private int potenciaCarga;
    private Telefono telefonoConectado;

    // Constructor vacío
    public Cargador() {
        this.marca = "Desconocida"; // Valor por defecto
        this.tipoConector = "Desconocido"; // Valor por defecto
        this.potenciaCarga = 10; // Valor por defecto
        this.telefonoConectado = null;
    }

    // Constructor con parámetros
    public Cargador(String marca, String tipoConector, int potenciaCarga, Telefono telefonoConectado) {
        setMarca(marca);
        setTipoConector(tipoConector);
        setPotenciaCarga(potenciaCarga);
        setTelefonoConectado(telefonoConectado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        // Si marca está vacía, se asigna "Desconocida" por defecto
        this.marca = (marca.equals("")) ? "Desconocida" : marca;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        // Si el tipo de conector está vacío, se asigna "Desconocido"
        this.tipoConector = (tipoConector.equals("")) ? "Desconocido" : tipoConector;
    }

    public int getPotenciaCarga() {
        return potenciaCarga;
    }

    public void setPotenciaCarga(int potenciaCarga) {
        // Si la potencia de carga es menor o igual a 0, se asigna 10 por defecto
        this.potenciaCarga = (potenciaCarga <= 0) ? 10 : potenciaCarga;
    }

    public Telefono getTelefonoConectado() {
        return telefonoConectado;
    }

    public void setTelefonoConectado(Telefono telefonoConectado) {
        // Si el teléfono conectado es null, se asigna null
        this.telefonoConectado = (telefonoConectado == null) ? null : telefonoConectado;
    }

    // Método toString (opcional, si quieres representar el objeto como cadena)
    @Override
    public String toString() {
        return "Cargador {" +"Marca='" + marca + '\'' +", Tipo de conector='" + tipoConector + '\'' +", Potencia de carga=" + potenciaCarga + "W" +", Telefono Conectado=" + (telefonoConectado != null ? telefonoConectado.getModelo() : "Ninguno") +
               '}';
    }
}
