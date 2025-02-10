public class BaymaxAvatar {
    // Atributos del avatar Baymax
    private String color;
    private double altura;
    private double peso;
    private boolean activo;

    // Constructor
    public BaymaxAvatar(String color, double altura, double peso) {
        this.color = color;
        this.altura = altura;
        this.peso = peso;
        this.activo = false; // Por defecto, al iniciar no está activo
    }

    // Método para activar al avatar
    public void activar() {
        activo = true;
        System.out.println("¡Hola! Soy Baymax, tu asistente personal sanitario.");
    }

    // Método para desactivar al avatar
    public void desactivar() {
        activo = false;
        System.out.println("Baymax se ha desactivado.");
    }

    // Método para mostrar la información del avatar
    public void mostrarInformacion() {
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kilogramos");
        if (activo) {
            System.out.println("Estado: Activo");
        } else {
            System.out.println("Estado: Inactivo");
        }
    }

    // Método para tratar una lesión (ejemplo de método adicional)
    public void tratarLesion(String tipoLesion) {
        if (activo) {
            System.out.println("Voy a tratar la lesión de tipo: " + tipoLesion);
        } else {
            System.out.println("Baymax no está activo. Actívalo para tratar la lesión.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        BaymaxAvatar miBaymax = new BaymaxAvatar("Blanco", 2.5, 100);
        miBaymax.mostrarInformacion(); // Mostrará la información inicial del avatar
        miBaymax.activar(); // Activar el avatar
        miBaymax.mostrarInformacion(); // Mostrará la información actualizada del avatar
        miBaymax.tratarLesion("Quemadura"); // Intentará tratar una lesión
        miBaymax.desactivar(); // Desactivar el avatar
        miBaymax.mostrarInformacion(); // Mostrará la información actualizada del avatar
    }
}