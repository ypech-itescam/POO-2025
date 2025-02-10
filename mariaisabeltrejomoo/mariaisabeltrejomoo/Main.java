package mariaisabeltrejomoo;
public class Main {
    public static void main(String[] args) {
        Perro p=new Perro("Kia", 7, 25, "Pitbull", "Viva");
        p.comer("Croquetas");
        p.ladrar();
        
        Computadora c = new Computadora("LENOVO", "Magenta", "rahcj", 34, "LINUX");
        System.out.println(c.getMarca());
        System.out.println(c.getColor());
        System.out.println(c.getModelo());
        System.out.println(c.getMemoriaRAM());
        System.out.println(c.getTipoSistema());
        c.encender();
        c.apagar();

        HolaMundo hola = new HolaMundo("¡Hola Mundo!");
        hola.mostrar();
        
        BlocDeNota bloc=new BlocDeNota(null);
        Nota n=new Nota
    }
}
