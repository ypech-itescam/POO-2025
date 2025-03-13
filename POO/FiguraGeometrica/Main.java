public class Main {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado("Cuadrado", "Azul", 5);
        c.setLado(4);
        System.out.println(c);
        Triangulo t = new Triangulo("Iscoseles", "", 5, 5, 10, 15);
        System.out.println(t);
        Circulo circulo = new Circulo("Circulo", "Verde", 4);
        System.out.println(circulo);
    }
}
