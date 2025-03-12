public class Motor {     
    private String marca;     
    private String tipo;     
    private int hp;  

    // Constantes para los tipos de motor
    public static final String TIPO_GASOLINA = "Gasolina";
    public static final String TIPO_DIESEL = "Diésel";
    public static final String TIPO_HIBRIDO = "Híbrido";

    // Constructor
    public Motor(String marca, String tipo, int hp) {     
        setMarca(marca);     
        setTipo(tipo);     
        setHp(hp);     
    }  

    // Getter y Setter de marca
    public String getMarca() {        
        return marca;     
    }      

    public void setMarca(String marca) {     
        this.marca = marca;     
    }      

    // Getter y Setter de tipo
    public String getTipo() {         
        return tipo;     
    }      

    public void setTipo(String tipo) {     
        if (tipo.equals(TIPO_GASOLINA) || tipo.equals(TIPO_DIESEL) || tipo.equals(TIPO_HIBRIDO)) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo de motor no válido. Debe ser Gasolina, Diésel o Híbrido.");
        }
    }     

    // Getter y Setter de hp
    public int getHp() {         
        return hp;     
    }     

    public void setHp(int hp) {         
        this.hp = hp;     
    } 

    // Método para mostrar la información del motor
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("HP: " + hp);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Motor motorGasolina = new Motor("Toyota", TIPO_GASOLINA, 150);
        Motor motorDiesel = new Motor("Ford", TIPO_DIESEL, 180);
        Motor motorHibrido = new Motor("Honda", TIPO_HIBRIDO, 120);

        motorGasolina.mostrarInfo();
        System.out.println();
        motorDiesel.mostrarInfo();
        System.out.println();
        motorHibrido.mostrarInfo();
    }
}