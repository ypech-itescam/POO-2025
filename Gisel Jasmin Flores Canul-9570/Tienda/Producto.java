public class Producto {
    private String nombre;
    private double precio;
    private int stock;

   
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

  
    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getstock() {
        return stock;
    }

  
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public void setstock(int stock) {
        this.stock = stock;
    }

    public boolean actualizarStock (int stock){
        if (stock >= stock){
            stock -= stock;
            return true;
        } else {
            System.out.println("No hay stock suficiente de: " + getnombre());
            return false;
        }

        }
        
    

    public String toString(){
        return "Producto: \n\r -Nombre: " + getnombre() + "\n\r -Precio: "+ getprecio() + "\n\r -Stock: " + getstock();
    }

}


