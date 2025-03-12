public class Audifono {

    // Atributos privados
    private String color;
    private boolean estado; // true = encendido, false = apagado
    private int funcion; // 0 = Apagado, 1 = Música, 2 = Llamada

    // Constructor vacío
    public Audifono() {
        this.color = "Lila";
        this.estado = false;
        this.funcion = 0;
    }

    // Constructor con parámetros
    public Audifono(String color, boolean estado, int funcion) {
        this.color = color;
        this.estado = estado;
        setFuncion(funcion); // Usamos el setter para validar el valor
    }

    // Getter y Setter de color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter y Setter de estado
    public boolean isEncendido() {
        return estado;
    }

    public void encender() {
        this.estado = true;
        System.out.println("Los audífonos están encendidos.");
    }

    public void apagar() {
        this.estado = false;
        this.funcion = 0; // Se apagan, por lo que no pueden estar en una función activa
        System.out.println("Los audífonos están apagados.");
    }

    // Getter y Setter de función
    public int getFuncion() {
        return funcion;
    }

    public void setFuncion(int funcion) {
        if (funcion < 0 || funcion > 2) {
            System.out.println("Función inválida. Debe ser 0 (Apagado), 1 (Música) o 2 (Llamada).");
        } else if (!estado && funcion != 0) {
            System.out.println("No puedes cambiar la función porque los audífonos están apagados.");
        } else {
            this.funcion = funcion;
            System.out.println("Función cambiada a: " + obtenerNombreFuncion());
        }
    }

    // Método para obtener el nombre de la función en texto
    private String obtenerNombreFuncion() {
        switch (funcion) {
            case 1: return "Música";
            case 2: return "Llamada";
            default: return "Apagado";
        }
    }

    // Método para mostrar el estado actual de los audífonos
    public void mostrarEstado() {
        System.out.println("Color: " + color);
        System.out.println("Estado: " + (estado ? "Encendido" : "Apagado"));
        System.out.println("Función actual: " + obtenerNombreFuncion());
    }

    public static void main(String[] args) {
        // Creando un objeto de la clase Audifonos
        Audifono misAudifonos = new Audifono("Azul", false, 0);

        // Mostrando el estado inicial
        misAudifonos.mostrarEstado();

        // Encendiendo los audífonos
        misAudifonos.encender();

        // Cambiando a modo música
        misAudifonos.setFuncion(1);

        // Mostrando el estado actualizado
        misAudifonos.mostrarEstado();

        // Apagando los audífonos
        misAudifonos.apagar();

        // Intentando cambiar la función cuando está apagado
        misAudifonos.setFuncion(2);
    }
}