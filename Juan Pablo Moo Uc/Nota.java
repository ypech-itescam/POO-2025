import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nota extends BlockDeNotas {
    private String importancia;
    private String texto;
    private String fechaLimite;
    private String nombre;
    private Color color;

    public Nota(String importancia, String texto,
            String fechaLimite, String nombre, String color, String string) {
        // super(nombre);
        this.color = new Color(color);
        setImportancia(importancia);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setNombre(nombre);
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia.equals("") ? "Sin registrar" : importancia;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("") ? "Sin texto registrado" : texto;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite.equals("") ? "00/00/0000" : fechaLimite;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Sin autor registrado" : nombre;
    }

    public String fechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hora = fechaActual.format(formatter);
        return hora;
    }

    public String imprimirTexto() {
        return color.getColorAnci()
                + "================================================================" + "\n"
                + "debe de ir el titulo" + "\n"
                + "================================================================"
                + "\n" + "\t\t\t\t\t" + "Fecha Actual: " + fechaActual() + "\n"
                + "Importancia: " + getImportancia()
                + "\n" + getTexto()
                + "\n" + "Fecha Límite: " + getFechaLimite()
                + "\n" + "Autor: " + getNombre() + "\n"
                + "================================================================" + "\u001B[00m" + "\n";
    }
}
