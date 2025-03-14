public class Cliente {
    private String nombreCliente;


    public Cliente(String nombre, String telefono){
        setNombre(nombre);
        
    }
    
    //Getters

    public String getNombreCliente() { 
        return nombreCliente; 
    }

    //Setters
    
    public void setNombre(String nombre) {
        if(nombre== null|| nombre.isEmpty()){
             this.nombreCliente = "CLIENTE -";
        }else{
        this.nombreCliente = nombre;}
    }
    public String toString(){
        return "NombreCliente:" + getNombreCliente();
        }

       
    }

