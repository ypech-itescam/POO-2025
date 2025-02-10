import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BlocNotasArray{
    private Nota[] notas;
    private int numNota;
    private int cantidad;

    public BlocNotasArray(int cant){
        setCantidad(cant);
        notas = new Nota[getCantidad()];
        numNota = 0;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cant){
        this.cantidad = cant<0?4:cant;
    }
    public boolean addNota(Nota n){ 
        notas[numNota]=n;
        numNota++;
        return true;
    }
    public Nota getNotas(int num){
        if(num<= numNota){
            return notas[num-1];
        }
        return null;
    }
    public boolean deleteNota(int num){
        if((num-1)<=numNota){
            for(int i = num; i < numNota; i++){
                notas[i] = notas[i+1];
            }
            numNota--;
            return true;
        }
        return false;
    }
    public boolean updateNota(int num, String aut, String c, String nombre, String t, String text){
        if((num-1)<=numNota){
            Nota not = new Nota(aut, c, num, nombre, t, text);
            notas[num-1]=not;
            return true;
        }
        return false;
    }
    public boolean updateNota(int num, Nota n){
        if((num-1)<=numNota){
            notas[num-1]= n;
            return true;
        }
        return false;
    }
    public void guardar(String nombreArchivo, int num) {
   }
}  

