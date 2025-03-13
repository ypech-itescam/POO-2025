public class Main {
    public static void main(String[] args) {
        // Creando objetos
        Celular celular1 = new Celular("Samsung", "Negro", 2, "Galaxy S21", 1);
        System.out.println(celular1);

        Celular celular2 = new Celular("Iphone", "Azul", 1, "Oled", 2);
        System.out.println(celular2);

        Television tv1 = new Television("LG", "Gris", 2, 55, "OLED55", 1);
        System.out.println(tv1);

        Television tv2 = new Television("Smart", "Gris", 2, 55, "Neo QLED", 2);
        System.out.println(tv2);

        Lapicero lapicero1 = new Lapicero("BIC", "Azul", "Largo", 1);
        System.out.println(lapicero1);

        Lapicero lapicero2 = new Lapicero("Pilot", "Azul", "Largo", 2);
        System.out.println(lapicero2);
    }
}
