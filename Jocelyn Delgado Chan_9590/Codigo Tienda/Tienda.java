public class Tienda {
    
    private String nombre;
    private String direccion;

    public Tienda(String nombre,String direccion ){
        setNombre(nombre);
        setDireccion(direccion);
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
       if (direccion == null || direccion.isEmpty()) {
            this.direccion = "S-D";
       } else {
        this.direccion = direccion;
       }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "TIENDA";
        } else {
            this.nombre = nombre;
        }
    }

    public String toString(){
        return "Nombre: "+getNombre()+" Direccion: "+getDireccion();
        
    }
}
