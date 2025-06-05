package Universidad;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        Profesor prof1 = new Profesor("Dr. Ana Torres", "Matemáticas");
        Profesor prof2 = new Profesor("Ing. Luis Méndez", "Programación");

        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);

        Materia mat1 = new Materia("Cálculo I", prof1);
        Materia mat2 = new Materia("Estructuras de Datos", prof2);

        uni.agregarMateria(mat1);
        uni.agregarMateria(mat2);

        uni.mostrarProfesores();
        uni.mostrarMaterias();
    }
}
