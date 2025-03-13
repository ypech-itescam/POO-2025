public class Main {
    public static void main(String[] args) {
        // Crear un arreglo figuras geometricas
        FiguraGeometrica[] figuras = {
            new Cuadrado("Cuadrado", "Rojo", 4.0),
            new Circulo("Círculo", "Azul", 3.0),
            new Trapecio("Trapecio", "Verde", 8.0, 5.0, 4.0, 3.0, 3.0),
            new Rectangulo("Rectangulo", "Amarillo", 9.0, 4.0),
            new Triangulo("Triangulo", "Rosado", 8.0, 10.0, 4.0,4,4),

        };

        // Recorrer y mostrar cada figura
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println("----------------------------");
        }
    }
}

    
    
