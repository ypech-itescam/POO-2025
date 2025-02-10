public class Avatar {
    private String Nombre;
    private String Especie;
    private String Ocupacion;
    private int Edad;
    private String Color;
    private String Genero;

    public Avatar(String Nombre, String Especie, String Ocupacion, int Edad, String Color, String Genero) {
        this.Nombre = Nombre;
        this.Ocupacion = Ocupacion;
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero() {
        this.Genero = Genero;
    }

    public void imprimirConColor(String Color) {
        System.out.println(Texto + Color + Tamaño);
    }

    public static void main(String[] args) {
    
        Avatar avatar = new Avatar("Leonardo", "tortuga", "ninja", "16", "verde", "macho");
        gato.comer();
        gato.dormir()
        gato.maullar();
        gato.crecer();
        gato.cazar();
        gato.morir();
    }
}

