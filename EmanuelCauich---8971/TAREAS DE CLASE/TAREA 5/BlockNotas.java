import java.util.Vector;

public class BlockNotas {
    private Vector <Nota> notas;
    private int numNota;

    public BlockNotas(){
        numNota = 0;
        notas = new Vector<Nota>();
    }
    public boolean addNota(Nota nota){
        notas.add(nota);
        numNota++;
        return true;
    }
    public Nota getNota(int num) {
        if (!notas.isEmpty() && numNota > num) {
            return notas.get(num);
        }
        return new Nota("", "", "", "", "");
    }    
    public boolean deleteNota(int num){
        if (!notas.isEmpty()&& numNota > num) {
            notas.remove(num);
            numNota--;
            return true;
        }
        return false;
    }
    public boolean updateNota(int num, Nota n){
        if (!notas.isEmpty()&& numNota > num) {
            notas.set(num, n);
            return true;
        }
        return false;
    }
    public boolean updateNota(int num, String tipo, String texto, String autor, String fechaLimite){
        if (!notas.isEmpty()&& numNota>num) {
            if (texto.equals("")) {
                notas.get(num).setTexto(texto);
            }
            if (texto.equals("")) {
                notas.get(num).setAutor(autor);
            }
            if (texto.equals("")) {
                notas.get(num).setTipo(tipo);
            }
            if (texto.equals("")) {
                notas.get(num).setFechaLimite(fechaLimite);
            }
            return true;
        }
        return false;
    }
}