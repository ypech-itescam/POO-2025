public class Producto{
    private String nombre;//Atributos
    private double precio;
    private int cantidad;

    //Metodo Constructor
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Metodo del get y set del nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre.equals("")){
            this.nombre = "Galletas";
        }else{
            this.nombre = nombre;
        }
    }
    //Metodo get y set del precio
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        if(precio == 0){
            this.precio = 18;
        }else{
            this.precio = precio;
        }
    }
    //Metodo get y set de la cantidad
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        if(cantidad == 0){
            this.cantidad = 3;
        }else{
            this.cantidad = cantidad;
        }
    }
    //Metodo toString
    public String toString(){
        return "\nProducto : "+nombre+"\nPrecio : "+precio+"\nCantidad : "+cantidad+"\nTotal : "+calcularTotal();
    }
    //Metodo para calcular el total
    public double calcularTotal(){
        return (cantidad * precio);
    }
    public void add(Producto producto, int cantidad) {
        
    }
   
   
    
}