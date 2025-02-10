public class Nota {
    private String importancia;
    private String fecha;
    private String texto;
    private String fechaLimite;
    private String nombre;
    private Color color;

    public Nota(String importancia, String fecha, String fechaLimite, String texto) {
        setImportancia(importancia);
        setFecha(fecha);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setNombre("Jesús");
        color = new Color("verde");
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia.equals("") ? "urgente" : importancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha.equals("") ? "19 de febrero" : fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("")? "Realiza la practica" : texto;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite.equals("")? "1 de febrero" : fechaLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Yaqui" : nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color.setColor(color);;
    }

    public String toString() {
        return (color.getColorAnsi() + "Importancia: " + getImportancia() + "\n" + "Fecha: " + getFecha() + "\n" + "Texto: " + getTexto() + "\n" + "Fecha Límite: " + getFechaLimite() + "\n" + "Nombre: " + getNombre() + "\n" + "\u001B[0m");
    }
}