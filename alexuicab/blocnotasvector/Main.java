public class Main{
    public static void main(String[] args) {
        BlocDeNotasN miBlocDeNotasN = new BlocDeNotasN();
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        nota1.setColor("rojo");
        nota1.setAsunto("PRUEBA");


        miBlocDeNotasN.addNota(nota1);

        nota2.setColor("azul");
        
        miBlocDeNotasN.addNota(nota2);

        nota3.setColor("verde");
        miBlocDeNotasN.addNota(nota3);

        
 
        System.out.println(miBlocDeNotasN.getNota(0));

        

        
    }
}