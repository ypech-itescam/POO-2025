public class Termometro {
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private boolean esCelsius;

    public Termometro() {
        this.temperaturaMaxima = 0.0;
        this.temperaturaMinima = 0.0;
        this.esCelsius = true;
    }

    public double getTemperaturaMaxima() {
        return this.temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return this.temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public boolean esCelsius() {
        return this.esCelsius;
    }

    public void cambiarAFahrenheit() {
        if (this.esCelsius) {
            this.temperaturaMaxima = this.temperaturaMaxima * 9/5 + 32;
            this.temperaturaMinima = this.temperaturaMinima * 9/5 + 32;
            this.esCelsius = false;
        }
    }

    public void cambiarACelsius() {
        if (!this.esCelsius) {
            this.temperaturaMaxima = (this.temperaturaMaxima - 32) * 5/9;
            this.temperaturaMinima = (this.temperaturaMinima - 32) * 5/9;
            this.esCelsius = true;
        }
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setTemperaturaMaxima(30.0);
        termometro.setTemperaturaMinima(15.0);
        System.out.println("Temperatura máxima en Celsius: " + termometro.getTemperaturaMaxima());
        System.out.println("Temperatura mínima en Celsius: " + termometro.getTemperaturaMinima());
        termometro.cambiarAFahrenheit();
        System.out.println("Temperatura máxima en Fahrenheit: " + termometro.getTemperaturaMaxima());
        System.out.println("Temperatura mínima en Fahrenheit: " + termometro.getTemperaturaMinima());
    }
}
