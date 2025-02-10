public class Nota extends Color {
    private String fecha;
    private String texto;
    private String autor;
    private String asunto;
    private String fechalimite;


    public Nota(String fecha, String texto, String autor, String asunto, String fechalim,String color){
        super(color);
        setFecha(fecha);
        setTexto(texto);
        setAutor(autor);
        setAsunto(asunto);
        setFechaLimite(fechalimite);

    }

    public void setFecha(String fecha) {
        this.fecha = fecha.equals("")?"sin fecha":fecha;
    }
    public void setTexto(String texto) {
        this.texto = texto.equals("")?"sin texto":texto;
    }
    public void setAutor(String autor) {
        this.autor = autor.equals("")?"sin autor":autor;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto.equals("")?"sin asunto":asunto;
    }
    public void setFechaLimite(String fechalimite) {
        this.fechalimite = (fechalimite != null && !fechalimite.equals("")) ? fechalimite : "sin fecha limite";
    }
    
    public String getFecha() {
        return fecha;
    }
    public String getTexto() {
        return texto;
    }
    public String getAutor() {
        return autor;
    }
    public String getAsunto() {
        return asunto;
    }
    public String getFechaLimite() {
        return fechalimite;
    }
    public String toString(){
        return mostrar();
    }

    public String mostrar(){
        return(getColorAnsi()+"\t\t\t\tFecha: "+getFecha()+"\n"+getAsunto()+
        "\n \n"+getTexto()+"\n \n"+getAutor()+"\nFecha limite: "+getFechaLimite());
    }
}
