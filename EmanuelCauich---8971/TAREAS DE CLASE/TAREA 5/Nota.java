public class Nota{
    private String fecha;
    private String tipo;
    private String texto;
    private String fechaLimite;
    private String autor;
    private Color color;

    public Nota(String fecha, String tipo, String texto, String autor, String fechaLimite) {
        setFecha(fecha);
        setTipo(tipo);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setAutor(autor);
        this.color = new Color("azul");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void imprimir() {
        String detalles = obtenerImprimirComoCadena();
        System.out.println(detalles);
    }
    
    public String obtenerImprimirComoCadena() {
        String borde = color.getColorAnsi() + "*********************************************************************\n";
        String contenido = "                                                           " + fecha + "\n" +
            "Tipo == " + tipo + "\n" +
            texto + "\n" +
            "Fecha limite:\n" +
            "         " + fechaLimite + "\n" +
            "Autor = " + autor + "\n";
        
        return borde + contenido + borde;
    }
    
}