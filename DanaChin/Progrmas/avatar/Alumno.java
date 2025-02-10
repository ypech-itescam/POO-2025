package Examen;

public class Alumno {
    private String nombre;
    private String matricula;
    private Calificacion calificacion;
    private Proyecto proyecto;

    public Alumno(String nombre, String matricula, Calificacion calificacion, Proyecto proyecto) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto de ejemplo", "20 de marzo del 2023", 30);
        Calificacion calificacion = new Calificacion(8.5, 9.0, 7.5);

        Alumno alumno = new Alumno("Juan Perez", "12345", calificacion, proyecto);

        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Matrícula del alumno: " + alumno.getMatricula());
        System.out.println("Proyecto del alumno: " + alumno.getProyecto().getNombre());
        System.out.println("Fecha de inicio del proyecto del alumno: " + alumno.getProyecto().getFechaInicio());
        System.out.println("Duración del proyecto del alumno (en días): " + alumno.getProyecto().getDuracion());
        System.out.println("Calificación del alumno: " + alumno.getCalificacion().calcularPromedio());
    }
}

