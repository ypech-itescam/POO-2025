package CharlyKeb.EjerciciosDeClase;

//declaración de la clase
public class Coche {
    // declaración de atributos
    private String marca;
    private String color;
    private String modelo;
    private String tipo;
    private int anio;
    private int estadoPuerta; // 1 abrir 2 cerrar
    private int estadoMotor; // 0 apagado 1 encendido
    private double velocidad; // puede depender el estado del motor estadoMovimiento si
                              // puerta es 1 y motor es 0 = 0 km

    // método constructor
    public Coche(String marca, String color, String modelo, String tipo, int anio, double velocidad) {
        setMarca(marca);
        setColor(color);
        setModelo(modelo);
        setTipo(tipo);
        this.anio = anio;// revisar
        this.estadoPuerta = 2; // Establece la puerta como cerrada por defecto
        this.estadoMotor = 0; // Establece el motor como apagado por defecto
        this.velocidad = velocidad;
    }

    // Métodos getter y setter para los atributos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "FORD" : marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.equals("") ? "Blanco" : color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.equals("") ? "Fiesta" : modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.equals("") ? "Automático" : tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int an) {
        this.anio = an;
    }

    public int getEstadoPuerta() {
        return estadoPuerta;
    }

    public void changeEstadoP(int valor) {
        this.estadoPuerta = valor;
    }

    public int getEstadoMotor() {
        return estadoMotor;
    }

    public void changeEstadoM(int IO) {
        this.estadoMotor = IO;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void changeVelocidad(double vel) {
        this.velocidad = vel;
    }

    // Otros métodos de la clase Coche

    public void abrirPuerta() {
        if (getEstadoPuerta() == 2) {
            System.out.println("La puerta está cerrada. Debes abrirla para encender el motor.");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrarPuerta() {
        if (getEstadoPuerta() == 1) {
            System.out.println("La puerta está abierta. Se cerrará ahora.");
            changeEstadoP(2); // Cambia el estado de la puerta a cerrada
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public void arrancar() {
        if (getEstadoPuerta() == 2) {
            System.out.println("La puerta está cerrada. Debes abrirla para encender el motor.");
        } else {
            changeEstadoM(1); // Enciende el motor
            System.out.println("Motor encendido.");
        }
    }

    public void acelerar() {
        if (getEstadoMotor() == 1) {
            System.out.println("Acelerando. Velocidad actual: " + getVelocidad() + " km/h");
            changeVelocidad(80); // Acelera hasta 80 km/h
        } else {
            System.out.println("Primero enciende el motor para acelerar.");
        }
    }

    public void frenar() {
        while (getVelocidad() > 0) {
            System.out.println("Frenando. Velocidad actual: " + getVelocidad() + " km/h");
            changeVelocidad(getVelocidad() - 10); // Frena en decrementos de 10 km/h
        }
        System.out.println("El coche se detuvo.");
    }
}
