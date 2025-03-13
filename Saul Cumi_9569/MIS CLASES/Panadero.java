package Principal;
public class Panadero {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private int estado; // 0-Descanso      1-Trabajo


 
    //CONSTRUCTOR
    public Panadero (String nombre, int edad, int estado){
     
    }
    
    //METODOS GET
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstado() {
        return estado;
    }


    //METODOS SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = (edad <= 0 ) ? 35 : edad;
    }

    public void setEstado(int estado){
        this.estado = (estado < 0 || estado > 1) ? 1 : estado;
    }

    //METODO TOSTRING
    public String toString(){
        System.out.println("//DETALLES DE LA CLASE PANADERO//");
        return ("Nombre: " + getNombre() + "\n" + "Edad: " + getEdad() + "\n" +  "Estado: " + getEstado() +"\n");

    }




    //METODOS DE LA CLASE
    public void cambiarEstadoTrabajo() {
        System.out.println("//METODOS DEL PANADERO//");

        if (estado == 0) {
            setEstado(1);                                                   //SI descansa (0) ponerlo a chambear (1)
            System.out.println("El trabajador empezara a chambear");
        } else {
            setEstado(0);                                                   //SI trabaja(1) ponerlo a descansar (0)
            System.out.println("El trabajador pasara a tomar un descanso");
        }
    }


    
    public void disponibilidad() {
        if (estado == 1) {
            System.out.println(getNombre() + " Se encuentra horneando pan");
        } else {
            System.out.println(getNombre() + " Se encuentra atendiendo en caja" + "\n");  
        }
    }

}
