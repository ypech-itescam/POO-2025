package CharlyKeb.EjerciciosDeClase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nota extends BlockDeNotas {
    private String importancia;
    private String texto;
    private String fechaLimite;
    private String nombreDelEscritor;
    private Color color;

    public Nota(String importancia, String texto,
            String fechaLimite, String nombreDelEscritor, String color) {
        // super(nombre);
        this.color = new Color(color);
        setImportancia(importancia);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setNombreDelEscritor(nombreDelEscritor);
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

        /*
         * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         * this.fechaLimite = sdf.format(new Date());
         */
    }

    public String getNombreDelEscritor() {
        return nombreDelEscritor;
    }

    public void setNombreDelEscritor(String nombreDelEscritor) {
        this.nombreDelEscritor = nombreDelEscritor.equals("") ? "Sin autor registrado" : nombreDelEscritor;
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
                + "\n" + "Autor: " + getNombreDelEscritor() + "\n"
                + "================================================================" + "\u001B[00m" + "\n";
    }
}

/*
 * que es un arrglo como se declara
 * que es un vector, como se declara un vector
 */
