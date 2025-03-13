public class Main2 {
    public static void main(String[] args) {
        //objeto Cuaderno
        Cuaderno miCuaderno = new Cuaderno("Rosa", "Escribe", "Nuevo");
        System.out.println("Cuaderno:");
        System.out.println("Color: " + miCuaderno.getColor());
        System.out.println("Marca: " + miCuaderno.getMarca());
        System.out.println("Estado: " + miCuaderno.getEstado());
        System.out.println("-------------------------");

        // objeto Tenis
        Tenis misTenis = new Tenis("Negro", "Puma", 0);
        System.out.println("Tenis:");
        System.out.println("Color: " + misTenis.getColor());
        System.out.println("Marca: " + misTenis.getMarca());
        System.out.println("Estado: " + (misTenis.getEstado() == 0 ? "Limpios" : "Sucios"));
        System.out.println("-------------------------");

        //  objeto Bolso
        Bolso miBolso = new Bolso("Cafe", "Chanel");
        System.out.println("Bolso:");
        System.out.println("Color: " + miBolso.getColor());
        System.out.println("Marca: " + miBolso.getMarca());
        System.out.println("-------------------------");

        // Usando los nuevos constructores
        Bolso bolsoPorDefecto = new Bolso();
        System.out.println("Bolso por defecto:");
        System.out.println("Color: " + bolsoPorDefecto.getColor());
        System.out.println("Marca: " + bolsoPorDefecto.getMarca());
        System.out.println("-------------------------");

        Cuaderno cuadernoPorDefecto = new Cuaderno();
        System.out.println("Cuaderno por defecto:");
        System.out.println("Color: " + cuadernoPorDefecto.getColor());
        System.out.println("Marca: " + cuadernoPorDefecto.getMarca());
        System.out.println("Estado: " + cuadernoPorDefecto.getEstado());
        System.out.println("-------------------------");

        Tenis tenisPorDefecto = new Tenis();
        System.out.println("Tenis por defecto:");
        System.out.println("Color: " + tenisPorDefecto.getColor());
        System.out.println("Marca: " + tenisPorDefecto.getMarca());
        System.out.println("Estado: " + (tenisPorDefecto.getEstado() == 0 ? "Limpios" : "Sucios"));
    }
}