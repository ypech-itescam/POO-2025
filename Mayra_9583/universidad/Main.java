public class Main {
    public static void main(String[] args) {

        
        Universidad universidad = new Universidad("INSTITUTO TECNOLOGICO SUPERIOR DE CALKINI");

        
        Profesor profesor1 = new Profesor("Dra. Mariana Trinidad");
        Profesor profesor2 = new Profesor("Dr. Guadalupe Cardozo");

      
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);

       
        Materia materia1 = new Materia("Quimica", 5);
        Materia materia2 = new Materia("Fisica", 4);
        Materia materia3 = new Materia("Calculo", 3);
        Materia materia4 = new Materia("Matematicas", 0);

        profesor1.agregarMateria(materia1);
        profesor1.agregarMateria(materia2);
        profesor2.agregarMateria(materia3);
        profesor2.agregarMateria(materia4);

        
        System.out.println(universidad);
    }
}