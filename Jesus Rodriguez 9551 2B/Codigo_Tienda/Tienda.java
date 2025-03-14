public class Tienda {
    
    private String nombreTienda;
    private String direccion;

    public Tienda(String nombre,String direccion ){
        setNombre(nombre);
        setDireccion(direccion);
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreTienda() {
        return nombreTienda;
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
            this.nombreTienda = "TIENDA";
        } else {
            this.nombreTienda = nombre;
        }
    }

    public String toString(){
        return "NombreTienda: "+getNombreTienda()+" \n\r Direccion: "+getDireccion();
        
    }
}
