import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

public class BlocNotas{
    private Vector<Nota> notas;
    private int numNota;
    public BlocNotas(){
        numNota = 0;
        notas = new Vector<Nota>();
    }
    public boolean addNota(Nota n){
        notas.add(n);
        numNota++;
        return true;
    }
    public Nota getNotas(int num){
        if(!notas.isEmpty()&&numNota>num)
            return notas.get(num);
       return new Nota(null, null, num, null, null, null);
    }
    public boolean deleteNota(int num){
        if(!notas.isEmpty()&&numNota>num){
            notas.remove(num);
            numNota--;
        }
        return false;
    }
    public boolean updateNota(int num, String aut, String c, String nombre, String t){
        if(!notas.isEmpty()&&numNota>num){
            Nota modificar = notas.get(num);
            notas.get(num);
            if(t.isEmpty()){
                modificar.setTexto(t, false);
            }
            if(String.valueOf(num).isEmpty()){
                modificar.setNum(num);
            }
            if(nombre.isEmpty()){
                modificar.setNombreDoc(nombre);
            }
            if(c.isEmpty()){
                modificar.setColor(c);
            }
            if(aut.isEmpty()){
                modificar.setAutor(aut);
            }
            return true;
        }
        return false;
    }
    public boolean updateNota(int num, Nota n){
        if(!notas.isEmpty()&&numNota>num){
            notas.set(num, n);
            return true;
        }
        return false;
    }
   public void guardar(String nombreArchivo) {
    //Falta por corregir algunos Errores de ejecucion
        try (PrintStream fileStream = new PrintStream(new FileOutputStream(nombreArchivo))) { 
            PrintStream originalOut = System.out;
            System.setOut(fileStream);
            for (Nota nota : notas) {
                nota.linea();
                nota.impLineas("", "");
                nota.fecha();
                nota.impLineas("Tipo = ", nota.getTipo());
                nota.impLineas("", "");
                nota.acomodarTexto(nota.getTexto());
                nota.impLineas("", "");
                nota.impLineas("Fecha Limite = ", "");
                nota.impLineas("               ", nota.getFechaLimite());
                nota.impLineas("", "");
                nota.impLineas("Autor = ", nota.getAutor());
                nota.impLineas("", "");
                nota.linea();
            }
            System.setOut(originalOut);

            System.out.println("El contenido se ha guardado en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}  

