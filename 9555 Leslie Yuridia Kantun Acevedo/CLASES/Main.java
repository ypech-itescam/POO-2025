public class Main{
    public static void main(String []args){
       // Laptop laptop1 = new Laptop("W2415A", "Atvio");
        //laptop1.setColor("Azul");
        //laptop1.setPantalla(12);
        //laptop1.setEstado(true);
        //laptop1.ajustarVolumen(75);
        //laptop1.conectarWifi("Fam_Acvdo","4321n");

        //Laptop laptop2 = new Laptop("144DA05", "Lenovo");
        //laptop2.setColor("Gris");
        //laptop2.setPantalla(13);
        //laptop2.setEstado(false);
        //laptop2.abrirPrograma("Visual");

       // System.out.println(laptop1.toString());
        //System.out.println(laptop2.toString());

        Mouse myMouse = new Mouse("Logitech", true);
        Audifono myAudifono = new Audifono("Samsung", true);
        Laptop myLaptop = new Laptop(" Lenovo", " l44DA05", myMouse, myAudifono);

        myLaptop.encender();
        myLaptop.usarMouse();
        myLaptop.usarAudifonos();

        System.out.println(myLaptop.toString());

    }
}