public class Temperatura {

    private double valor;
    private char unidadDM;

    public Temperatura(double valor, char unidadDM) {
        this.valor = valor;
        this.unidadDM = unidadDM;
    }

    public double getValor() {
        return valor;
    }

    public double setValor(double t) {
        return valor;
    }

    public char getUnidadDM() {
        return unidadDM;
    }

    public char setUnidad(char u) {
        return unidadDM;
    }

    public void imprimirTemperatura() {
        System.out.println("Valor: " + valor + " " + unidadDM);
    }

    public static void main(String[] args) {

        Temperatura temperaturaInicial = new Temperatura(25.0, 'C');
        temperaturaInicial.imprimirTemperatura();
        temperaturaInicial.setValor(32.0);
        temperaturaInicial.setUnidad('F');
        temperaturaInicial.imprimirTemperatura();
    }
}