import java.util.Date;

public class Notas {
    private String color;
    private Date fecha;
    private String importancia;
    private String asunto;
    private String firma;
    private Date fechaLimite;

    public Notas(String color, Date fecha, String importancia, String asunto, String firma, Date fechaLimite) {
        this.color = color;
        this.fecha = fecha;
        this.importancia = importancia;
        this.asunto = asunto;
        this.firma = firma;
        this.fechaLimite = fechaLimite;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public static void main(String[] args) {
        Date fecha = new Date();
        Date fechaLimite = new Date();

        Nota miNota = new Nota("Azul", fecha, "Normal", "Recordatorio", "Uriel Balan", fechaLimite);

        System.out.println("Color: " + miNota.getColor());
        System.out.println("Fecha: " + miNota.getFecha());
        System.out.println("Importancia: " + miNota.getImportancia());
        System.out.println("Asunto: " + miNota.getAsunto());
        System.out.println("Firma: " + miNota.getFirma());
        System.out.println("Fecha limite: " + miNota.getFechaLimite());
    }
}
