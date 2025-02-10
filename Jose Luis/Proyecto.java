public class Proyecto {
	private String fechaini;
	private String nombre;
	private int duracion;

	public Proyecto(String nombre, String fechaini, int duracion){
		setNombre(nombre);
		setFechaini(fechaini);
		setDuracion(duracion);
	}
	public String getNombre(){
		return nombre;
	}
	public String getFechaini(){
		return fechaini;
	}
	public int getDuracion(){
		return duracion;
	}
	public void setNombre(String nombre){
		this.nombre= nombre.equals("")?"Proyecto#1":nombre;
	}
	public void setFechaini(String fecha){
		this.fechaini= fecha.equals("")?"20/03/2024":fecha;
	}
	public void setDuracion(int d){
		this.duracion= d<=(0)?(3):d;
	}
	public String toString(){
		return "Nombre: "+ getNombre()+" Duracion: "+ getDuracion()+"\t"+" Fecha inicial: "+ getFechaini();
	}
}