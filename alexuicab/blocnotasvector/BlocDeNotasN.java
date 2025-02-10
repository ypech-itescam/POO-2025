import java.util.Vector;

public class BlocDeNotasN{
    private Color c;
    private Vector<Nota> notas;

    public BlocDeNotasN(Color c){
        this.c = new Color("Red");
        notas = new Vector<Nota>();
    }

    public BlocDeNotasN(){
        c = new Color("Rojo");
        notas = new Vector<Nota>();
    }

    public void addNota(Nota nota){
        this.notas.add(nota);
    }

    public Nota getNota(int n){
        return this.notas.get(n);
    }

    public boolean deleteNota(int n){
        if (!notas.isEmpty() && notas.size()>n){
            notas.remove(n);
            return true;
        }
        return false;

    }

    public boolean updateNota(int n, Color color, String importancia, String asunto, String fechaL){
        if (existNota(n)) {
            getNota(n).setColor(color.getColor());
            if(!importancia.equals(""))
                getNota(n).setImportancia(importancia);
            if(!asunto.equals(""))
                getNota(n).setAsunto(asunto);
            if(!fechaL.equals(""))
                getNota(n).setFechaL(fechaL);
            return true;
        }
        return false;
    }

    public boolean updateNota(int n, Nota nota){
        if (existNota(n)) {
            notas.set(n, nota);
            return true;            
        }
        return false;
    }

    public void saveNota(){

    }

    public boolean existNota(int n){
        if (!notas.isEmpty() && notas.size()>n) {
            return true;
        }
        return false;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public Color getColor(){
        return c;
    }

}
