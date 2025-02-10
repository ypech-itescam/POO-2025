public class Gato{
	private String raza;
	private String color;
	private String nombre;
	private String genero;
	private int edad;
	private int estado;

	public Gato(){
		raza= "Malish";
		color= "Amarillo";
		nombre= "Whitti";
		genero= "Macho";
		edad= 5;
		estado= 5;
	}

	public String getRaza(){
		return raza;
	}

	public void setRaza(){
		this.raza=raza;
	}

	public String getColor(){
		return color;
	}

	public void setColor(){
		this.color=color;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(){
		this.nombre=nombre;
	}

	public String getGenero(){
		return genero;
	}

	public void setGenero(){
		this.genero=genero;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(){
		this.edad=edad;
	}

	public void Accion(){
		if(estado==0){
			System.out.println("*Se murio* :(");
		}
		if(estado==1){
			System.out.println("*Se va a comer*");
		}
		if(estado==2){
			System.out.println("*Duerme*");
		}
		if(estado==3){
			System.out.println("*Despierto sin hacer nada*");
		}
		if(estado==4){
			System.out.println("miau-miau-miau");
		}
		if(estado==5){
			System.out.println("*Ronrronea*");
		}
	}
}