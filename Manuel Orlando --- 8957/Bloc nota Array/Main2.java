public class Main2 {
    public static void main(String[] args) {
        BlocNotasArray blocNotas = new BlocNotasArray(10);
        blocNotas.addNota(new Nota("Manuel", "magenta", 1, "Nota 1", "Urgente", "Hola me llamo manuel"));
        blocNotas.addNota(new Nota("Orlando", "rojo", 2, "Nota 2", "Normal", "como te llamas tu"));
        blocNotas.addNota(new Nota("Keb Ortiz", "azul", 3, "Nota 3", "Urgente", "No se que mas escribir"));
        System.out.println("Notas en el bloc de notas:");
        for (int i = 1; i <= blocNotas.getCantidad(); i++) {
            Nota nota = blocNotas.getNotas(i);
            if (nota != null) {
                System.out.println("Nota " + i + ": " + nota.getNombreDoc());
            }
        }

        // Actualizar una nota existente
        blocNotas.updateNota(2, "Jose Ismael", "turquesa", "Nota de hola", "Urgente", "No se que mas escribir para esta nota");

        // Mostrar la nota actualizada
        System.out.println("\nNota actualizada:");
        Nota notaActualizada = blocNotas.getNotas(2);
        if (notaActualizada != null) {
            System.out.println("Nota 2: " + notaActualizada.getNombreDoc());
        }

        // Eliminar una nota
        blocNotas.deleteNota(3);

        // Mostrar todas las notas restantes en el bloc de notas
        System.out.println("\nNotas restantes en el bloc de notas:");
        for (int i = 1; i <= blocNotas.getCantidad(); i++) {
            Nota nota = blocNotas.getNotas(i);
            if (nota != null) {
                System.out.println("Nota " + i + ": " + nota.getNombreDoc());
            }
        }
        blocNotas.guardar("Nota 1", 2);
    }
}
