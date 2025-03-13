public class Main {
    public static void main(String[] args) {
        Universidad u = new Universidad("Tecnologico de Mexico");
        Profesor p = new Profesor();
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor();

       Materia m = new Materia("POO", 10);
       Materia m1 = new Materia("POO1", 10);
       Materia m2 = new Materia("POO2", 10);

       p.setNombre("Cristhian");
       p1.setNombre("Garrido");
       p2.setNombre("Caamal");

       p.agregarMaterias(m);
       p1.agregarMaterias(m1);
       p2.agregarMaterias(m2);

       u.agregarProfesor(p);
       u.agregarProfesor(p1);
       u.agregarProfesor(p2);
       System.out.println(u);

      
    }
}
