public class Nota {
    private String fecha;
    private String color;
    private String tipoNota;
    private String contenido;
    private String autor;
    private String fechaLimite;

    public Nota(String fecha, String tipoNota, String contenido, String autor, String fechaLimite) {
        this.fecha = fecha;
        this.tipoNota = tipoNota;
        this.contenido = contenido;
        this.autor = autor;
        this.fechaLimite = fechaLimite;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tiponota) {
        this.tipoNota = tiponota;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechalimite) {
        this.fechaLimite = fechalimite;
    }

    public static void main(String[] args) {
        // Crear una nueva instancia de Nota con valores específicos
        Nota nota1 = new Nota("2024-02-29", "tarea", "Estudiar programación", "Diana", "2024-04-");

        // Establecer el color
        nota1.setColor("\u001B[31mEste texto se imprimirá en rojo\u001B[0m");

        // Imprimir los valores de la nota
        System.out.println("Fecha: " + nota1.getFecha());
        System.out.println("Color: " + nota1.getColor());
        System.out.println("Tipo de Nota: " + nota1.getTipoNota());
        System.out.println("Contenido: " + nota1.getContenido());
        System.out.println("Autor: " + nota1.getAutor());
        System.out.println("Fecha Límite: " + nota1.getFechaLimite());

        // Guardar la nota
        nota1.Guardar();
    }

    public void Guardar() {
        System.out.println("La nota ha sido guardada.");
    }
}
