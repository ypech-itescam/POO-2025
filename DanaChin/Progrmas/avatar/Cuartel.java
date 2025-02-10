package DanaChin.Progrmas.avatar;

public class Cuartel {

    public static void main(String[] args) {

        // Crear un objeto Piloto
        Piloto piloto = new Piloto("Shinji Ikari", 14, 1.63, "Masculino");

        // Crear un objeto Eva
        Eva eva01 = new Eva("EVA-01", "Shinji Ikari", "yellow", "Japon", 200);

        // Mostrar información
        System.out.println("Nombre del piloto: " + piloto.getNombre());
        System.out.println("Edad del piloto: " + piloto.getEdad());
        System.out.println("Altura del piloto: " + piloto.getAltura());
        System.out.println("Genero del piloto: " + piloto.getGenero());
        System.out.println("Modelo del Eva: " + eva01.getModelo());
        System.out.println("Piloto del Eva: " + eva01.getPiloto());
        System.out.println("Color del Eva: " + eva01.getColor());
        System.out.println("Pais de procedencia del Eva: " + eva01.getPais());
        System.out.println("La altura del Eva: " + eva01.getAltura());
    }
}