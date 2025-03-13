public class Main {
    public static void main(String[] args) {
        
        Materia matematica = new Materia("Matematica", 4);
        Materia fisica = new Materia("Fisica", 3);
        Materia historia = new Materia("Historia", 2);
        
        
        Universidad universidad = new Universidad("ITESCAM");

        
        Profesor profesor1 = new Profesor("Yaxima", universidad);
        Profesor profesor2 = new Profesor("Ramiro", universidad);

        
        profesor1.agregarMateria(matematica);
        profesor1.agregarMateria(historia);
        
        profesor2.agregarMateria(fisica);

        
        universidad.agregarProfesores(profesor1);
        universidad.agregarProfesores(profesor2);

        
        System.out.println(universidad);
        System.out.println(profesor1);
        System.out.println(profesor2);
    }
}

