public class Calificacion {
	private double cformativo;
	private double cpractico;
	private double csumativo;

	public Calificacion(){
		setCformativo(8.2);
		setCpractico(9.8);
		setCsumativo(5.4);
	}
	public Calificacion(double cform, double cprac, double csum){
		setCformativo(cform);
		setCpractico(cprac);
		setCsumativo(csum);
	}
	public double getCformativo(){
		return cformativo;
	}
	public double getCpractico(){
		return cpractico;
	}
	public double getCsumativo(){
		return csumativo;
	}
	public void setCformativo(double cform){
		this.cformativo= cform<(0)?(5.5):cform;
	}
	public void setCpractico(double cform){
		this.cpractico= cform<(0)?(4.2): cform;
	}
	public void setCsumativo(double cform){
		this.csumativo= cform<(0)?(5.3):cform;
	}
	public double promedio(){
		double promedio= getCformativo()*0.20 + getCpractico()*0.30 + getCsumativo()*0.50;
		return promedio;
	}
	public String toString(){
		return "Promedio= "+ promedio();
	}
}