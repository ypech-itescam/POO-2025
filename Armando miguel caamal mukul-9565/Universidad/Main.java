package Universidad;

public class Main {
    public static void main(String[] args) {
        
        Universidad unam = new Universidad("UNAM");
        
        
        Profesor profesor1 = new Profesor("Juan Pérez");
        Profesor profesor2 = new Profesor("María Rodríguez");
        
        
        Materia poo = new Materia("Programación Orientada a Objetos", 6);
        Materia contabild = new Materia("contabilidad", 5);
        Materia quimica = new Materia("quimica", 8);
        
        
        unam.agregarProfesor(profesor1);
        unam.agregarProfesor(profesor2);
        
        
        profesor1.agregarMateria(poo);
        profesor1.agregarMateria(contabild);
        profesor2.agregarMateria(quimica);
        
        
        System.out.println("=== SISTEMA UNIVERSITARIO ===");
        System.out.println(unam);
        System.out.println("=== DETALLES DE PROFESORES ===");
        System.out.println(profesor1);
        System.out.println(profesor2);
        
        System.out.println("=== DESPUÉS DE MODIFICACIONES ===");
        profesor1.setNombre("Juan Alberto Pérez");
        poo.setCreditos(7);
        
        System.out.println(profesor1);
    }
}
    

