package CharlyKeb.EjerciciosDeClase;

import java.util.Vector;

//<>
public class BlockDeNotas {
    private int nNotas;
    // private String nomNota;
    private Vector<Nota> notas;

    public BlockDeNotas() {
    }

    public BlockDeNotas(int nNotas) {
        nNotas = 0;
        notas = new Vector<Nota>();
    }

    public boolean addNota(Nota n) {
        notas.add(n);
        nNotas++;
        return true;
    }

    public Nota getNota(int numero) {
        if (!notas.isEmpty() && nNotas > numero)
            return notas.get(numero);
        return new Nota(null, null, null, null, null);
    }

    public boolean deleteNota(int numero) {
        if (!notas.isEmpty() && nNotas > numero) {
            notas.remove(numero);
            nNotas--;
            return true;
        }
        return false;
    }

    public boolean updateNota(String importancia, String texto,
            String fechaLimite, String nombreDelEscritor, String color, int numero) {
        if (!notas.isEmpty() && nNotas > numero) {
            notas.get(numero);
            if (!importancia.isEmpty()) {
                notas.get(numero).setImportancia(importancia);
            }
            if (!texto.isEmpty()) {
                notas.get(numero).setTexto(texto);
            }

            if (!fechaLimite.isEmpty()) {
                notas.get(numero).setTexto(fechaLimite);
            }
            if (!nombreDelEscritor.isEmpty()) {
                notas.get(numero).setTexto(nombreDelEscritor);
            }
            if (!color.isEmpty()) {
                notas.get(numero).setTexto(color);
            }
            return true;
        }
        return false;
    }

    public boolean updateNota(int numero, Nota n) {
        if (!notas.isEmpty() && nNotas > numero) {
            notas.set(numero, n);
            return true;
        }
        return false;
    }

    public void guardarNotas() {

    }

    public String imprimirTexto() {
        return "";
    }
}