package Examen;
public class Calificacion {
    private double Cformativo;
    private double Cpractico;
    private double Csumativo;

    public Calificacion(double Cformativo, double Cpractico, double Csumativo) {
        this.Cformativo = Cformativo;
        this.Cpractico = Cpractico;
        this.Csumativo = Csumativo;
    }

    public double getCformativo() {
        return Cformativo;
    }

    public void setCformativo(double Cformativo) {
        this.Cformativo = Cformativo;
    }

    public double getCpractico() {
        return Cpractico;
    }

    public void setCpractico(double Cpractico) {
        this.Cpractico = Cpractico;
    }

    public double getCsumativo() {
        return Csumativo;
    }

    public void setCsumativo(double Csumativo) {
        this.Csumativo = Csumativo;
    }

    public double calcularPromedio() {
        double promedio = (Cformativo * 0.2 + Cpractico * 0.3 + Csumativo * 0.5);
        return promedio;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Calificacion calificacion = new Calificacion(8.5, 9.0, 7.5);
        System.out.println("El promedio ponderado es: " + calificacion.calcularPromedio());
    }
}
