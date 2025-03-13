package Principal;
public class Pan {
    //ATRIBUTOS
    private String tipo;
    private boolean estado;         //False-Preparado              True-Horneado
    private double peso;

    //CONSTRUCTOR
    public Pan (String tipo, boolean estado, double peso){

    }

    //METODOS GET
    public  String getTipo(){
        return tipo;
    } 

    public boolean getEstado(){
        return estado;
    }

    public double getPeso(){
        return peso;
    }

    //METODOS SET

    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public void setEstado(boolean estado){
        this.estado = (estado == false) ? true : estado;
    }

    public void setPeso(double peso){
        this.peso = (peso < 0 || peso > 300) ? 250 : peso;
    }

    //METODO TOSTRING 
    public String toString(){
        
        System.out.println("//DETALLES DE LA CLASE PAN//");
        return ("Tipo: "  + getTipo() + "\n" + "Estado: " + getEstado() + "\n" + "Peso: " + getPeso() + "gm" + "\n");
    }



    public void hornear() {
        System.out.println("//METODOS DE LA CLASE PAN//");

        if (!estado) {                                                          // Pan aun sin hornear (False)
            setEstado(true);                                            // Horneado (true)
            System.out.println("El pan ya ha sido horneado.");
        } else {
            System.out.println("El pan aun no esta para el horno");
        }
    }

    public void ajustarPeso(double cantidad) {
        if (peso + cantidad >= 0) {
            setPeso(peso + cantidad); 
        System.out.println("Nuevo peso del pan: " + peso + " gm." + "\n");
        } else {
            System.out.println("No se puede reducir el peso a un valor negativo.");
        }
    }
    
    
}
