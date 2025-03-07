public class Proveedor {
    
    private String nombre;
    private String direccion;
    private String telefono;

    public Proveedor(String nombre, String direccion, String telefono){
       setNombre(nombre);
       setDireccion(direccion);
       setTelefono(telefono);
    }

    public String getNombre(){ return nombre;}
    public String getdireccion(){return direccion;}
    public String getTelefono(){return telefono;}

    public void setNombre(String nombre){
        if(nombre== null || nombre.isEmpty()){
            this.nombre = "Provedor";
        }else{
            this.nombre = nombre;
        }
    }

    public void setDireccion(String direccion){
        if(direccion == null|| direccion.isEmpty()){
            this.direccion = "S-DIRECCION";
        }else{
            this.direccion = direccion;
        }
    }

    public void setTelefono(String telefono){
       if(telefono == null || telefono.isEmpty()){
            this.telefono = "S-TELEFONO";
       }else{
            this.telefono = telefono;
       }
    }


}
