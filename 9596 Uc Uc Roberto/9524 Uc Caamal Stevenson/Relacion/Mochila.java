class Mochila {
    private String color;
    private Laptop laptop;
    private Audifonos audifonos;

    // Constructor
    public Mochila(String color, Laptop laptop, Audifonos audifonos) {
        this.color = color;
        this.laptop = laptop;
        this.audifonos = audifonos;
    }

    // Método para mostrar el contenido de la mochila
    public void mostrarContenido() {
        System.out.println("\nMochila Color: " + color);
        boolean tieneLaptop = laptop != null;
        boolean tieneAudifonos = audifonos != null;

        if (tieneLaptop) {
            laptop.mostrarInfo();
        } else {
            System.out.println("No hay laptop en la mochila.");
        }

        if (tieneAudifonos) {
            System.out.println("Audífonos en la mochila: " + audifonos.getMarca());
        } else {
            System.out.println("No hay audífonos en la mochila.");
        }

        // Mostrar el mensaje si ambos están en la mochila
        if (tieneLaptop && tieneAudifonos) {
            System.out.println("\nLos audífonos y la laptop están en la mochila.");
        }
    }
}
