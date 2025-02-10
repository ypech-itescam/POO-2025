public class Nota extends Color {
    private String fecha;
    private String texto;
    private String autor;
    private String asunto;
    private String fechaLimite;

    //constructor:
    public Nota(String fecha, String texto, String autor, String asunto, String fechaLimite,String color){
        super(color);
        setFecha(fecha);
        setTexto(texto);
        setAutor(autor);
        setAsunto(asunto);
        setFechaLimite(fechaLimite);

    }

    //sets:

    public void setFecha(String fecha) {
        this.fecha = fecha.equals("")?"3/03/2024":fecha;
    }
    public void setTexto(String texto) {
        this.texto = texto.equals("")?"Hola":texto;
    }
    public void setAutor(String autor) {
        this.autor = autor.equals("")?"Paquito":autor.toUpperCase();
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto.equals("")?"Saludo":asunto.toUpperCase();
    }
    public void setFechaLimite(String fechalim) {
        this.fechaLimite = fechaLimite.equals("")?"3/03/2025":fechaLimite;
    }

    //gets
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
        return fechaLimite;
    }

    public String imprimir(){
        return(getColorAnsi()+"\t\t\t\tFecha: "+getFecha()+"\n"+getAsunto()+
        "\n \n"+getTexto()+"\n \n"+getAutor()+"\nFecha Limite: "+getFechaLimite());
    }
    public String espacio(){
        return"\n";
    }
}