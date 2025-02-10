public class BlocNota {
    private Nota[] notas;

    public BlocNota(){
        this.notas = new Nota[5];
    }
    public void agregarNota(int posicion, Nota nota){
        if (posicion >=0 && posicion < notas.length){
            notas[posicion] = nota;
        }
        else {
            System.out.println("No se puede agregar la nota");
        }
    }

    public void remplazarNota(int posicion, Nota nota){
        if (posicion >= 0 && posicion < notas.length){
            notas[posicion] = nota;
        }
        else{
            System.out.println("No se puede remplazar la nota");
        }
    }

    public void numeroNotas(){
        for (int i = 0; i < notas.length; i++){
            if (notas[i] != null){
                System.out.println("Nota "+(i+1)+": ");
                System.out.println(notas[i].mostrar());
                System.out.println(notas[i].resetColor());
            }
            else{
                System.out.println("No hay notas");
            }
        }
    }
    public void deleteNota(int posicion, Nota nota){
        for (int i = 0; i < notas.length; i++){
            if  (notas[i] != null){
                System.out.println("");
            }
            else{
                
            }
        }
    }
}
