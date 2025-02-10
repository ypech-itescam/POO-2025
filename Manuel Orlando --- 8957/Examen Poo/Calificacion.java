public class Calificacion {
    private double cformativo;    
    private double cpractica;    
    private double csumativo;
    public Calificacion(){
        setCFormativo(8.5);
        setCPractica(9.4);
        setCSumativo(5.2);
    }  
    public Calificacion(double cform, double cprac, double csum){
        setCFormativo(cform);
        setCPractica(cprac);
        setCSumativo(csum);
    } 
    public double getCFormativo(){
        return cformativo;
    }
    public double getCPractico(){
        return cpractica;
    }
    public double getCSumativo(){
        return csumativo;
    }
    public void setCFormativo(double cform){
        this.cformativo = cform<0?6.1:cform;
    }
    public void setCPractica(double cform){
        this.cpractica = cform<0?9.2:cform;
    }
    public void setCSumativo(double cform){
        this.csumativo = cform<0?6.1:cform;
    }
    public double promedio(){
        return ((getCFormativo()*2)+(getCPractico()*3)+(getCSumativo()*5))/10;
    }
    public String toString(){
        String cadena = "La calificacion total es de " + promedio() + " de la suma de formativo: " 
        + getCFormativo() + " , practivo " + getCPractico() + " y de la sumativa " + getCSumativo();
        return cadena;
    }
}