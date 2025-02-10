public class Nota {
    private Color co;
    private String fecha;
    private String importancia;
    private String asunto;
    private String firma;
    private String fechaL;

    public Nota(Color co, String fecha, String importancia, String asunto, String firma, String fechaL){
        this.co = co;
        setFecha(fecha);
        setImportancia(importancia);
        setAsunto(asunto);
        setFirma(firma);
        setFechaL(fechaL);
    }
    public Nota(){
        this.co = new Color("white");
        setFecha("4/03/2024");
        setImportancia("NORMAL");
        setAsunto("");
        setFirma("");
        setFechaL("");
    }
    public void setFecha(String fecha){
        this.fecha= (fecha.equals(" "))?" ":fecha;
    }
    public void setImportancia(String importancia){
        this.importancia= (importancia.equals(" "))?" ":importancia;
    }
    public void setAsunto(String asunto){
        this.asunto= (asunto.equals(" "))?" ":asunto;
    }
    public void setFirma(String firma){
        this.firma= (firma.equals(" "))?" ":firma;
    }
    public void setFechaL(String fechaL){
        this.fechaL= (fechaL.equals(" "))?" ":fechaL;
    }

    public String getFecha(){
        return "               "+fecha;
    }
    public String getImportancia(){
        return importancia;
    }
    public String getAsunto(){
        return asunto;
    }
    public String getFirma(){
        return firma;
    }
    public String getFechaL(){
        return "Fecha límite: "+fechaL;
    }
    public void setColor(String color){
        co.setColor(color);

    }
    public String getColor(){
        return co.getColor();
    }
    public String toString(){
        return "\n"+co.getColorAnsi()+getFecha()+"\n"+getImportancia()+"\n"+getAsunto()+"\n"+getFirma()+"\n"+getFechaL()+"\n";
    }
}
