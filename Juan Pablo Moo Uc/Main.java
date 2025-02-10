public class Main {
    public static void main(String[] args) {

        Nota n = new Nota("Urgente", "PORFAAAAAAAAAAAAAAA DATEEEEE DE BAJAAAAAAAAAAAAAAAAAAAA",
                "05/07/2024", "juan Pablo", "Verde", "Estudiar para salvar semestres");
        System.out.println(n.imprimirTexto());

        Nota n2 = new Nota("Urgente", "Estudiar programar en hoja",
                "10/05/2024 ",
                "Juan", "Azul", "estudia weeeeeeeeeeeeeeeeey");
        System.out.println(n2.imprimirTexto());
    }
}