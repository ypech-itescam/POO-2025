public class Proyecto {
    private String nombre;
    private String fechaini;
    private int duracion;
    private int nivel;
    private Calificacion cal;

    public Proyecto(String nombre, String fechaini, int duracion){
        setNombre(nombre);
        setFechaIni(fechaini);
        setDuracion(duracion);
        setNivel(0);
        this.cal=new Calificacion();
    }

    public String getNombre(){
        return nombre;
    }
    public String getFechaIni(){
        return fechaini;
    }
    public int getDuracion(){
        return duracion;
    }
    public int getNivel(){
        return nivel;
    }
    public double getCalificacionProyecto() {
        double calp=cal.promedio()/2;
        switch(nivel){
            case 0: calp+=2;break;
            case 1: calp+=3;break;
            case 2: calp+=4;break;
            case 3: calp+=5;break;
        }
        return calp;
    }
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"Sin nombre":nombre;

    }
    public void setFechaIni(String fecha){
        fechaini=fecha.equals("")?"Sin fecha inicial":fecha;

    }
    public void setDuracion(int d){
        duracion=(d<=0)?0:d;

    }
    public void setNivel(int nivel) {
        this.nivel =(nivel>=0 && nivel<=3)?nivel:0;
    }
    public void setCalificacion(Calificacion cal) {
        this.cal = cal;
    }
    public void setCalificacion(double eval1, double eval2, double eval3) {
        cal.setCeval1(eval1);
        cal.setCeval2(eval2);
        cal.setCeval3(eval3);
    }

    public String toString(){
        return "nombre del proyecto: " + getNombre() +"\nFecha inicial: " + getFechaIni() + "\nDuracion: " + getDuracion()+" dias"+
        "\nCalificacion del proyecto: "+getCalificacionProyecto()+"\n\nCALIFICACION DE LOS EVALUADORES"+cal;
    }
}
