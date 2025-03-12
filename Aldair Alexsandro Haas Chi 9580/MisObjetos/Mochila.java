import java.util.Vector;

public class Mochila {
    private String marca;
    private double precio;
    private String color;
    private String material;

    private final Vector<Laptop> laptops = new Vector<>();
    private final Vector<Mouse> mouses = new Vector<>();

    private final int MAX_LAPTOPS = 2;
    private final int MAX_MOUSES = 2;

    public Mochila(String marca, double precio) {
        this.marca = marca.equals("") ? "Nike" : marca;
        this.precio = precio <= 0 ? 100 : precio;
        this.color = "Negro";
        this.material = "Poliester"; 
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "Nike" : marca;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio <= 0 ? 100 : precio;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color.equals("") ? "Negro" : color; 
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material.equals("") ? "Poliester" : material; 
    }
    public void abrir() {
        System.out.println("La mochila está abierta.");
        }

    public void cerrar() {
        System.out.println("La mochila está cerrada.");
        }

    public void agregar (String elemento){
        System.out.println("El elemento" + elemento + " ha sido agregado.");
        }

    public void extraer (String elemento){
        System.out.println("El elemento" + elemento + " ha sido extraido.");
        }
    @Override
        public String toString() {
            return "Mochila [Marca=" + marca + ", Precio=" + precio + ", Color=" + color + 
                   ", Material=" + material +"]";
        }

        public void agregarLaptop(Laptop laptop) {
            if (laptops.size() < MAX_LAPTOPS) {
                laptops.add(laptop);
            } else {
                System.out.println("No cabe más laptops.");
            }
        }
    
        public void agregarMouse(Mouse mouse) {
            if (mouses.size() < MAX_MOUSES) {
                mouses.add(mouse);
            } else {
                System.out.println("No cabe más mouses.");
            }
        }
    
        public void mostrarContenido() {
            System.out.println("\n Mochila " + marca + " contiene:");
            System.out.println("Laptops: " + laptops.size() + "/" + MAX_LAPTOPS);
            System.out.println("Mouses: " + mouses.size() + "/" + MAX_MOUSES);
        }
    
}