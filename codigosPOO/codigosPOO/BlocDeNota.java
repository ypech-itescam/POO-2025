import java.util.Vector;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BlocDeNota {
    private Color colorB;
    private Vector<Nota> notas;

    public BlocDeNota(Color colorB){
        this.colorB = colorB;
        notas = new Vector<Nota>();
    }
     public BlocDeNota(){
        colorB = new Color("negro");
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
     public boolean updateNota(int n, Color color, String asunto, String texto, String fechalimite){
        if (existNota(n)){
            getNota(n).setColor(color.getColor());
            if (!asunto.equals("")){
                getNota(n).setAsunto(asunto);
            }
            if (!texto.equals("")){
                getNota(n).setTexto(texto);
            }
            if (!fechalimite.equals("")){
                getNota(n).setFechaLimite(fechalimite);
            }
            return true;
        }
        return false;
     }
     public boolean updateNota(int n, Nota nota){
        if (existNota(n)){
            notas.set(n, nota);
            return true;
        }
        return false;
     }
     public void saveNotas(String nombreArchivo){
         if (!notas.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (Nota nota : notas) {
                    writer.write(nota.mostrar());
                    writer.newLine();
                    writer.newLine();
                }
                System.out.println("Notas guardadas exitosamente en " + nombreArchivo);
            } catch (IOException e) {
                System.err.println("Error al guardar las notas: " + e.getMessage());
            }
        } else {
            System.out.println("No hay notas para guardar");
        }
     }
     public boolean existNota(int n){
        if (!notas.isEmpty() && notas.size()>n) {
            return true;
        }
        return false;
     }
     public void setColor(Color colorB){
        this.colorB = colorB;
     }
     public Color getColor(){
        return colorB;
     }
}
