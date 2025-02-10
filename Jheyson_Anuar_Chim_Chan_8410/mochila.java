public class mochila{
    public static void main (String [] args){

        atributos mochila = new atributos();

        mochila.setmarca("trupper");
        mochila.settamaño("es mediana");
        mochila.setcolor("es de color negro");
        mochila.setcierres(6);
        System.out.println("=========================");
        System.out.println("la marca es: " + mochila.getmarca());
        System.out.println("tamaño: " + mochila.gettamaño());
        System.out.println(mochila.getcolor());
        System.out.println("tiene unos " + mochila.getcierres() + " " + "cierres");
        System.out.println("=========================");
    }
}