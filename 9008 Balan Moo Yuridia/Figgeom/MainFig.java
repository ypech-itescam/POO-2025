package Figgeom;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainFig{
    public static double validarNumero(BufferedReader in) throws IOException{
        while (true) {
            try {
                double a = Double.parseDouble(in.readLine());
                if (Operacion.esNegativo(a)) {
                    throw new NumberFormatException();
                }
                return a;
            } catch (NumberFormatException nfe) {
                System.out.print("El valor debe ser un dato válido: ");
            }
        }
    }

    public static void elegirOperacion(int f, int i, Cuadrado c, Triangulo t, Rectangulo r , Circulo cir, Trapecio tr){
        Cuadrado c1 = c;
        Triangulo t1 = t;
        Rectangulo r1 = r;
        Circulo cir1 = cir;
        Trapecio tr1 = tr;
        switch (f) {
            case 1:
            switch (i) {
                case 1:
                    System.out.println("Área: " + c1.calcularArea() + " cm^2");
                    break;
                case 2:
                    System.out.println("Área: " + t1.calcularArea() + " cm^2");
                    break;
                case 3:
                    System.out.println("Área: " + r1.calcularArea() + " cm^2");
                    break;
                case 4:
                    System.out.println("Área: " + cir1.calcularArea() + " cm^2");
                    break;
                case 5:
                    System.out.println("Área: " + tr1.calcularArea() + " cm^2");
                    break;
            }
                break;
            case 2:
            switch (i) {
                case 1:
                    System.out.println("Perímetro: " + c.calcularPerimetro() + " cm");
                    break;
                case 2:
                    System.out.println("Perímetro: " + t.calcularPerimetro() + " cm");
                    break;
                case 3:
                    System.out.println("Perímetro: " + r.calcularPerimetro() + " cm");
                    break;
                case 4:
                    System.out.println("Perímetro: " + cir.calcularPerimetro() + " cm");
                    break;
                case 5:
                    System.out.println("Perímetro: " + tr.calcularPerimetro() + " cm"   );
                    break;
            }
                break;
            case 3:
            switch (i) {
                case 1:
                    System.out.println("Datos:\n" + c.toString());
                    break;
                case 2:
                    System.out.println("Datos:\n" + t.toString());
                    break;
                case 3:
                    System.out.println("Datos:\n" + r.toString());
                    break;
                case 4:
                    System.out.println("Datos:\n" + cir.toString());
                    break;
                case 5:
                    System.out.println("Datos:\n" + tr.toString());
                    break;
            }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\t\tCalculadora de Área y Perímetro\nElige la figura que deseas:\n\t1: Cuadrado\n\t2: Triángulo\n\t3: Rectángulo\n\t4: Círculo\n\t5: Trapecio\n\t6: Salir");
                int figura = (int) validarNumero(br);
                    if (figura >= 1 && figura <=5){
                        Cuadrado c = new Cuadrado();
                        Triangulo t = new Triangulo();
                        Rectangulo r = new Rectangulo();
                        Circulo cir = new Circulo();
                        Trapecio tr = new Trapecio();
                        switch (figura) {
                            case 1:
                                int cuadrado = 1;
                                while (cuadrado == 1) {
                                    System.out.println("Ingrese los valores para el cuadrado en cm:");
                                    System.out.print("Lado: ");
                                    double lado = validarNumero(br);
                                    c.setLado(lado);
                                    break;
                                }
                                break;
                            case 2:
                                    System.out.println("Tipo de triángulo:\n\t1: Equilátero\n\t2: Isósceles\n\t3: Escaleno\n\t4: Rectángulo");
                                    int tipoT = (int )(validarNumero(br));
                                    t.setTipo(tipoT);
                                    int tri = 1;
                                    while (tri == 1) {
                                        if (tipoT >= 1 && tipoT <= 4){
                                            switch (tipoT) {
                                                case 1:
                                                    System.out.println("Ingrese los valores para el triángulo equilátero en cm:");
                                                    System.out.print("Base: ");
                                                    double base1 = validarNumero(br);
                                                    t.setBase(base1);
                                                    System.out.print("Altura: ");
                                                    double altura1 = validarNumero(br);
                                                    t.setAltura(altura1);
                                                    tri = 0;
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese los valores para el triángulo isósceles en cm:");
                                                    System.out.print("Base: ");
                                                    double base2 = validarNumero(br);
                                                    t.setBase(base2);
                                                    System.out.print("Altura: ");
                                                    double altura2 = validarNumero(br);
                                                    t.setAltura(altura2);
                                                    tri = 0;
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese los valores para el triángulo escaleno:");
                                                    System.out.print("Lado 1: ");
                                                    double lado1 = validarNumero(br);
                                                    t.setLado1(lado1);
                                                    System.out.print("Lado 2: ");
                                                    double lado2 = validarNumero(br);
                                                    t.setLado2(lado2);
                                                    System.out.print("Lado 3 (Base): ");
                                                    double lado3 = validarNumero(br);
                                                    t.setBase(lado3);
                                                    System.out.print("Altura: ");
                                                    double altura3 = validarNumero(br);
                                                    t.setAltura(altura3);
                                                    tri = 0;
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese los valores para el triángulo rectángulo:");
                                                    System.out.print("Base: ");
                                                    double base4 = validarNumero(br);
                                                    t.setBase(base4);
                                                    System.out.print("Altura: ");
                                                    double altura4 = validarNumero(br);
                                                    t.setAltura(altura4);
                                                    tri = 0;
                                                    break;
                                            }
                                        }
                                        else {
                                            System.out.println("Ingrese una opción válida: ");
                                            tipoT = Integer.parseInt(br.readLine());
                                        }
                                    }
                                    break;
                            case 3:
                                System.out.println("Ingrese los valores para el rectángulo en cm:");
                                System.out.print("Ancho: ");
                                double ancho = validarNumero(br);
                                r.setAncho(ancho);
                                System.out.print("Largo: ");
                                double largo = validarNumero(br);
                                if (largo <= ancho) {
                                    System.out.print("Ingrese un valor mayor al ancho: ");
                                    largo = validarNumero(br);
                                }
                                r.setLargo(largo);
                                break;
                            case 4:
                                System.out.println("Ingrese los valores para el círculo en cm:");
                                System.out.print("Radio: ");
                                double radio = validarNumero(br);
                                cir.setRadio(radio);
                                break;
                            case 5:
                                    System.out.println("Ingrese los valores para el trapecio en cm:");
                                    System.out.print("Base menor: ");
                                    double bMe = validarNumero(br);
                                    tr.setBaseMenor(bMe);
                                    System.out.print("Base mayor: ");
                                    double bMa = validarNumero(br);
                                    if (bMa <= bMe) {
                                        System.out.print("Ingrese un valor mayor al ancho: ");
                                        bMe = validarNumero(br);
                                    }
                                    tr.setBaseMayor(bMa);
                                    System.out.print("Altura: ");
                                    double alturaT = validarNumero(br);
                                    tr.setAltura(alturaT);
                                    break;
                        }
                        System.out.println("Indique que desea calcular:\n\t1: Área\n\t2: Perímetro: \n\t3: Mostrar todo");
                        int opcCalculo = (int) validarNumero(br);
                        int result = 1;
                        while (result == 1) {
                            if (opcCalculo >= 1 && opcCalculo <= 3) {
                                elegirOperacion(opcCalculo, figura, c, t, r, cir, tr);
                                System.out.println("Desea calcular algo más con la figura:\n\t1: Sí\n\t2: No");
                                result = (int) validarNumero(br);
                                if (result == 1) {
                                    System.out.println("Indique que desea calcular:\n\t1: Área\n\t2: Perímetro \n\t3: Mostrar todo");
                                    opcCalculo = (int) validarNumero(br);
                                }
                                else if(result == 2){
                                    System.out.println("C E R R A N D O   L A   C A L C U L A D O R A");
                                    result = 0;
                                    br.close();
                                }
                                else{
                                    System.out.print("Ingrese una opcion valida: ");
                                    opcCalculo = (int) validarNumero(br);
                                }
                            }
                            else {
                                System.out.print("Ingrese una opcion valida: ");
                                opcCalculo = (int) validarNumero(br);
                            }
                        }
                    }
                    else if (figura == 6) {
                        System.out.println("C E R R A N D O   L A   C A L C U L A D O R A");
                        br.close();
                    }
                    else {
                        System.out.print("Ingrese una opcion valida: ");
                        figura = (int) validarNumero(br);
                    }
        br.close();
    }
}

class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"Figura":nombre;
    }
}

