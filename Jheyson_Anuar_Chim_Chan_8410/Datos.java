class Datos{
    private String marca;
    private boolean estado;
    private int temperatura_actual;
    private int temperatura_maxima;
    private int temperatura_minima;
        
    
    public void setTemp_actual(int temperatura_actual){
        this.temperatura_actual = temperatura_actual;
    }
    public void setTemp_maxima(int temperatura_maxima){
        this.temperatura_maxima = temperatura_maxima;
    }
    public void setTemp_minima (int temperatura_minima){
        this.temperatura_minima = temperatura_minima;        
    }
     public int getTemp_actual(){
        return temperatura_actual;
     }
     public int getTemp_maxima(){
        return temperatura_maxima;
     }
     public int getTemp_minima(){
        return temperatura_minima;
     }

}

class Temperatura{
    private int valor;
    private char unidad;
    private boolean convertir;

    public void setvalor( int valor){
        this.valor= valor;
    }
    public void setunidad( char unidad){
        this.unidad= unidad;
        // == 'F'|| = 'c' ||unidad ='k'?unidad:'c'; 
    }
    public int getvalor(){
        return valor;
    }
    public char getunidad(){
        return unidad;
    }


}