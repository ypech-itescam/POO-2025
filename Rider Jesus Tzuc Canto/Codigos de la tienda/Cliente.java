public class Cliente {
    private String nombre;
    private Venta venta;
    public Cliente(String nombre,Venta venta){
        setnombre(nombre);
        setVenta(venta);
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=(nombre.equals(""))?"no definido":nombre;
    }
    public Venta getVenta(){
        return venta;
    }
    public void setVenta(Venta venta){
        this.venta=venta;
    }




    
}
