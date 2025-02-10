import java.util.Vector;

public class BlocDeNotas {
    private int nnota;
    private Nota notaarray[];
    private Vector<Nota> notavector;
    
    public BlocDeNotas(){
        notaarray = new Nota[10];
        nnota = 0;
        notavector = new Vector<Nota>();
    }
    public void setNota(Nota nota){
        if (nnota>=10)
            System.out.println("desbordaqmiento no se puede almacenar la nota");
        else{
            notaarray[nnota] = nota;
            nnota++;
        }
        notavector.add(nota);
    }

    public Nota getNotaArray(int pos){
        if(pos>=nnota)
            return notaarray[nnota-1];
        return notaarray[pos];
    }
    public Nota getNotaVector(int pos){
        if(!notavector.isEmpty() && notavector.size()>pos)
            return notavector.get(pos);
        else
            return new Nota();
    }

}
