public class Manii {
    public static void main(String[] args) {
        //intanciamos la universidad en cuestion
        Universidad u=new Universidad("itescam");
        // instanciamos a los maestros 
        Profesor p=new Profesor();
        Profesor p1=new Profesor();
        Profesor p2=new Profesor();
        // instanciamos las materias que llevaran
        Materias m=new Materias(10);
        Materias m1=new Materias("ingles", 50);
        Materias m2=new Materias("matematicas", 100);
        //cambiamos el nombre de los maestros
        p.setnombre("yaqui");
        p1.setnombre("lira");
        p2.setnombre("");
        //agregamos materias a los maestros
        p.agregarMateria(m);
        p.agregarMateria(m1);
        p.agregarMateria(m2);

        p1.agregarMateria(m1);
        p2.agregarMateria(m2);
        //agregamos los maestros con materias ala universidad  
        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p);
        System.out.println(u);


    }
    
}
