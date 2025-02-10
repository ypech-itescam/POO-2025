package mariaisabeltrejomoo;
public class Nota{
    private String fechaI;
    private String tipo;
    private String cuerpoNota;
    private String fechaLimite;
    private String autor;

    public Nota (String fechaI, String tipo, String cuerpoNota, String fechaLimite, String autor){
        setFechaI(fechaI);
        setTipo(tipo);
        setCuerpoNota(cuerpoNota);
        setFechaLimite(fechaLimite);
        setAutor(autor);
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo.equals(" ")?"URGENTE":tipo;
    }

    public String getCuerpoNota() {
        return cuerpoNota;
    }

    public void setCuerpoNota(String cuerpoNota) {
        this.cuerpoNota = cuerpoNota;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite){
		this.fechaLimite=fechaLimite;
	}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor.equals(" ")?"Isabel":autor;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color=color;
    }

    public String toString(){
        return("   " + getFechaI() + "\n" + getTipo() + "\n" + getCuerpoNota() + "\nFecha limite: "+getFechaLimite() + "\n" + getAutor());
    }
}