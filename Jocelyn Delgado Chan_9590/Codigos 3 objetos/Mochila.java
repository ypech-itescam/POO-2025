public class Mochila {

    // Definición de atributos de la clase
    private String color;
    private String marca;
    private boolean estado; // true: Abierto, false: Cerrado
    private String material;

    // Constructor
    public Mochila(String color, String marca, boolean estado, String material) {
        this.color = (color.equals("")) ? "Rosa" : color;
        this.marca = (marca.equals("")) ? "JanSport" : marca;
        this.estado = estado;
        this.material = (material.equals("")) ? "Poliéster" : material;
    }

    // Métodos para asignar u obtener los valores de los atributos
    public void setColor(String color) {
        this.color = (color.equals("")) ? "Rosa" : color;
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "JanSport" : marca;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setMaterial(String material) {
        this.material = (material.equals("")) ? "Poliéster" : material;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "Color: " + getColor() + "\nMarca: " + getMarca() + "\nEstado: " + (getEstado() ? "Abierto" : "Cerrado") + "\nMaterial: " + getMaterial();
    }

    // Métodos adicionales según lo que has solicitado

    // Método abrir()
    public void abrir() {
        if (!estado) { // Si la mochila está cerrada
            estado = true;
            System.out.println("La mochila ha sido abierta.");
        } else {
            System.out.println("La mochila ya está abierta.");
        }
    }

    // Método cerrar()
    public void cerrar() {
        if (estado) { // Si la mochila está abierta
            estado = false;
            System.out.println("La mochila ha sido cerrada.");
        } else {
            System.out.println("La mochila ya está cerrada.");
        }
    }

    // Método guardarObjeto(String objeto)
    public void guardarObjeto(String objeto) {
        if (estado) { // Si la mochila está abierta
            System.out.println("El objeto " + objeto + " ha sido guardado en la mochila.");
        } else {
            System.out.println("No se puede guardar el objeto porque la mochila está cerrada.");
        }
    }

    // Método sacarObjeto(String objeto)
    public void sacarObjeto(String objeto) {
        if (estado) { // Si la mochila está abierta
            System.out.println("El objeto " + objeto + " ha sido sacado de la mochila.");
        } else {
            System.out.println("No se puede sacar el objeto porque la mochila está cerrada.");
        }
    }
}
