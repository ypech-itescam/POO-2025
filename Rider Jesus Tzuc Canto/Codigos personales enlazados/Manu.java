public class Manu {
    public static void main(String[] args) {
        Bocina y=new Bocina(true, 0, "azul", "atv", 10);
        Computador i=new Computador(true, true, "verde","lenovo" , "lenovo idealpad 1-stam", 98, y);
        Auto o=new Auto(i, "gris", "nisan", "nisan fiesta", false, 120);
        System.out.println(y);
        System.out.println(i);
        System.out.println(o);
    }
    
}
