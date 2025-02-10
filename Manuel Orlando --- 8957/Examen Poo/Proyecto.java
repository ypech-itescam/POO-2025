public class Proyecto {
    private String nombre;
    private String fechaini;
    private int duracion;

    public Proyecto(String nombre, String fechaini, int duracion) {
        setNombre(nombre);
        setFechaIni(fechaini);
        setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaIni() {
        return fechaini;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Manuel" : nombre;
    }

    public void setFechaIni(String fecha) {
        this.fechaini = fecha.equals("") ? "10/06/2024" : fecha;
    }

    public void setDuracion(int d) {
        this.duracion = d < 0 ? 10 : d;
    }

    public String toString() {
        String texto = "El nombre del proyecto es " + getNombre() 
        + " donde inicio en la fecha de " + getFechaIni()
        + " que tiene " + getDuracion() + " dias.";
        return texto;
    }
}
