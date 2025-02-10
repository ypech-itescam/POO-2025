public class Maestro {
    int id;
    String nombre;
    String apellido;
    String materia;

    public Maestro() {
    }

    public Maestro(int id, String nombre, String apellido, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrarNombre() {
        System.out.println("Hola, soy un maestro y sé decir mi nombre");
    }

    public void darClase() {
        System.out.println("Estoy dando clase de " + materia);
    }

    public static void mostrarMaestro(String[] args) {
        Maestro maestro1 = new Maestro();
        Maestro maestro2 = new Maestro(1, "Profesor", "González", "Matemáticas");

        System.out.println("ID del maestro 2: " + maestro2.getId());
        System.out.println("Nombre del maestro: " + maestro2.getNombre());
        System.out.println("Apellido del maestro: " + maestro2.getApellido());
        System.out.println("Materia que enseña: " + maestro2.getMateria());

        maestro1.setId(2);
        maestro1.setNombre("Profesora");
        maestro1.setApellido("Martínez");
        maestro1.setMateria("Historia");

        System.out.println("--------------------------------------------");
        System.out.println("ID del maestro 1: " + maestro1.getId());
        System.out.println("Nombre del maestro: " + maestro1.getNombre());
        System.out.println("Apellido del maestro: " + maestro1.getApellido());
        System.out.println("Materia que enseña: " + maestro1.getMateria());
    }
}
