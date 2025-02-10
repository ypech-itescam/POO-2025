public class postis{
    public static void main (String [] args){
        Dato postit = new Dato();

        postit.setNombre("ale");
        postit.setFecha("12/03/2024");
        postit.setContenido("hola_mundo");
        postit.setTipo("aviso");
        postit.setFinaliza("hoy");

        System.out.println("Nombre del autor es: " + postit.getNombre());
        System.out.println("fecha: " + postit.getFecha());
        System.out.println(": " + postit.getContenido());
        System.out.println("tipo: " + postit.getTipo());
        System.out.println("finaliza: " + postit.getFinaliza()); 
    }
}