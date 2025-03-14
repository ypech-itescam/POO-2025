public class Laptop {
    private String marca;
    private String modelo;
    private String procesador;
    private int ram;
    private int discoDuro;
    private String color;

    public Laptop(String marca, String modelo, String procesador, int ram, int discoDuro, String color) {
        setMarca(marca);
        setModelo(modelo);
        setProcesador(procesador);
        setRam(ram);
        setDiscoDuro(discoDuro);
        setColor(color);
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }


    public String getColor() {
        return color;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Marca: " + getMarca() + "\n\r Modelo: " + getModelo() + "\n\r Procesador: " + getProcesador() + "\n\r Ram: " + getRam() + "\n\r DiscoDuro: " + getDiscoDuro()  +  "\n\r Color: " + getColor();
    }



    }

