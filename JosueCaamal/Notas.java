public class Notas extends Color {
    private String fecha;
    private String autor;
    private String texto;
    private String fechali;

    public Notas(String fecha, String texto, String color, String autor, String fechali) {
        super(color);
        setFecha(fecha);
        setAutor(autor);
        setTexto(texto);
        setFechaLi(fechali);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
    public void setTexto(String texto) {
        this.texto = texto.equals("") ? "urgente" : texto;
    }
    public String getTexto() {
        return texto;
    }
    public void setAutor(String autor) {
        this.autor = autor.equals("") ? "juanito" : autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setFechaLi(String fechali){
        this.fechali=fechali;
    }
    public String getFechali(){
        return fechali;
    }