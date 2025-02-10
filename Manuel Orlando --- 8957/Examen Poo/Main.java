public class Main {
    public static void main(String[] args) {
        Calificacion cal = new Calificacion();
        Proyecto proyect = new Proyecto("Proyecto quien sabe", "06/07/2251", 20);
        Alumno alum = new Alumno("8957", "Manuel Orlando");
        System.out.println(alum.toString());
        System.out.println(alum.getProyecto());
        System.out.println();
        System.out.println(proyect.toString());
        System.out.println();
        System.out.println(cal.toString());
    }
}
