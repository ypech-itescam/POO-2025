package CharlyKeb.EjerciciosDeClase;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double altura;
    private double peso;
    private int estado;

    public Perro(String nombre, String raza, int edad, double altura, double peso) {
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
        this.estado = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Chucho" : nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza.equals("") ? "Malix" : raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = this.edad == 0 ? 2 : edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = this.altura == 0 ? 60 : altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = this.peso == 0 ? 12 : peso;
    }

    // ________________________________________________________________

    public int getEstado() {
        return estado;
    }

    private void changeEstado(int valor) {
        this.estado = this.estado > 0 ? 1 : valor;
    }

    public void ladrar() {
        if (getEstado() > 0) {
            System.out.println("Guau, guau, guau, guau, guau");
        } else {
            System.out.println("Estoy con diosito");
        }
    }

    public void oir(String instruccion) {
        switch (instruccion) {
            case "ladrar":
                ladrar();
            case "morder":
                morder();
            case "comer":
                saltar();
                comer("panucho");
        }
    }

    public void morder() {
        System.out.println("sdnanflkasnckancljdlnckwan");
    }

    public void saltar() {
        System.out.println("Estoy saltando");
    }

    public void comer(String comida) {
        System.out.println("Que rico " + comida);
    }

    public void morir() {
        System.out.println("Adios mundo cruel");
        changeEstado(0);
    }

}