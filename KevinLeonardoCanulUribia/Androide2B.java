public class Androide2B{
	private String genero;
	private String modelo;
	private String colorCabello;
	private String colorVestimenta;
	private int blackBox;
	private double altura;
	private double peso;
	private int nivel;

	public Androide2B(){
		genero= "Modelo Femenino";
		modelo= "2B";
		colorCabello= "Blanco";
		colorVestimenta= "Negro";
		blackBox= 1;
		altura= 1.68;
		peso= 148.8;
		nivel= 36;
	}

	public String getGenero(){
		return genero;
	}

	public void setGenero(){
		this.genero=genero;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(){
		this.modelo=modelo;
	}

	public String getColorCabello(){
		return colorCabello;
	}

	public void setColorCabello(){
		this.colorCabello=colorCabello;
	}

	public String getColorVestimenta(){
		return colorVestimenta;
	}

	public void setColorVestimenta(){
		this.colorVestimenta=colorVestimenta;
	}

	public double getAltura(){
		return altura;
	}

	public void setAltura(){
		this.altura=altura;
	}

	public double getPeso(){
		return peso;
	}

	public void setPeso(){
		this.peso=peso;
	}

	public int getNivel(){
		return nivel;
	}

	public void setNivel(){
		this.nivel=nivel;
	}

	public void funcionamiento(){
		if(blackBox==1){
			System.out.println("Androide listo para cumplir con su mision");
		}
		if(blackBox==0){
			System.out.println("Androide muerto en accion");
		}
	}
}