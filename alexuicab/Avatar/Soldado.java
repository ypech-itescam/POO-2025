public class Soldado {
	private String nombre;
	private String nacionalidad;
	private String edad;
	private String rango;

	public Soldado(String nombre, String nacionalidad){
		setNombre(nombre);
		setNacionalidad(nacionalidad);
		setEdad("30");
		setRango("Cabo");
	}

	public Soldado(){
		setNombre("Alex");
		setNacionalidad("Mexicana");
		setEdad("30");
		setRango("Cabo");
	}

	public void setNombre(String nombre){
		this.nombre = (nombre.equals(" "))?"Jhon David":nombre;
	}

	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = (nacionalidad.equals(" "))?"USA":nacionalidad;
	}

	public void setEdad(String edad){
		this.edad = (edad.equals(" "))?"30":edad;
	}

	public void setRango(String rango){
		this.rango = (rango.equals(" "))?"Cabo":rango;
	}

	public String getNombre(){
		return nombre;
	}

	public String getNacionalidad(){
		return nacionalidad;
	}

	public String getEdad(){
		return edad;
	}

	public String getRango(){
		return rango;
	}

	public void caminar(){
		System.out.println("El soldado camina");
	}

	public void correr(){
		System.out.println("El soldado corre");
	}

	public void saltar(){
		System.out.println("El soldado da un salto");
	}

	public void cubrir(){
		System.out.println("El soldado se cubre");
	}

	public void huir(){
		System.out.println("El soldado huye");
	}

	public void usarArma(){
		System.out.println("El soldado utiliza un arma");
	}

	public String toString(){
		return "\n"+ getNombre()+"\n"+getNacionalidad()+"\n"+getEdad()+"\n"+getRango();
	}

}