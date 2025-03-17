public class Main {
    public static void main(String arg[]) {
        Cuadrado c= new Cuadrado("Cuadrado", 2);
        Triangulo t= new Triangulo("Triangulo", 2, 7, 4, 4);
        Trapecio tr= new Trapecio("Trapecio", 5, 4, 4, 3, 3);
        Circulo ci= new Circulo("Circulo", 4);
        System.out.println(c);
        System.out.println(t);
        System.out.println(tr);
        System.out.println(ci);


    }
}
