public class Calculadora {
    private String marca;
    private boolean encendida;

    public Calculadora(String marca, boolean encendida){
        this.marca = marca.equals("")?"CASIO": marca;
        this.encendida = encendida;
    }

    public void setMarca(String marca){
        this.marca = marca.equals("")?"CASIO": marca;
    }

    public void setEncendida(boolean encendida){
        this.encendida = encendida;
    }

    public String getMarca(){
        return marca;
    }

    public boolean isEncendida(){
        return encendida;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }
    
    public int sumaInt2(int v1, int v2){
        if(encendida == true){return v1 + v2;} 
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public double sumaDouble(double d1, double d2){
        if(encendida == true){return d1 + d2;}
        else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

    public int sumaInt3(int b1, int b2, int b3){
        if(encendida == true){return b1 + b2 + b3;}
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public int restaInt2(int v1, int v2){
        if(encendida == true){return v1 - v2;}
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public double restaDouble(double d1, double d2){
        if(encendida == true){return d1 - d2;}
        else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

    public int restaInt3(int b1, int b2, int b3){
        if(encendida == true){return b1 - b2 - b3;}
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public int multiplicacionInt2(int v1, int v2){
        if(encendida == true){return v1 * v2;}
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public double multiplicacionDouble(double d1, double d2){
        if(encendida == true){return d1 * d2;}
        else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

    public int multiplicacionInt3(int b1, int b2, int b3){
        if(encendida == true){return b1 * b2 * b3;}
        else{System.out.println("La calculadora esta apagada"); return 0;}
    }

    public double divisionInt2(int dividendo, int divisor) {
       if(encendida == true){return (double) dividendo / divisor;}
       else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

    public double divisionDouble(double dividendo, double divisor) {
        if(encendida == true){return dividendo / divisor;}
        else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

    public double divisionInt3(int dividendo, int divisor1, int divisor2) {
        if(encendida == true){return (double)(dividendo / divisor1) / divisor2;}
        else{System.out.println("La calculadora esta apagada"); return 0.0;}
    }

}
