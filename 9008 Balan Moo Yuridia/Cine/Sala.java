package Cine;

public class Sala {
    private String nombre;
    private int filas;
    private int columnas;
    private Asiento[][] asientos;

    public Sala(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.asientos = new Asiento[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = new Asiento(i + 1, j + 1);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Asiento getAsiento(int fila, int columna) {
        if (fila > 0 && fila <= filas && columna > 0 && columna <= columnas) {
            return asientos[fila - 1][columna - 1];
        }
        return null;
    }

    public void mostrarAsientos() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(asientos[i][j].estaOcupado() ? "[X]" : "[ ]");
            }
            System.out.println();
        }
    }
}

