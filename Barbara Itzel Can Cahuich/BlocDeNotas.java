import java.util.ArrayList;
import java.util.Scanner;

class Nota {
    private String titulo;
    private String contenido;

    public Nota(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

public class BlocDeNotas {
    private ArrayList<Nota> notas;

    public BlocDeNotas() {
        notas = new ArrayList<>();
    }

    public void agregarNota(String titulo, String contenido) {
        Nota nuevaNota = new Nota(titulo, contenido);
        notas.add(nuevaNota);
    }

    public void mostrarNotas() {
        System.out.println("Lista de notas:");
        for (Nota nota : notas) {
            System.out.println("Título: " + nota.getTitulo());
            System.out.println("Contenido: " + nota.getContenido());
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {
        BlocDeNotas blocDeNotas = new BlocDeNotas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar nota");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Salir");
            System.out.print("Ingrese su elección: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Ingrese el título de la nota: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el contenido de la nota: ");
                    String contenido = scanner.nextLine();
                    blocDeNotas.agregarNota(titulo, contenido);
                    break;
                case 2:
                    blocDeNotas.mostrarNotas();
                    break;
                case 3:
                    System.out.println("Saliendo del bloc de notas...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }
}