public class PortaLapiz{
	private String material;
	private String color;
	private String marca;
	private String forma;
	private int capacidad;

	public PortaLapiz(){
		material= "Tela";
		color= "Azul";
		marca= "Wilson";
		forma= "Rectangular";
		capacidad= 15;
	}

	public String getMaterial(){
		return material;
	}

	public void setMaterial(){
		this.material=material;
	}

	public String getColor(){
		return color;
	}

	public void setColor(){
		this.color=color;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(){
		this.marca=marca;
	}

	public String getForma(){
		return forma;
	}

	public void  setForma(){
		this.forma=forma;
	}

	public void agregarObjeto(){
		if(capacidad<15){
			System.out.println("*Agrega un objeto*");
		}
		if(capacidad==15){
			System.out.println("*Portalapiz lleno*");
		}
	}

	public void sacarObjeto(){
		if(capacidad<=15){
			System.out.println("*Saque un objeto*");
		}
		if(capacidad==0){
			System.out.println("*Portalapiz vacio*");
		}
	}
}