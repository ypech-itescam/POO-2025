public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(){
        this("No hay nombre de cliente");
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Cliente \n\r -Nombre: " + getnombre();
    }

  
}
