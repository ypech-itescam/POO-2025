public class Main {
    public static void main(String[] args) {
   
        Laptop miLaptop1 = new Laptop("HP", "Victus", false, 8, 512, "Azul");
        System.out.println(miLaptop1);
        Laptop miLaptop2 = new Laptop("Asus", "Tuff", true, 8, 256, "Negro");
        System.out.println(miLaptop2);
        Laptop miLaptop3 = new Laptop("Acer","Lite",false ,16);
        System.out.println(miLaptop3);
        Laptop miLaptop4 = new Laptop("Hp","Pavilion",true ,16);
        System.out.println(miLaptop4);

        Telefono miTelefono1 = new Telefono("Motorola", "Azul", true, 8, "G22");
        System.out.println(miTelefono1);
        Telefono miTelefono2 = new Telefono("Samsung", "Negro", true, 128, "A32");
        System.out.println(miTelefono2);
        Telefono miTelefono3 = new Telefono("Huawei","Rosado", false);
        System.out.println(miTelefono3);
        Telefono miTelefono4 = new Telefono("Xiaomi","Verde", true);
        System.out.println(miTelefono4);

        Mochila miMochila1 = new Mochila("ROJO","Nike", true, 5);
        System.out.println(miMochila1);
        Mochila miMochila2 = new Mochila("Rosado", "Chenson" ,true, 4);
        System.out.println(miMochila2);
        Mochila miMochila3 = new Mochila("1818",true, 3);
        System.out.println(miMochila3);
        Mochila miMochila4 = new Mochila("Everest",false, 4);
        System.out.println(miMochila4);
    }
}
