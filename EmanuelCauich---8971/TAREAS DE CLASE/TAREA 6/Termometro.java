public class Termometro {
    private double temperatura;
    public Termometro(double temperatura){
        setTemperatura(temperatura);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void mostrarTemperatura() {
        System.out.println("La temperatura es: " + temperatura + " grados Celsius");
        System.out.println("Temperatura en Fahrenheit: " + convertirAFahrenheit());
        System.out.println("Temperatura en Kelvin: " + convertirAKelvin());
    }

    public double convertirAFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }

    public double convertirAKelvin() {
        return temperatura + 273.15;
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro(20);

        termometro.mostrarTemperatura();
    }
}