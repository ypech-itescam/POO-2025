public class Termometro {
    private String marca;
    private int tempMaxima;
    private int tempMinima;
    private int tempActual;
    private char temperatura;

    public Termometro(String marca, int tempMaxima, int tempMinima, int tempActual, char temperatura) {
        setMarca(marca);
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempActual = tempActual;
        this.temperatura = temperatura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.equals(" ") ? "BEURER" : marca;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public int getTempMinima() {
        return tempMinima;
    }

    public void setTempMinima(int tempMinima) {
        this.tempMinima = tempMinima;
    }

    public int getTempActual() {
        return tempActual;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    public char getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(char temperatura) {
        this.temperatura = temperatura;
    }

    public void conversorTemp() {

    }

    public void mostrarTemp() {

    }

    public static void main(String[] args) {
        // Aquí puedes realizar alguna prueba de tu clase Termometro
        // Por ejemplo:
        Termometro termometro = new Termometro("BEURER", 42, 10, 35, 'C');
        System.out.println("Marca: " + termometro.getMarca());
        System.out.println("Temperatura máxima: " + termometro.getTempMaxima());
        System.out.println("Temperatura mínima: " + termometro.getTempMinima());
        System.out.println("Temperatura actual: " + termometro.getTempActual());
        System.out.println("Unidad de temperatura: " + termometro.getTemperatura());
    }
}
