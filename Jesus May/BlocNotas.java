public class BlocNotas {
    private Nota[] notas;
    private int cantidadNotas;
    private int capacidadTotal;

    public BlocNotas(int capacidad) {
        notas = new Nota[capacidad];
        establecerCapacidadTotal();
        cantidadNotas = 2;
        notas[0] = new Nota("URGENTE", "07/03/2024", "23/03/2024", "Realizar mi tarea de programación");
        notas[1] = new Nota("URGENTE", "07/03/2024", "25/03/2024", "Hacer un ensayo");
    }

    public int obtenerCapacidadTotal() {
        return capacidadTotal;
    }

    private void establecerCapacidadTotal() {
        this.capacidadTotal = notas.length;
    }

    public void agregarNota(Nota nota) {
        if (cantidadNotas < capacidadTotal) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
        } else {
            System.out.println("No se puede agregar más notas. Se ha alcanzado la capacidad máxima.");
        }
    }

    public void mostrarNotas() {
        if (cantidadNotas == 0) {
            System.out.println("No hay notas registradas en el bloc de notas.");
        } else {
            System.out.println("Lista de notas en el bloc de notas:");
            for (int i = 0; i < cantidadNotas; i++) {
                System.out.println("______________________________________________________\nNota número " + (i + 1) + ":");
                System.out.println(notas[i]);
            }
        }
    }

    public void eliminarNotas() {
        notas = new Nota[capacidadTotal];
        cantidadNotas = 0;
        System.out.println("Todas las notas han sido eliminadas satisfactoriamente.");
    }

    public void actualizarNota(int numN, Nota n) {
        if (numN >= 0 && numN < cantidadNotas) {
            notas[numN] = n;
            System.out.println("_______________________________________________________\nLa nota en el número " + numN + " ha sido actualizada con éxito.\n_______________________________________________________");
        } else {
            System.out.println("El número de nota especificado no es válido.");
        }
    }
}

