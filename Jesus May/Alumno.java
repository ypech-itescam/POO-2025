public class Alumno{
	int id;
	String nombre;
	String apellido;

	public Alumno(){
	}

	public Alumno(int id, String nombre, String apellido){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void mostrarNombre(){
		System.out.println("Hola soy un alumno y se decir mi nombre");
	}


	public void saberAprobado (double calificacion){
		if (calificacion >=6){
			System.out.println("aprobe");
		}
		else{
			System.out.println("uyy no aprobe");
		}
	}


	public static void mostrarAlumno(String []args) {
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno(4, "Juan", "Chan");
	
		System.out.println("la id del alumno 2 es: " + alumno2.getId());
		System.out.println("el nombre del alumno es: " + alumno2.getNombre());
		System.out.println("el apellido del alumno es: " + alumno2.getApellido());
	
		alumno1.setId(8);
		alumno1.setNombre("fernando");
		alumno1.setApellido("keb");
	
		System.out.println("-----------------------------------------------------");
		System.out.println("la id del alumno 1 es: " + alumno1.getId());
		System.out.println("el nombre del alumno es: " + alumno1.getNombre());
		System.out.println("el apellido del alumno es: " + alumno1.getApellido());
	
		//cambiamos el valor//
		System.out.println("-----------------------------------------------------");
		alumno2.setId(84);
		System.out.println("la id del alumno 2 es: " + alumno2.getId());
		System.out.println("el nombre del alumno es: " + alumno2.getNombre());
		System.out.println("el apellido del alumno es: " + alumno2.getApellido());
	}
}