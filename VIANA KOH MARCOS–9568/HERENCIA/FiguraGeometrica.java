package HERENCIA;

public class FiguraGeometrica {
    

    private String nombre;
     private String color;

     public FiguraGeometrica(String nombre, String color) {
        setNombre(nombre);
        setColor(color);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre. equals(""))? "No especificado": nombre;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color.equals(""))? "No especificado": color;
    }


    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }


    public String toString(){
        return "Figura Geometrica: " + getNombre() + ", Color: " + getColor();
    }




    class Cuadrado{
        private double lado;

        public Cuadrado(double lado) {
            setLado(lado);
        }

        public double getLado() {
            return lado;
        }


        public void setLado(double lado) {
            this.lado = (lado > 0)? lado : 0;
        }


        public double calcularArea(){
            return lado * lado;
    }
     
        public double calcularPerimetro(){
            return 4 * lado;
        }

    }

    class Cuadrado extends FiguraGeometrica{
        private double lado;
        public Cuadrado(double lado) {
            super("Cuadrado", "Azul");
            setLado(lado);

            System.out.println(toString());
        }
        }
}

