package HERENCIA;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("ITESCAM");
        Profesor profe = new Profesor("Dr. Yaquelin Pech");
        Materia materia1 = new Materia("Matematicas", 4);
        Materia materia2 = new Materia("POO", 3);

        profe.asignarUniversidad(uni);
        profe.agregarMateria(materia1);
        profe.agregarMateria(materia2);

        uni.agregarProfesor(profe);

        System.out.println(uni);
        System.out.println(profe);
    }
}