interface Operaciones{
    public double calcularArea();
    public double calcularPerimetro();
}

class Cuadrado extends FiguraGeometrica implements Operaciones{
    private double lado;

    public Cuadrado(){
        super("Cuadrado");
        setLado(1);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado <= 0 ? 1 : lado;
    }
    
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro() {
        return lado*4;
    }
    
    public String toString() {
        return "\t\t" + getNombre() + "\nLado: " + getLado() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + calcularPerimetro() + " cm";
    }
}

class Rectangulo extends FiguraGeometrica implements Operaciones{
    private double largo;
    private double ancho;

    public Rectangulo(){
        super("Rectángulo");
        setAncho(1);
        setLargo(3);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo <= 0 ? 2 : largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho <= 0 ? 1 : ancho;
    }

    public double calcularArea() {
        return largo*ancho;
    }

    public double calcularPerimetro() {
        return (largo*2) + (ancho*2);
    }

    public String toString() {
        return "\t\t" + getNombre() + "\nLargo: " + getLargo() + " cm\nAncho: " + getAncho() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + calcularPerimetro() + " cm";
    }
}

class Circulo extends FiguraGeometrica implements Operaciones{
    private double radio;
    private final double PI = 3.1416;

    public Circulo(){
        super("Círculo");
        setRadio(1);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio <= 0 ? 1: radio;
    }

