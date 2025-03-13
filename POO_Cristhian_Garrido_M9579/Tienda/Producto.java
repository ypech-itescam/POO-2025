package Tienda;

public class Producto{
    private String nombre;//Nombre del producto
    private double precio;//Precio del producto
    private int cantidad;//Cantidad del producto stock

    //Metodo constructor
    public Producto(String nombre, double precio, int cantidad){
        setNombre(nombre);//Asignamos el valor del nombre
        setPrecio(precio);//Asignamos el valor de precio
        setCantidad(cantidad);//Asignamos la cantidad del stock
    }
    //Metodos get
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    //Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"No especificado":nombre;
    }
    public void setPrecio(double precio){
        this.precio=(precio <= 0.0)?15.0:precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad=(cantidad <= 0)?3:cantidad;
    }
    //Metodo para aumentar cantidad
    public void aumentarCantidad(int cantidad){
        if(cantidad >= cantidad){
            this.cantidad += cantidad;
            System.out.println("Producto agregado");
        }
    }
     // Método toString sin parámetros (por defecto)
     @Override
     public String toString() {
         return "Producto: " + nombre + "\r\n" +
                "Precio: " + precio + ", Cantidad disponible: " + cantidad;
     }
 
   
    //Metodo toString
    public String toString(int cantidadCompra) {
        return "Producto: " + nombre + "\r\n" +
               "Precio: " + precio + ", Cantidad disponible: " + cantidad + 
               ", Cantidad a comprar: " + cantidadCompra;
    }
}