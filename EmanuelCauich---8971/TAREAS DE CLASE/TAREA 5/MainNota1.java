public class MainNota1 {
    public static void main(String[] args) {

        BlockNotas blocNotas = new BlockNotas();
        Nota n1 = new Nota("2024/03/02", "Urgente", "Bañate XD", "pepe", "2025/06/07");
        Nota n2 = new Nota("2024/03/03", "Importante", "Haz la tarea", "juan", "2025/06/08");
        Nota n3 = new Nota("2024/03/04", "Recordatorio", "Comprar leche", "maría", "2025/06/09");
        blocNotas.addNota(n1);
        blocNotas.addNota(n2);
        blocNotas.addNota(n3);
        if (blocNotas.deleteNota(6)) {
            System.out.println("La nota fue borrada");
        }
        else {
            System.out.println("la nota no existe");
        }
        System.out.println(blocNotas.getNota(1));

    }
}