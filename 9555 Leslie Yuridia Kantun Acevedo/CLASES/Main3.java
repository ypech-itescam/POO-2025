public class Main3{
    public static void main(String [] args){
        Mouse mouse1 = new Mouse("Razer",false);
        mouse1.setColor("Blanco");
        mouse1.setEstado(true);
        mouse1.hacerClick();
        mouse1.conectarBluetooth("Laptop");

        Mouse mouse2 = new Mouse("Constrain", true);
        mouse2.setColor("Plateado");
        mouse2.setEstado(true);
        mouse2.hacerClick();
        mouse2.conectarBluetooth("Telefono");

        System.out.println(mouse1.toString());
        System.out.println(mouse2.toString());
    }
}