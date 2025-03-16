public class Main {
    public static void main(String[] args) {

        // Crear universidad
        Universidad universidad = new Universidad("INSTITUTO TECNOLOGICO SUPERIOR DE CALKINI");

        // Crear profesores
        Profesor profesor1 = new Profesor("Dra. Yaqueline Pech Huh");
        Profesor profesor2 = new Profesor("Dr. Raciel Leon");

        // Asignar profesores a la universidad
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);

        // Crear materias
        Materia materia1 = new Materia("Programacion", 5);
        Materia materia2 = new Materia("Matematicas", 4);
        Materia materia3 = new Materia("Calculo", 3);
        Materia materia4 = new Materia("Probabilidad", 2);

        // Asignar materias a los profesores
        profesor1.agregarMateria(materia1);
        profesor1.agregarMateria(materia2);
        profesor2.agregarMateria(materia3);
        profesor2.agregarMateria(materia4);

        // Mostrar información
        System.out.println(universidad);
    }
}