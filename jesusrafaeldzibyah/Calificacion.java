public class Calificacion {
    private double ceval1;
    private double ceval2;
    private double ceval3;

    public Calificacion(double ceval1, double ceval2, double ceval3){
        setCeval1(ceval1);//20%
        setCeval2(ceval2);//30%
        setCeval3(ceval3);//50%
    }
    public Calificacion(){
        setCeval1(0);
        setCeval2(0);
        setCeval3(0);
    }

    public double getCeval1(){
        return ceval1;
    }
    public double getCeval2(){
        return ceval2;
    }
    public double getCeval3(){
        return ceval3;
    }
    public void setCeval1(double ceval1){
        this.ceval1=(ceval1>=0.00 && ceval1<=10.00)?ceval1:0.00;
    }
    public void setCeval2(double ceval2){
        this.ceval2=(ceval2>=0.00 && ceval2<=10.00)?ceval2:0.00;
    }
    public void setCeval3(double ceval3){
        this.ceval3=(ceval3>=0.00 && ceval3<=10.00)?ceval3:0.00;
    }

    public double promedio(){
        return (getCeval1()+getCeval2()+getCeval3())/3;
    }
    public String toString(){
        return "\nCalificacion de evaluador 1: "+getCeval1()+"\nCalificacion de evaluador 2: "+getCeval2()+"\nCalificacion de evaluador 3: "+getCeval3();
    }

}
