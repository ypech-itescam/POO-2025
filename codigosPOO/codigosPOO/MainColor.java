public class MainColor {
    public static void main(String[] args) {
        Color colorRojo = new Color("rojo");
        BlocDeNota blocNotas = new BlocDeNota(colorRojo);

        Nota nota1 = new Nota("12-12.2012", "Hola esto es una nota", "Carlos", "Urgente", "23-04-2026", "verde");
        Nota nota2 = new Nota("24-05-2020", "Hola esto es una segunda nota", "Carlos II", "Demasiado urgente", "29-02-2334", "negro");

        blocNotas.addNota(nota1);
        blocNotas.addNota(nota2);

        System.out.println(blocNotas.getNota(1));
        System.out.println(blocNotas.getNota(0));


        //blocNotas.saveNotas(System.getProperty("user.home") + "/Desktop/notas.txt");

    }

}
