public class FiguraGeometrica {

    public void calcularCuadrado() {
        System.out.println("=== Cuadrado ===");
        System.out.print("Ingrese el lado: ");
        double lado = leerDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

       
    }

    public void calcularTriangulo() {
        System.out.println("=== Triangulo ===");
        System.out.print("Ingrese la base: ");
        double base = leerDouble();
        System.out.print("Ingrese la altura: ");
        double altura = leerDouble();

        double area = (base * altura) / 2;
        double perimetro = base * 3;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        
    }

    public void calcularRectangulo() {
        System.out.println("=== Rectangulo ===");
        System.out.print("Ingrese la base: ");
        double base = leerDouble();
        System.out.print("Ingrese la altura: ");
        double altura = leerDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
    }

    public void calcularTrapecio() {
        System.out.println("=== Trapecio ===");
        System.out.print("Ingrese la base mayor: ");
        double baseMayor = leerDouble();
        System.out.print("Ingrese la base menor: ");
        double baseMenor = leerDouble();
        System.out.print("Ingrese la altura: ");
        double altura = leerDouble();

        double area = ((baseMayor + baseMenor) * altura) / 2;
        double perimetro = baseMayor + baseMenor + (2 * calcularHipotenusa(baseMayor, baseMenor, altura));

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        
    }

    public void calcularCirculo() {
        System.out.println("=== Circulo ===");
        System.out.print("Ingrese el radio: ");
        double radio = leerDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
    }

    public double calcularHipotenusa(double a, double b, double c) {
        return Math.sqrt(Math.pow(c, 2) - Math.pow((a - b) / 2, 2));
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("**** Menu de Figuras Geometricas ****");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Trapecio");
            System.out.println("5. Circulo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una Figura Geometrica:");
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularTriangulo();
                    break;
                case 3:
                    calcularRectangulo();
                    break;
                case 4:
                    calcularTrapecio();
                    break;
                case 5:
                    calcularCirculo();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 0);
    }


    public int leerEntero() {
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un numero entero.");
            return leerEntero();
        }
    }

    public double leerDouble() {
        try {
            return Double.parseDouble(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un numero valido.");
            return leerDouble();
        }
    }

    public static void main(String[] args) {
        FiguraGeometrica figuras = new FiguraGeometrica();
        figuras.mostrarMenu();
    }
}
