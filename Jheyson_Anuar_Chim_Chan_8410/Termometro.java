public class Termometro{
    public static void main(String [] args){
        Datos termometro = new Datos();
        Temperatura temperatura = new Temperatura();

        termometro.setTemp_actual(23);
        temperatura.setunidad('C');
        temperatura.setvalor(34);
    

        System.out.println("===============================");
        System.out.println( "la temperatura actual es de: " + temperatura.getvalor() + "° " +temperatura.getunidad());
        System.out.println("");
    }
}

