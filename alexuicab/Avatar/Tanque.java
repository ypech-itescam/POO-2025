public class Tanque {
	private String tipo;
	private String nombre;
	private String blindaje;
	private String peso;
	private String velocidad;
	private Soldado soldadoarray[];
	private int ntripulante;

	public void Tanque(String tipo){
		soldadoarray = new Soldado[5];
		setTipo(tipo);
		getNombre();
		getBlindaje();
		getPeso();
		getVelocidad();	
	}

	public Tanque(){
		soldadoarray = new Soldado[5];
		setTipo("Pesado");
		getNombre();
		getBlindaje();
		getPeso();
		getVelocidad();	
	}

	public void setSoldado(Soldado soldado){
		if(ntripulante>=5){
			System.out.println("La capacidad del tanque se ha superado");
		}
		else{
			soldadoarray[ntripulante]= soldado;
			ntripulante++;
		}
	}

	public Soldado getSoldado(int pos){
		if (pos>=ntripulante) {
			return soldadoarray[ntripulante-1];
		}
		return soldadoarray[pos];
	}

	public void setTipo(String tipo){
		this.tipo=(tipo.equals(""))?"Ligero":tipo;
	}

	public String getTipo(){
			return tipo;
		}

	public String getBlindaje(){
		switch (tipo = tipo.toLowerCase()) {
			case "ligero":this.blindaje = "40/28/28 mm";break;
			case "medio":this.blindaje = "50/38/38 mm";break;
			case "pesado":this.blindaje = "114/50/19 mm";break;
			default:this.blindaje = "40/28/28 mm";break;
		}
		return "Blindaje: " +blindaje;
	}
	public String getPeso(){
		switch (tipo = tipo.toLowerCase()) {
			case "ligero":this.peso = "19 t";break;
			case "medio":this.peso = "32.92 t";break;
			case "pesado":this.peso = "45 t";break;
			default:this.peso = "19 t";break;
		}
		return "Peso: " +peso;
	}
	
	public String getVelocidad(){
		switch (tipo = tipo.toLowerCase()) {
			case "ligero":this.velocidad = "58 Km/h";break;
			case "medio":this.velocidad = "36 Km/h";break;
			case "pesado":this.velocidad = "56 Km/h";break;
			default:this.velocidad = "58 Km/h";break;
		}
		return "Velocidad maxima: " +velocidad;
	}
	
	public String getNombre(){
		switch (tipo = tipo.toLowerCase()) {
			case "ligero":this.nombre = "Crusader";break;
			case "medio":this.nombre ="Sherman Firefly";break;
			case "pesado":this.nombre ="T95/CHIEFTAIN";break;
			default:this.nombre = "Crusader";break;
		}
		return "Nombre: " +nombre;
	}
	
	public void avanzar(){
		System.out.println("El tanque avanza");
	}
	public void retroceder(){
		System.out.println("El tanque retrocede");
	}

	public void disparar(){
		System.out.println("El tanque dispara");
	}

	public void girarIzquierda(){
		System.out.println("El tanque gira hacia la izquierda");
	}

	public void girarDerecha(){
		System.out.println("El tanque gira hacia la derecha");
	}

	public String mostrarInfoTanque(){
		return "\n"+getNombre()+"\n"+getTipo()+"\n"+getBlindaje()+"\n"+getPeso()+"\n"+getVelocidad()+"\n";
	}

}