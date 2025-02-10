public class Main {
	public static void main(String[] args){
	Proyecto p= new Proyecto("proyect3","20/02/2024", 2);
	Calificacion c= new Calificacion(9.4,3.6,2.8);
	Alumno a= new Alumno("Jose","8960");
	System.out.print(p.toString());
	System.out.println("");
	System.out.println("");
	a.setCalificaciones(c);
	a.setProyecto(p);
	System.out.println(a);
	}
}