    public double calcularArea() {
        return PI * (radio * radio);
    }

    public double calcularPerimetro(){
        return PI * (radio*2);
    }

    public String toString() {
        DecimalFormat f = new DecimalFormat("0.00");
        return "\t\t" + getNombre() + "\nRadio: " + getRadio() + " cm\nÁrea: " + f.format(calcularArea()) + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
    }
}

class Triangulo extends FiguraGeometrica implements Operaciones{
    private double base;
    private double altura;
    private int tipo;
    private double lado1;
    private double lado2;

    public Triangulo(){
        super("Triángulo");
        setBase(4);
        setAltura(3);
        setTipo(1);
        setLado1(4);
        setLado2(5);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base <= 0 ? 3 : base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura <= 0 ? 4 : altura;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo <= 0 ? 1 : tipo;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1 <= 0 ? 4 : lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2 <= 0 ? 5 : lado2;
    }

    public double calcularArea() {
        return (base*altura)/2;
    }

    public double calcularPerimetro() {
        double perimetro = 0;
        switch (tipo) {
            case 1:
                perimetro = base * 3;
                break;
            case 2:
                perimetro = base + (Math.sqrt(((base/2)*(base/2)) + (altura*altura)))*2;
                break;
            case 3:
                perimetro = base + lado1 + lado2;
                break;
            case 4:
                perimetro = base + altura + Math.sqrt((base*base) + (altura*altura));
                break;
            default:
                System.out.println("Ingrese un tipo válido");
        }
        return perimetro;
    }

    public String toString() {
        DecimalFormat f = new DecimalFormat("0.00");
        String cadena = "";
        switch (tipo) {
            case 1:
                cadena =  "\t" + getNombre() + " Equilátero\nBase: " + getBase() + " cm\nAltura: " + getAltura() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
                break;
            case 2:
                cadena = "\t" + getNombre() + " Isósceles\nBase: " + getBase() + " cm\nAltura: " + getAltura() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
                break;
            case 3:
                cadena = "\t" + getNombre() + " Escaleno\nLado 1: " + getLado1() + " cm\nLado 2: " + getLado2() + " cm\nLado 3 (Base): " + getBase() + " cm\nAltura: " + getAltura() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
                break;
            case 4:
                cadena = "\t    " + getNombre() + " Rectángulo\nBase: " + getBase() + " cm\nAltura: " + getAltura() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
                break;
        }
        return cadena;
    }
}

class Trapecio extends FiguraGeometrica implements Operaciones{
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(){
        super("Trapecio");
        setBaseMayor(5);
        setBaseMenor(3);
        setAltura(3);
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor <= 0 ? 5 : baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor <=0 ? 3 : baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura <= 0 ? 3 : altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor)*altura)/2;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + (Math.sqrt(Math.pow((baseMayor - baseMenor)/2,2)+(altura*altura)));        
    }

    public String toString() {
        DecimalFormat f = new DecimalFormat("0.00");
        return "\t\t" + getNombre() + "\nBase mayor: " + getBaseMayor() + " cm\nBase menor: " + getBaseMenor() + " cm\nAltura: " + getAltura() + " cm\nÁrea: " + calcularArea() + " cm^2\nPerímetro: " + f.format(calcularPerimetro()) + " cm";
    }
}