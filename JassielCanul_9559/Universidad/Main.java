package Universidad;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Itescam");
        Profesor profe1 = new Profesor("Dr. Rodríguez");
        Profesor profe2 = new Profesor("Dra. López");

        Materia mate1 = new Materia("Matemáticas", 5);
        Materia mate2 = new Materia("Física", 4);

        profe1.agregarMateria(mate1);
        profe1.agregarMateria(mate2);
        profe2.agregarMateria(new Materia("Programación", 6));
        
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);

        System.out.println("\n=== Universidad ===");
        System.out.println(uni);
        
        System.out.println("\n=== Profesores ===");
        for (Profesor p : uni.getProfesores()) {
            System.out.println(p);
        }
    }
}
