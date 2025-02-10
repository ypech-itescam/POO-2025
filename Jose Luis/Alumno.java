public class Alumno {
	private Calificacion cal;
	private Proyecto proyecto;
	private String nombre;
	private String matricula;

	public Alumno(String nom, String mat){
		setNombre(nom);
		setMatricula(mat);
		cal= new Calificacion(9.4,8.6,7.8);
		proyecto= new Proyecto("","", 2);
	}
	public String getNombre(){
		return nombre;
	}
	public String getMatricula(){
		return matricula;
	}
	public Proyecto getProyecto(){
		return proyecto;
	}
	public double getCalificacion(){
		return cal.promedio();
	}
	public void setNombre(String nom){
		this.nombre= nom.equals("")?"Jose":nom;
	}
	public void setMatricula(String mat){
		this.matricula= mat.equals("")?"8960":mat;
	}
	public void setCalificaciones(double form, double prac, double sum){
		this.cal.setCformativo(form);
		this.cal.setCpractico(prac);
		this.cal.setCsumativo(sum);
	}
	public void setCalificaciones(Calificacion cal){
		this.cal= cal;
	}
	public void setProyecto(Proyecto p){
		this.proyecto= p;
	}
	public String toString(){
		return "Nombre: "+ getNombre()+"\t"+ "Matricula: "+getMatricula()+"\t"+ "Promedio: "+ getCalificacion();
	}
}