package Principal;
public class Horno {
    //ATRIBUTOS
    private boolean estado; // False-Horno apagado          True-Horno encendido
    private double temperatura;

    //CONSTRUCTOR
    public Horno (boolean estado, double temperatura){

    }

    //METODO GET

    public boolean getEstado(){
        return estado;
    }

    public double getTemperatura(){
        return temperatura;
    }


    //METODOS SET
    public void setEstado(boolean estado){
        this.estado = (estado == false) ? true : estado;
    }

    public void setTemperatura(double temperatura){
    this.temperatura = (temperatura < 0 || temperatura > 300) ? 200 : temperatura;
    }


    //METODO TOSTRING

    public String toString(){
        System.out.println("//DETALLES DE LA CLASE HORNO");
        return ("Estado: " + getEstado()+ "\n" + "Temperatura: " + getTemperatura() + "C°" + "\n");
    }


    public void cambiarEstadoHorno() {
        System.out.println("//METODOS DE LA CLASE HORNO//");
        if (estado == false) {
            setEstado(true);                    //APAGADO - ENCENDER (TRUE)
            System.out.println("El horno se encuentra encendido.");
        } else {
            setEstado(false);                   //ENCENDIDO - APAGAR (FALSE)
            System.out.println("El horno se encuentra apagado completamente.");
        }
    }
    
    
    public void ajustarTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= 0 && nuevaTemperatura <= 300) {
            setTemperatura(nuevaTemperatura);          //CAMBIAR TEMPERATURA
            System.out.println("La temperatura del horno es ahora: " + nuevaTemperatura + "C°.");
        } else {
            System.out.println("La temperatura debe estar entre 0 y 300 grados Celsius.");
        }
    }
}
