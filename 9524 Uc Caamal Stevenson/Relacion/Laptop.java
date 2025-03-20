class Laptop {
    private String marca;
    private String modelo;
    private boolean encendida;
    private Audifonos audifonosConectados; // Relación con Audifonos

    // Constructor
    public Laptop(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
        this.audifonosConectados = null;
    }

    // Métodos
    public void encender() {
        encendida = true;
        System.out.println("La laptop está encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La laptop está apagada.");
    }

    public void conectarAudifonos(Audifonos audifonos) {
        if (audifonos.getEstado()) {
            this.audifonosConectados = audifonos;
            System.out.println("Audífonos " + audifonos.getMarca() + " conectados a la laptop.");
        } else {
            System.out.println("Los audífonos deben estar encendidos para conectarse.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Laptop: " + marca + " - " + modelo);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
        if (audifonosConectados != null) {
            System.out.println("Audífonos conectados: " + audifonosConectados.getMarca());
        } else {
            System.out.println("No hay audífonos conectados.");
        }
    }
}