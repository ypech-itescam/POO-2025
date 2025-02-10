package Examen;

public class Proyecto {
    private String nombre;
    private String fechaInicio;
    private int duracion; 

    public Proyecto(String nombre, String fechaInicio, int duracion) {
       setDuracion(duracion);
       setFechaInicio(fechaInicio);
       setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    
    }
}
