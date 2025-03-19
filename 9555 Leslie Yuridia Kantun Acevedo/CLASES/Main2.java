public class Main2{
    public static void main(String []args){
        Audifono audifono1= new Audifono("Sony",true);
        audifono1.setColor("Azul");
        audifono1.setVolumen(80);
        audifono1.setEstado(true);
        audifono1.ajustarVolumen(100);
        audifono1.reproducirMusica("Elemento");

        Audifono audifono2 = new Audifono("JBL",true);
        audifono2.setColor("Blanco");
        audifono2.setVolumen(60);
        audifono2.setEstado(false);
        audifono2.reproducirMusica("Rosones");

        System.out.println(audifono1.toString());
        System.out.println(audifono2.toString());

    }
}