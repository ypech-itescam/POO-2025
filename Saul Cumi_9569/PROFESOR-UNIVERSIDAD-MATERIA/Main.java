public class Main{
    
    public static void main(String[] args) {

        //UNIVERSIDAD
        Universidad universidad = new Universidad("TECNM");

        // MATERIAS
        Materia materia1 = new Materia("Matemáticas", 6);
        Materia materia3 = new Materia("Química", 4);

        // PROFESOR
        Profesor profesor = new Profesor("Dr. Raciel Estrada");

        // ASIGNAR UNA UNIVERSIDAD AL PROFESOR
        profesor.asignadoUniversidad(universidad);

        // AGREGAR MATERIAS
        profesor.agregarMateria(materia1);
        profesor.agregarMateria(materia3);

        // AGREGAR PROFESOR A UNI
        universidad.agregarProfesor(profesor);


        
        System.out.println("Universidad:");
        System.out.println("Nombre: " + universidad.getNombre());
        System.out.println("Posición: " + universidad.getPosicion());
        
        System.out.println("\nProfesores:");
        for (Profesor p : universidad.getProfesores()) {
            System.out.println(p);
        }
        
        System.out.println("\nMaterias del Profesor:");
        for (Materia m : profesor.getMaterias()) {
            System.out.println(m);
        }
    }
}
