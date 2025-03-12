public class Laptop {
    private String marca;
    private String color;
    private String modelo;
    private boolean estado;
    private Mouse mouseExterno;

    public Laptop(String marca, String modelo) {
        this.marca = marca.equals("") ? "HP" : marca;
        this.modelo = modelo.equals("") ? "Victus" : modelo;  
        this.color = "Negro";  
        this.estado = false;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "HP" : marca;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color.equals("") ? "Negro" : color; 
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo.equals("") ? "Victus" : modelo;
    }

    public boolean  getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void conectarwifi(String red, String password){
        if(estado){
            System.out.println("La laptop esta apagada enciendela.");
        }
    }
    public void ajustarvolumen(String aparato_externo){
        System.out.println("Has conentado tu "+aparato_externo+" exitosamente");
    }
    public void abrirSoftware(String nombre_software){
        if(estado){
            System.out.println("Abriendo"+nombre_software);
        }
        else{
            System.out.println("La laptop esta apagada enciendela.");
        }

    }

    public void encender() {
        estado = true;
        System.out.println("Laptop " + marca + " encendida.");
    }

    public void asignarMouse(Mouse mouse) {
        this.mouseExterno = mouse;
        System.out.println("Mouse " + mouse.getMarca() + " conectado.");
    }

    public void usarMouse() {
        if (mouseExterno != null) {
            mouseExterno.clic();
        } else {
            System.out.println("No hay mouse conectado.");
        }
    }



    @Override
    public String toString() {
        return "Laptop [Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Estado=" + estado + "]";
    }

}

