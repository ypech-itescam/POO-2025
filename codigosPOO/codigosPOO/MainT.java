public class MainT {
    public static void main(String[] args) { 
        Termometro termometro = new Termometro();
        termometro.mostrarTemp();

        termometro.cambioFarengei();
        termometro.mostrarTemp();

        termometro.cambioKelvin();
        termometro.mostrarTemp();
    }
}
