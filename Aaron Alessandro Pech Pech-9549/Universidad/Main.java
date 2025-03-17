
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Intercultural de Campeche");
        Profesor profe = new Profesor("Dr. Juan Pérez");
        Profesor profe1 = new Profesor("Dr. Yaqueline");
        Profesor profe2 = new Profesor("Dr. Felipe Salgado");
        Materia mat = new Materia("Lengua Maya", 0);
        
        profe.asignarUniversidad(uni);
        profe.agregarMateria(mat);
        uni.agregarProfesor(profe);
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        
        System.out.println(uni);
        System.out.println(profe);
        System.out.println(profe1);
        System.out.println(profe2);
        System.out.println(mat);


    }
}
