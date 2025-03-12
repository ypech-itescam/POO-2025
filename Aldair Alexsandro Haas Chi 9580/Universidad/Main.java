public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("ITESCAM");
        Profesor profesor = new Profesor("Roberto Che");
        Materia materia1 = new Materia("Fisica", 6);
        Materia materia2 = new Materia("Filosofia", 5);

        profesor.agregarMateria(materia1);
        profesor.agregarMateria(materia2);
        uni.agregarProfesor(profesor);

        System.out.println(uni);
    }
}
