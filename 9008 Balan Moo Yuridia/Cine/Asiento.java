package Cine;

public class Asiento {
    private int fila;
    private int columna;
    private boolean ocupado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    @Override
    public String toString() {
        return "Asiento[" + fila + "," + columna + "] " + (ocupado ? "Ocupado" : "Libre");
    }
}
