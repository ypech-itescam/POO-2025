public class Alumno {
    private String matricula;
    private String nombre;
    private Calificacion cal;
    private Proyecto proyecto;
    public Alumno(String mat, String nom){
        setMatricula("8957");
        setNombre("Manuel Orlando Keb Ortiz");
        setCalificaciones(8.9, 8.4, 6.6);
        proyecto = new Proyecto("Proyecto 1", "08/06/2024", 10);
        setProyecto(proyecto);
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula.equals("")?"8957":matricula;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Manuel Orlando Keb Ortiz":nombre;
    }
    public double getCalificacion(){
        return cal.promedio();
    }
    public void setCalificaciones(double form, double prac, double sum){
        cal = new Calificacion(form, prac, sum);
        /*cal.setCFormativo(form);
        cal.setCPractica(prac);
        cal.setCSumativo(sum);*/
    }
    public void setCalificaciones(Calificacion cal){
        this.cal = cal;
    }
    public void setProyecto(Proyecto p){
        this.proyecto = p;
    }
    public Proyecto getProyecto(){
        return proyecto;
    }
    public String toString(){
        String text = "El alumno de nombre " + getNombre() + " y de matricula " + getMatricula() 
        + " tuvo una calificacion de " + getCalificacion() + " y tiene el proyecto " + getProyecto();
        return text;
    }
}
