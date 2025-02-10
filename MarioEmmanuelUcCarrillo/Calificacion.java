public class Calificacion {
    private double ceval1;
    private double ceval2;
    private double ceval3;

    public Calificacion(double ceval1, double ceval2, double ceval3){
        this.ceval1 = ceval1;
        this.ceval2 = ceval2;
        this.ceval3 = ceval3;
    } 

    public double getCEval1(){
        return ceval1;
    }

    public double getCEval2(){
        return ceval2;
    }

    public double getCeval3(){
        return ceval3;
    }

    public void setCEval1(double ceval1){
        this.ceval1 = ceval1;
    }

    public void setCEval2(double ceval2){
    this.ceval2 = ceval2;
    }

    public void setCEval3(double ceval3){
    this.ceval3 = ceval3;
    }

    public double promedio(){ 
        return (ceval1 + ceval2 + ceval3) / 3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Calificacion: " + promedio(); 
    }

    public static void main(String[] args) {
        Calificacion mCalificacion = new Calificacion(9, 9, 9);
        System.out.println(mCalificacion);
    }
}
