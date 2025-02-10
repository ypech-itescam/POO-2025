public class MiAvatar {
    private String altura;
    private String peso;
    private String nombre;
    private String ropa;
    private String zapatos;
    private String edad;
    private String estado;
    private String género;
    private String evento;
    private String música;

    public MiAvatar(String altura, String peso, String nombre, String ropa, String zapatos, String edad, String estado, String género, String evento, String música) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.ropa = ropa;
        this.zapatos = zapatos;
        this.edad = edad;
        this.estado = estado;
        this.género = género;
        this.evento = evento;
        this.música = música;
    }

    public void bailarVals() {
        System.out.println(nombre + " está bailando su vals con la música " + música);
    }

    public static void main(String[] args) {
        MiAvatar princesa = new MiAvatar("1.63 metros", "50 kilos", "Princesa", "vestido", "tacones", "18 años", "feliz", "femenino", "vals", "perfume de gardenias");
        System.out.println("Altura: " + princesa.getAltura());
        System.out.println("Peso: " + princesa.getPeso());
        System.out.println("Nombre: " + princesa.getNombre());
        System.out.println("Ropa: " + princesa.getRopa());
        System.out.println("Zapatos: " + princesa.getZapatos());
        System.out.println("Edad: " + princesa.getEdad());
        System.out.println("Estado: " + princesa.getEstado());
        System.out.println("Género: " + princesa.getGénero());
        System.out.println("Evento: " + princesa.getEvento());
        System.out.println("Música: " + princesa.getMúsica());
        
        princesa.bailarVals();
    }

    public String getAltura() {
        return altura;
    }

    public String getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRopa() {
        return ropa;
    }

    public String getZapatos() {
        return zapatos;
    }

    public String getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getGénero() {
        return género;
    }

    public String getEvento() {
        return evento;
    }

    public String getMúsica() {
        return música;
    }
}
