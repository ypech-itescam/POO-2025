public class Materia {
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public static void main(String[] args) {
        Materia[] materiasSegundoSemestre = {
            new Materia("Química"),
            new Materia("Matemáticas"),
            new Materia("Geografía"),
            new Materia("Artes"),
            new Materia("Literatura")
        };

        System.out.println("Materias del segundo semestre:");
        for (Materia materia : materiasSegundoSemestre) {
            System.out.println(materia);
        }
    }
}