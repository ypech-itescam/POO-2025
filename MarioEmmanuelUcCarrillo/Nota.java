public class Nota {
    private String titulo;
    private String contenido;

    public Nota(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Nota miNota = new Nota("Nota", "El mensaje es: ");
        System.out.println(miNota);
    }
}
